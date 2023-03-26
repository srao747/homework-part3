import java.io.File;

import javax.xml.XMLConstants;

import javax.xml.parsers.DocumentBuilder;

import javax.xml.parsers.DocumentBuilderFactory;

import javax.xml.transform.dom.DOMSource;

import javax.xml.validation.Schema;

import javax.xml.validation.SchemaFactory;



import org.w3c.dom.Document;







public class DomParserDTD {

  public static void main(String[] args) throws Exception {

    // load XML document

    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

    DocumentBuilder builder = factory.newDocumentBuilder();

    Document doc = builder.parse("shops.xml");
    
    System.out.println("Root element: " + doc.getDocumentElement().getNodeName());


  }

}