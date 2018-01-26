package com.ek.xml.jaxp;

import java.io.IOException;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

public class TestJASP {
	
	public static void main (String[] args){
		SAXParserFactory factory = SAXParserFactory.newInstance(  );
		try {
			
			SAXParser parser = factory.newSAXParser();
			parser.parse("target/classes/personal.xml", new TestDefaultHandler());
			
		} catch (ParserConfigurationException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
