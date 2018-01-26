package com.ek.xml.sax;

import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

public class TestErrorHandler implements ErrorHandler {

	@Override
	public void warning(SAXParseException exception) throws SAXException {
		System.out.println("Warning happened!!!");
		//exception.printStackTrace();

	}

	@Override
	public void error(SAXParseException exception) throws SAXException {
		System.out.println("Error happened!!!");
		//exception.printStackTrace();
	}

	@Override
	public void fatalError(SAXParseException exception) throws SAXException {
		System.out.println("FatalError happened!!!");
		//exception.printStackTrace();
	}

}
