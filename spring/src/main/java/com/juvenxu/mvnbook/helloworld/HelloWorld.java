package com.juvenxu.mvnbook.helloworld;

/**
 * Created by Eric on 4/12/2016.
 */
public class HelloWorld {

    public String sayHello(){
        return "Hello maven";
    }

    public static void main(String[] args) {
        System.out.println(new HelloWorld().sayHello());

    }
}
