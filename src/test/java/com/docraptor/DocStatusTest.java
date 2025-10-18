package com.docraptor;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for DocStatus model
 */
public class DocStatusTest {

    @Test
    public void testDocStatusCreation() {
        DocStatus status = new DocStatus();
        assertNotNull("DocStatus object should be created", status);
    }

    @Test
    public void testStatus() {
        DocStatus status = new DocStatus();
        String statusValue = "completed";
        status.setStatus(statusValue);
        assertEquals("Status should match", statusValue, status.getStatus());
        
        status.setStatus("failed");
        assertEquals("Status should be failed", "failed", status.getStatus());
    }

    @Test
    public void testDownloadUrl() {
        DocStatus status = new DocStatus();
        String downloadUrl = "https://example.com/download/123";
        status.setDownloadUrl(downloadUrl);
        assertEquals("Download URL should match", downloadUrl, status.getDownloadUrl());
    }

    @Test
    public void testDownloadId() {
        DocStatus status = new DocStatus();
        String downloadId = "download-123";
        status.setDownloadId(downloadId);
        assertEquals("Download ID should match", downloadId, status.getDownloadId());
    }

    @Test
    public void testMessage() {
        DocStatus status = new DocStatus();
        String message = "Document processing completed successfully";
        status.setMessage(message);
        assertEquals("Message should match", message, status.getMessage());
    }

    @Test
    public void testNumberOfPages() {
        DocStatus status = new DocStatus();
        Integer pages = 10;
        status.setNumberOfPages(pages);
        assertEquals("Number of pages should match", pages, status.getNumberOfPages());
    }

    @Test
    public void testValidationErrors() {
        DocStatus status = new DocStatus();
        String errors = "Invalid HTML structure";
        status.setValidationErrors(errors);
        assertEquals("Validation errors should match", errors, status.getValidationErrors());
    }
}
