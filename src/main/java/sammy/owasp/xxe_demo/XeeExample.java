package sammy.owasp.xxe_demo;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;

/**
 * XEE Example
 *
 */
public class XeeExample {
	public static void main(String[] args) throws Exception {
		InputStream xmlFile = new FileInputStream(new File("c:/sample.xml"));

		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();		
		factory.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);		
		DocumentBuilder builder = factory.newDocumentBuilder();		
		
		Document doc = builder.parse(xmlFile); // unsafe
		System.out.println(doc.getDocumentElement().getTextContent());
	}

}

