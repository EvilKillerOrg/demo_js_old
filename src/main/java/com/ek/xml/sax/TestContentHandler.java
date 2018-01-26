package com.ek.xml.sax;

import org.xml.sax.Attributes;
import org.xml.sax.ContentHandler;
import org.xml.sax.Locator;
import org.xml.sax.SAXException;

public class TestContentHandler implements ContentHandler {
	//SAX就是靠ContentHandler来捕获数据的
	@Override
	public void setDocumentLocator(Locator locator) {
		System.out.println("setDocumentLocator");
	}

	@Override
	public void startDocument() throws SAXException {
		System.out.println("startDocument");
	}

	@Override
	public void endDocument() throws SAXException {
		System.out.println("endDocument");
	}

	@Override
	public void startPrefixMapping(String prefix, String uri) throws SAXException {
		System.out.println("startPrefixMapping");
	}

	@Override
	public void endPrefixMapping(String prefix) throws SAXException {
		System.out.println("endPrefixMapping");
	}

	@Override
	public void startElement(String uri, String localName, String qName, Attributes atts) throws SAXException {
		//uri是名称空间 
		System.out.println(" 1: "+uri+" , 2: "+localName+" , 3: "+qName);
		
		if(localName.equals("person")){
			System.out.println("person标签 id的值: "+atts.getValue("id"));
		}
		
		System.out.println("startElement");
	}

	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
		System.out.println("endElement");
	}

	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		System.out.println("characters");
	}

	@Override
	public void ignorableWhitespace(char[] ch, int start, int length) throws SAXException {
		System.out.println("ignorableWhitespace");
	}

	@Override
	public void processingInstruction(String target, String data) throws SAXException {
		System.out.println("processingInstruction");
	}

	@Override
	public void skippedEntity(String name) throws SAXException {
		System.out.println("skippedEntity");
	}
 

}