package org.simpleflatmapper.csv.io;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.Param;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.infra.Blackhole;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.nio.channels.Channels;
import java.nio.channels.FileChannel;
import java.nio.file.Files;
import java.util.Random;


@State(Scope.Benchmark)
public class InputStreamBenchmark {
    
    @Param({"16", "4096", "32178", "500000", "5000000"})
    public int nbBytes; 
    
    public File file;
    
    @Setup
    public void setUp() throws IOException {
        file = File.createTempFile("InputStreamBenchmark", ".bin");

        Random random = new Random();
        int nb = 0;
        try (OutputStream fw = new FileOutputStream(file)) {
            while(nb < nbBytes) {
                int toWrite = nbBytes - nb;
                byte[] bytes = new byte[toWrite];
                random.nextBytes(bytes);
                fw.write(bytes);
                nb += toWrite;
            }
        }
    }

    @Benchmark
    public void testFiles(Blackhole blackhole) throws IOException {
        try (InputStream reader = Files.newInputStream(file.toPath())) {
            consume(reader, blackhole);
        }
    }
    @Benchmark
    public void testFileChannelViaRandomFile(Blackhole blackhole) throws IOException {
        try (RandomAccessFile randomAccessFile = new RandomAccessFile(file, "r")) {
            try (FileChannel open = randomAccessFile.getChannel()) {
                try (InputStream inputStream = Channels.newInputStream(open)) {
                    consume(inputStream, blackhole);
                }
            }
        }
    }
    @Benchmark
    public void testFileChannel(Blackhole blackhole) throws IOException {
        try (FileChannel open = FileChannel.open(file.toPath())) {
            try (InputStream is = Channels.newInputStream(open)) {
                consume(is, blackhole);
            }
        }
    }

    @Benchmark
    public void testFileInputStream(Blackhole blackhole) throws IOException {
        try (FileInputStream is = new FileInputStream(file)) {
            consume(is, blackhole);
        }
    }

    private void consume(InputStream is, Blackhole blackhole) throws IOException {
        byte[] buffer = new byte[4096];
        
        while(is.read(buffer) != -1) {
            blackhole.consume(buffer);
        }
    }

}
