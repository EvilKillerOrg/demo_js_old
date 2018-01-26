package com.ek.xml.sax;

import java.io.IOException;

import org.xml.sax.SAXException;
import org.xml.sax.XMLReader;
import org.xml.sax.helpers.XMLReaderFactory;

public class TestSAX {
	
	public static void main(String[] args){
		//XMLReader reader =  new SAXParser();
		
		try {
			XMLReader reader = XMLReaderFactory.createXMLReader(  );
			
			TestContentHandler contentHandler = new TestContentHandler();
			
			reader.setContentHandler(contentHandler);
			reader.setErrorHandler(new TestErrorHandler());
			
			reader.parse("target/classes/personal.xml");
			
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
