package com.ek.xml.dom;

import java.io.IOException;

import org.apache.xerces.parsers.DOMParser;
import org.w3c.dom.DOMException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.xml.sax.SAXException;

public class TestDOM {
	
	public static void main(String[] args){
		try {
			DOMParser parser = new DOMParser(  );
			parser.parse("target/classes/personal.xml");
			Document doc = parser.getDocument(); 
			Element docEL = doc.getDocumentElement();//获得根节点
			//System.out.println(docEL.getNodeName());
			
			Element el = doc.getElementById("Big.Boss"); //根据ID值获取 xml文件需要有dtd或xsd
			Node node = el.getFirstChild();  //Element继承Node
			//Node node2 = node.getFirstChild();
			System.out.println(el.getFirstChild().getNodeName());
			
		} catch (DOMException e) {
			e.printStackTrace();
		} catch (SAXException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}