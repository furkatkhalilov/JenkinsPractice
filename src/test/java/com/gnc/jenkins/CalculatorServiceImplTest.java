package com.gnc.jenkins;



import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class CalculatorServiceImplTest {

    @Autowired
    CalculatorService calculatorService;
    @Test
    void addFunction() {

        int num1 = 5;
        int num2 = 10;
        int expectedResult = 5+10;
        int result = calculatorService.addFunction(5, 10);

        Assertions.assertEquals(result, expectedResult);

    }

    @Test
    void divideFunction() {
        int num1 = 10;
        int num2 = 5;
        int expectedResult = 10/5;
        int result = calculatorService.divideFunction(10, 5);

        Assertions.assertEquals(result, expectedResult);
    }

    @Test
    void divideFunctionWith0Divident() {
        int num1 = 10;
        int num2 = 0;
        int expectedResult = 0;
        int result = calculatorService.divideFunction(10, 0);

        Assertions.assertEquals(result, expectedResult);
    }

    @Test
    void multiplyFunction() {
        int num1 = 5;
        int num2 = 10;
        int expectedResult = 5*10;
        int result = calculatorService.multiplyFunction(5, 10);

        Assertions.assertEquals(result, expectedResult);

    }
    @Test
    void subtractFunction() {
        int num1 = 5;
        int num2 = 10;
        int expectedResult = 5-10;
        int result = calculatorService.minusFunction(5, 10);

        Assertions.assertEquals(result, expectedResult);

    }
}