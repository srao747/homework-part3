import java.io.File;

import javax.xml.XMLConstants;

import javax.xml.parsers.DocumentBuilder;

import javax.xml.parsers.DocumentBuilderFactory;

import javax.xml.transform.dom.DOMSource;

import javax.xml.validation.Schema;

import javax.xml.validation.SchemaFactory;



import org.w3c.dom.Document;







public class DomParserSchema {

  public static void main(String[] args) throws Exception {

    // load XML document

    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

    DocumentBuilder builder = factory.newDocumentBuilder();

    Document doc = builder.parse("birds.xml");



    // load XSD schema

    SchemaFactory schemaFactory = SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);

    Schema schema = schemaFactory.newSchema(new File("birds.xsd"));



    try {

   schema.newValidator().validate(new DOMSource(doc));

   System.out.println("Validated Successfully");

    }

    catch(Exception e) {

    	 System.out.println("Validation Failed");

    }

  }

}



