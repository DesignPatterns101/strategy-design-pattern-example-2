package com.sdp.beans;

public class HTMLConverterImpl implements IMessageConverter {

	public String converter(String message) {
		// TODO Auto-generated method stub
		return "<HTML><BODY>" + message + "</HTML></BODY>";
	}

}
