package com.github.sunadiary;

import org.testng.Assert;
import org.testng.annotations.Test;

public class HelloWorldGeneratorTest {
	@Test(description = "testing return 'Hello World.'")
	public void testGenerate() {

		HelloWorldGenerator helloWorldGenerator = new HelloWorldGenerator();
		String message = helloWorldGenerator.generate();

		Assert.assertNotNull(message);
		Assert.assertEquals(message, "Hello World.");

	}
}
