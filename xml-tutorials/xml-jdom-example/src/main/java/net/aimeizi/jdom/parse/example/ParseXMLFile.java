package net.aimeizi.jdom.parse.example;

import java.io.IOException;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;

public class ParseXMLFile {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {

		SAXBuilder builder = new SAXBuilder();

		try {

			Document document = (Document) builder.build(ClassLoader.getSystemResource("file.xml"));
			Element rootNode = document.getRootElement();
			List<Element> list = rootNode.getChildren("staff");

			for (int i = 0; i < list.size(); i++) {

				Element node = (Element) list.get(i);

				System.out.println("First Name : "
						+ node.getChildText("firstname"));
				System.out.println("Last Name : "
						+ node.getChildText("lastname"));
				System.out.println("Nick Name : "
						+ node.getChildText("nickname"));
				System.out.println("Salary : " + node.getChildText("salary"));
				
				System.out.println();
			}

		} catch (IOException io) {
			System.out.println(io.getMessage());
		} catch (JDOMException jdomex) {
			System.out.println(jdomex.getMessage());
		}
	}

}
