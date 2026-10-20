package com.example.pattern;

public class XmlDocumentAdapter implements DocumentReader {

	 private final LegacyXmlProcessor legacyProcessor;

	    public XmlDocumentAdapter(LegacyXmlProcessor legacyProcessor) {
	        this.legacyProcessor = legacyProcessor;
	    }

	    @Override
	    public String readDocument(String filePath) {
	        // Translate the expected operation
	        // into the legacy operation.
	        return legacyProcessor.loadXmlFile(filePath);
	    }
}
