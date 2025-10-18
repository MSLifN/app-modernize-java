package com.docraptor;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for Doc model
 */
public class DocTest {

    @Test
    public void testDocCreation() {
        Doc doc = new Doc();
        assertNotNull("Doc object should be created", doc);
    }

    @Test
    public void testDocumentContent() {
        Doc doc = new Doc();
        String content = "<html><body>Test Content</body></html>";
        doc.setDocumentContent(content);
        assertEquals("Document content should match", content, doc.getDocumentContent());
    }

    @Test
    public void testDocumentType() {
        Doc doc = new Doc();
        doc.setDocumentType(Doc.DocumentTypeEnum.PDF);
        assertEquals("Document type should be PDF", Doc.DocumentTypeEnum.PDF, doc.getDocumentType());
        
        doc.setDocumentType(Doc.DocumentTypeEnum.XLS);
        assertEquals("Document type should be XLS", Doc.DocumentTypeEnum.XLS, doc.getDocumentType());
        
        doc.setDocumentType(Doc.DocumentTypeEnum.XLSX);
        assertEquals("Document type should be XLSX", Doc.DocumentTypeEnum.XLSX, doc.getDocumentType());
    }

    @Test
    public void testDocumentUrl() {
        Doc doc = new Doc();
        String url = "https://example.com/document.html";
        doc.setDocumentUrl(url);
        assertEquals("Document URL should match", url, doc.getDocumentUrl());
    }

    @Test
    public void testDocumentName() {
        Doc doc = new Doc();
        String name = "test-document.pdf";
        doc.setName(name);
        assertEquals("Document name should match", name, doc.getName());
    }

    @Test
    public void testTestFlag() {
        Doc doc = new Doc();
        doc.setTest(true);
        assertTrue("Test flag should be true", doc.getTest());
        
        doc.setTest(false);
        assertFalse("Test flag should be false", doc.getTest());
    }

    @Test
    public void testJavascriptFlag() {
        Doc doc = new Doc();
        doc.setJavascript(true);
        assertTrue("Javascript flag should be true", doc.getJavascript());
        
        doc.setJavascript(false);
        assertFalse("Javascript flag should be false", doc.getJavascript());
    }

    @Test
    public void testPrinceOptions() {
        Doc doc = new Doc();
        PrinceOptions options = new PrinceOptions();
        options.setMedia("screen");
        doc.setPrinceOptions(options);
        assertNotNull("Prince options should be set", doc.getPrinceOptions());
        assertEquals("Media type should match", "screen", doc.getPrinceOptions().getMedia());
    }

    @Test
    public void testCallbackUrl() {
        Doc doc = new Doc();
        String callbackUrl = "https://example.com/callback";
        doc.setCallbackUrl(callbackUrl);
        assertEquals("Callback URL should match", callbackUrl, doc.getCallbackUrl());
    }
}
