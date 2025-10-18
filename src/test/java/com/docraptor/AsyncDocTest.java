package com.docraptor;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for AsyncDoc model
 */
public class AsyncDocTest {

    @Test
    public void testAsyncDocCreation() {
        AsyncDoc asyncDoc = new AsyncDoc();
        assertNotNull("AsyncDoc object should be created", asyncDoc);
    }

    @Test
    public void testStatusId() {
        AsyncDoc asyncDoc = new AsyncDoc();
        String statusId = "test-status-123";
        asyncDoc.setStatusId(statusId);
        assertEquals("Status ID should match", statusId, asyncDoc.getStatusId());
    }
}
