package org.example;

import org.junit.After;
import org.junit.Before;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator cal;
    @Before
    public void setUp(){
        cal = new Calculator();
    }

    @org.junit.Test
    public void when5AddTo10AsStringThenResult15() {
        double expected = 15;
        double result = cal.add("10", "5");
        assertEquals(expected, result, 0.001);
    }
    @org.junit.Test
    public void whenAdd10To5ThenResult15() {
        double expected = 15;
        double result = cal.add(10,5);
        assertEquals(expected,result,0.001);
    }

    @org.junit.Test
    public void whenMultiply3By5ThenResult15() {
        double expected = 15;
        double result = cal.mult(3,5);
        assertEquals(expected,result,0.001);
    }

    @org.junit.Test
    public void whenMultiply3By5AsStringThenResult15() {
        double expected = 15;
        double result = cal.mult("3","5");
        assertEquals(expected,result,0.001);
    }
    @org.junit.Test
    public void whenDivide15By5ThenResult3() {
        double expected = 3;
        double result = cal.div(15,5);
        assertEquals(expected,result,0.001);
    }

    @org.junit.Test
    public void whenDivide15By5AsStringThenResult3() {
        double expected = 3;
        double result = cal.div("15","5");
        assertEquals(expected,result,0.001);
    }

    @org.junit.Test
    public void whenSquare5ThenResult25() {
        double expected = 25;
        double result = cal.exp(5);
        assertEquals(expected,result,0.001);
    }

    @org.junit.Test
    public void whenSquare5AsStringThenResult25() {
        double expected = 25;
        double result = cal.exp("5");
        assertEquals(expected,result,0.001);
    }
    @After
    public void close(){
        cal = null;
    }
}