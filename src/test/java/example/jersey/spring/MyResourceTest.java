package example.jersey.spring;

import junit.framework.Assert;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.test.framework.JerseyTest;

public class MyResourceTest extends JerseyTest {

//    static {
//        System.setProperty("jersey.test.containerFactory", "com.sun.jersey.test.framework.spi.container.inmemory.InMemoryTestContainerFactory");
//    }
    
    public MyResourceTest() {
        super("example.jersey.spring");
    }


    @Test
    @org.junit.Test
    public void testMyResource() throws Exception {
        WebResource webResource = resource();

//        System.out.println(webResource.getURI().toString());
        
        String responseMsg = webResource.path("/myresource").get(String.class);
        
        System.out.println(responseMsg);
     
        Assert.assertTrue(responseMsg.contains("Hi there!"));
    }

    
    @BeforeClass( alwaysRun = true )
    public void setUp() throws Exception {
        super.setUp();
    }

    @AfterClass( alwaysRun = true )
    public void tearDown() throws Exception {
        super.tearDown();
    }

    
}
