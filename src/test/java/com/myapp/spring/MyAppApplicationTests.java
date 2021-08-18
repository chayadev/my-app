package com.myapp.spring;

//import org.testng.annotations.Test;
//import org.testng.Assert;
import org.testng.AssertJUnit;
import static org.testng.AssertJUnit.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.testng.AssertJUnit;
import static org.assertj.core.api.Assertions.fail;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/**
 * Unit test for simple App.
 */
@Test
public class MyAppApplicationTests
{

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeMethod
	public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @Test
	public void testAppConstructor() {
        try {
           // new MyAppApplication();
        } catch (Exception e) {
            Assert.fail("Construction failed.");
        }
    }

    @Test
	public void testAppMain()
    {
       // MyAppApplication.main(null);
        try {
            AssertJUnit.assertEquals("Hello World!" + System.getProperty("line.separator"), outContent.toString());
        } catch (AssertionError e) {
            Assert.fail("\"message\" is not \"Hello World!\"");
        }
    }

    private static void main(Object object) {
		// TODO Auto-generated method stub
		
	}

	@AfterMethod
	public void cleanUpStreams() {
        System.setOut(null);
    }

}
