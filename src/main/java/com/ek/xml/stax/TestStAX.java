package com.ek.xml.stax;

import java.io.InputStream;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public class TestStAX {

	public static void main(String[] args) {
		InputStream input = TestStAX.class.getClassLoader().getResourceAsStream("personal.xml");
		XMLInputFactory inputFactory = XMLInputFactory.newInstance();
		
		try {
			XMLStreamReader reader = inputFactory.createXMLStreamReader(input);
			while(reader.hasNext()){
				int l = reader.next();
			}
			 
		} catch (XMLStreamException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
