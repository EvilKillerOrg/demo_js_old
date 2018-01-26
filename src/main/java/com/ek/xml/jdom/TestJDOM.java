package com.ek.xml.jdom;

import java.io.IOException;
import java.util.List;

import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
 

public class TestJDOM {
	public static void main(String[] agrs){
		SAXBuilder builder = new SAXBuilder();
		try {
			
			Document doc = builder.build("target/classes/personal.xml");
			Element el = doc.getRootElement();
			List elementList = el.getChildren();
			for (Object object : elementList) {
				Element el2 = (Element)object;
				System.out.println(el2.getName());
			}
			
		} catch (JDOMException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
