package com.example.pattern;

public class PdfExporter implements DocumentExporter {

	@Override
	public void export(String content) {
		// TODO Auto-generated method stub
		System.out.println("Exporting as PDF: " + content);
	}

}
