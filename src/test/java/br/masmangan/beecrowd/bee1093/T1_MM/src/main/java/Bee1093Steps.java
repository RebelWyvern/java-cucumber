package br.masmangan.beecrowd.bee1093.T1_MM.src.main.java;

import io.cucumber.core.cli.Main;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.io.*;
import java.nio.charset.StandardCharsets;

import static org.junit.Assert.assertEquals;

public class Bee1093Steps {

    private String input;
    private String actual;

    @Given("The input is")
    public void input_is(String input) {
        this.input = input;
    }

    @When("Program runs")
    public void program_runs() throws IOException {
        InputStream inputStream = new ByteArrayInputStream(input.getBytes(StandardCharsets.UTF_8));

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        PrintStream outputStream = new PrintStream(byteArrayOutputStream);

        PrintStream previousOut = System.out;
        InputStream previousIn = System.in;

        System.setIn(inputStream);
        System.setOut(outputStream);

        Bee1093.main(null);

        actual = byteArrayOutputStream.toString();

        inputStream.close();
        outputStream.close();

        System.setOut(previousOut);
        System.setIn(previousIn);
    }

    @Then("The output should be")
    public void output_should_be(String expected) {
        assertEquals(expected, actual);
    }
}
