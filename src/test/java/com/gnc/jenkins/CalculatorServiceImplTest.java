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
    }
}