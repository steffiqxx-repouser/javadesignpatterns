package com.example.pattern;

public class Main {
	 public static void main(String[] args) {

	        LegacyXmlProcessor legacy = new LegacyXmlProcessor();

	        DocumentReader adapter = new XmlDocumentAdapter(legacy);

	        DocumentApplication app = new DocumentApplication();

	        app.process(adapter, "report.xml");
	    }
}
