package example.jersey.spring;

import junit.framework.Assert;

import org.testng.annotations.Test;

import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.test.framework.JerseyTest;
import com.sun.jersey.test.framework.WebAppDescriptor;
import com.sun.jersey.test.framework.spi.container.inmemory.InMemoryTestContainerFactory;

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

    
}
