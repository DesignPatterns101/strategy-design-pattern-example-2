package com.sdp.beans;

public class MessageConverter {
	IMessageConverter imc;

	public void writeMessage(String message) {
		imc = new HTMLConverterImpl();
		String convertMessage = imc.converter(message);
		System.out.println(convertMessage);
		imc = new PDFConverterImpl();
		String convertMsg = imc.converter(message);
		System.out.println(convertMsg);

	}

}
