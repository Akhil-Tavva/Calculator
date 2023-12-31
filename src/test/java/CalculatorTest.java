// package org.example;
import org.example.Main;
import org.junit.*;

public class CalculatorTest {
    private Main calculator;
    @Before
    public void setUp() { calculator = new Main(); }

    @Test
    public void test1(){
        int a = 2;
        int b = 1;
        int expectedResult = 3;
        Assert.assertEquals(expectedResult, calculator.add(a, b));
    }

    @Test
    public void test5(){
        int a = 2;
        int b = 7;
        int expectedResult = 5;
        Assert.assertNotEquals(expectedResult, calculator.add(a, b));
    }

    @Test
    public void test2(){
        int a = 2;
        int b = 1;
        int expectedResult = 2;
        Assert.assertNotEquals(expectedResult, calculator.sub(a, b));
    }

    @Test
    public void test3(){
        int a = 2;
        int b = 1;
        int expectedResult = 2;
        Assert.assertEquals(expectedResult, calculator.mul(a, b));
    }

    @Test
    public void test4(){
        int a = 2;
        int b = 1;
        int expectedResult = 3;
        Assert.assertNotEquals(expectedResult, calculator.div(a, b));
    }
}
