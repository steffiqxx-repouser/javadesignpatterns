package com.example.pattern;

class DocumentProxy implements Document {

    private RealDocument realDocument;
    private String filename;
    private String userRole;

    public DocumentProxy(String filename, String userRole) {
        this.filename = filename;
        this.userRole = userRole;
    }

    @Override
    public void display() {

        if (userRole.equals("ADMIN")) {

            if (realDocument == null) {
                realDocument = new RealDocument(filename);
            }

            realDocument.display();

        } else {
            System.out.println(
                "Access Denied! You are not authorized."
            );
        }
    }
}