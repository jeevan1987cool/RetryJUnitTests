package org.example.steps;

import io.cucumber.java.en.Given;

import static org.junit.Assert.assertTrue;

public class MyStepdefs {
    @Given("^this test fails$")
    public void thisTestFails() {
        System.out.println("\n"+"\n"+"\n"+"This is failing"+"\n"+"\n"+"\n"+"\n");
        assertTrue(1>3);
    }
}
