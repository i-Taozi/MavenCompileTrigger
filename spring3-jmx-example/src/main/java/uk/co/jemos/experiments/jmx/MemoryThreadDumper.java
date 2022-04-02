package uk.co.jemos.experiments.jmx;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.lang.management.ManagementFactory;
import java.lang.management.ThreadInfo;
import java.lang.management.ThreadMXBean;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Component;

/**
 * @author mtedone
 * 
 */
@Component
public class MemoryThreadDumper {

	// ------------------->> Constants

	/** The application logger */
	private static final org.apache.log4j.Logger LOG = org.apache.log4j.Logger
			.getLogger(MemoryThreadDumper.class);

	// ------------------->> Instance / Static variables

	// ------------------->> Constructors

	// ------------------->> Public methods

	/**
	 * It dumps the Thread stacks
	 * 
	 * @throws IOException
	 */
	public void dumpStacks() {

		// choose our dump-file
		String stackFileName = "C:/tmp/stacks.dump";

		ThreadMXBean mxBean = ManagementFactory.getThreadMXBean();
		ThreadInfo[] threadInfos = mxBean.getThreadInfo(
				mxBean.getAllThreadIds(), 0);
		Map<Long, ThreadInfo> threadInfoMap = new HashMap<Long, ThreadInfo>();
		for (ThreadInfo threadInfo : threadInfos) {
			threadInfoMap.put(threadInfo.getThreadId(), threadInfo);
		}

		File dumpFile = new File(stackFileName);
		BufferedWriter writer = null;
		try {
			writer = new BufferedWriter(new FileWriter(dumpFile));
			this.dumpTraces(mxBean, threadInfoMap, writer);

			LOG.warn("Stacks dumped to: " + stackFileName);

		} catch (IOException e) {
			throw new IllegalStateException(
					"An exception occurred while writing the thread dump");
		} finally {
			IOUtils.closeQuietly(writer);
		}

	}

	// ------------------->> Getters / Setters

	// ------------------->> Private methods

	private void dumpTraces(ThreadMXBean mxBean,
			Map<Long, ThreadInfo> threadInfoMap, Writer writer)
			throws IOException {
		Map<Thread, StackTraceElement[]> stacks = Thread.getAllStackTraces();
		writer.write("Dump of "
				+ stacks.size()
				+ " thread at "
				+ new SimpleDateFormat("yyyy/MM/dd HH:mm:ss z")
						.format(new Date(System.currentTimeMillis())) + "\n\n");
		for (Map.Entry<Thread, StackTraceElement[]> entry : stacks.entrySet()) {
			Thread thread = entry.getKey();
			writer.write("\"" + thread.getName() + "\" prio="
					+ thread.getPriority() + " tid=" + thread.getId() + " "
					+ thread.getState() + " "
					+ (thread.isDaemon() ? "deamon" : "worker") + "\n");
			ThreadInfo threadInfo = threadInfoMap.get(thread.getId());
			if (threadInfo != null) {
				writer.write("    native=" + threadInfo.isInNative()
						+ ", suspended=" + threadInfo.isSuspended()
						+ ", block=" + threadInfo.getBlockedCount() + ", wait="
						+ threadInfo.getWaitedCount() + "\n");
				writer.write("    lock=" + threadInfo.getLockName()
						+ " owned by " + threadInfo.getLockOwnerName() + " ("
						+ threadInfo.getLockOwnerId() + "), cpu="
						+ mxBean.getThreadCpuTime(threadInfo.getThreadId())
						/ 1000000L + ", user="
						+ mxBean.getThreadUserTime(threadInfo.getThreadId())
						/ 1000000L + "\n");
			}
			for (StackTraceElement element : entry.getValue()) {
				writer.write("        ");
				writer.write(element.toString());
				writer.write("\n");
			}
			writer.write("\n");
		}
	}

	// ------------------->> equals() / hashcode() / toString()

	// ------------------->> Inner classes

}
