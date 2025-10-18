package com.docraptor;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Unit tests for PrinceOptions model
 */
public class PrinceOptionsTest {

    @Test
    public void testPrinceOptionsCreation() {
        PrinceOptions options = new PrinceOptions();
        assertNotNull("PrinceOptions object should be created", options);
    }

    @Test
    public void testBaseurl() {
        PrinceOptions options = new PrinceOptions();
        String baseurl = "https://example.com";
        options.setBaseurl(baseurl);
        assertEquals("Base URL should match", baseurl, options.getBaseurl());
    }

    @Test
    public void testMedia() {
        PrinceOptions options = new PrinceOptions();
        String media = "screen";
        options.setMedia(media);
        assertEquals("Media should match", media, options.getMedia());
        
        options.setMedia("print");
        assertEquals("Media should be print", "print", options.getMedia());
    }

    @Test
    public void testInsecure() {
        PrinceOptions options = new PrinceOptions();
        options.setInsecure(true);
        assertTrue("Insecure flag should be true", options.getInsecure());
        
        options.setInsecure(false);
        assertFalse("Insecure flag should be false", options.getInsecure());
    }

    @Test
    public void testNoXinclude() {
        PrinceOptions options = new PrinceOptions();
        options.setNoXinclude(true);
        assertTrue("NoXinclude flag should be true", options.getNoXinclude());
        
        options.setNoXinclude(false);
        assertFalse("NoXinclude flag should be false", options.getNoXinclude());
    }

    @Test
    public void testNoNetwork() {
        PrinceOptions options = new PrinceOptions();
        options.setNoNetwork(true);
        assertTrue("NoNetwork flag should be true", options.getNoNetwork());
        
        options.setNoNetwork(false);
        assertFalse("NoNetwork flag should be false", options.getNoNetwork());
    }

    @Test
    public void testDebug() {
        PrinceOptions options = new PrinceOptions();
        options.setDebug(true);
        assertTrue("Debug flag should be true", options.getDebug());
        
        options.setDebug(false);
        assertFalse("Debug flag should be false", options.getDebug());
    }
}
