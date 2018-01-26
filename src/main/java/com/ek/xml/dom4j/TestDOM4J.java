package com.ek.xml.dom4j;

import java.util.Iterator;

import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

public class TestDOM4J {

	public static void main(String[] args) {
		SAXReader reader = new SAXReader(  );
		try {
			Document doc = reader.read("target/classes/personal.xml");
			Element el = doc.getRootElement();
			Iterator it = el.elementIterator();
			while(it.hasNext()){
				Element el2 = (Element)it.next();
				System.out.println(el2.getName());
			}
		} catch (DocumentException e) {
			e.printStackTrace();
		}


	}

}
