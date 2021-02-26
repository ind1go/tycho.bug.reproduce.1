package dev.bencox.tychobugreproduce1;

import javax.xml.bind.JAXBException;

public class ClassUsingJAXB {

	public static void main(String[] args) {
		
		new JAXBException("Constructing this exception purely so there's a usage of javax.xml.bind in this class.");
		
	}
	
}
