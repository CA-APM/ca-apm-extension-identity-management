package com.ca.apm.extensions.trace;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Run your unit tests from here.
 * You can also use JMockit for unit tests (https://cawiki.ca.com/x/P468Kg).
 * 
 * @author ${user.name}
 *
 */
public class MyTest {
	@Before
	public void setUp() throws Exception {
	    // set up test environment
	}

	@After
	public void tearDown() throws Exception {
        // tear down test environment
	}

	@Test
	public void test() {
	    // test your code here!
        System.err.println("\nDon't forget to write your own test!\n");
        Assert.assertTrue("Don't forget to write your own test!", true);
	}

}
