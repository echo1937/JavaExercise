package com.juvenxu.mvn.helloworld;

import com.juvenxu.mvnbook.helloworld.HelloWorld;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Eric on 4/12/2016.
 */
public class HelloTest {

    @Test
    public void testSayHello() {
        HelloWorld helloWorld = new HelloWorld();
        String result = helloWorld.sayHello();
        assertEquals("Hello maven", result);
    }
}