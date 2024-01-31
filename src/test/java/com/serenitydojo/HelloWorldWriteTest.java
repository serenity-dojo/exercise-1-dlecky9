package com.serenitydojo;

import org.junit.Test;

import java.util.Locale;

public class HelloWorldWriteTest {
    @Test
    public void shouldWriteHelloWorldToTheConsole(){
        HelloWorldWriter writer = new HelloWorldWriter();
        writer.writeHelloWorld();
    }

    @Test
    public void declaringNumericVariable(){
        final int ageThisYear = 42;
        int ageNextYear = ageThisYear + 1;
        System.out.println("age = " + ageNextYear);
    }

    @Test
    public void workingWithStrings(){
        String firstName = "Sarah-Jane";
        String upperCaseFirstName = firstName.toUpperCase(Locale.ROOT);
        String replaceFirstName = firstName.replace("Sarah", "Mary");
        System.out.println(upperCaseFirstName);
        System.out.println(replaceFirstName);
    }
}
