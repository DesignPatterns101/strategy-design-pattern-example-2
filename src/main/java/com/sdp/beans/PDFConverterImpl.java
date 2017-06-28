package com.sdp.beans;

public class PDFConverterImpl  implements IMessageConverter{

	public String converter(String message) {
		// TODO Auto-generated method stub
		return "<PDF>" + message + "</PDF>";
	}

}
