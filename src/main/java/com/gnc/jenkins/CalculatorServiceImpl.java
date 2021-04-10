package com.gnc.jenkins;

import org.springframework.stereotype.*;

@Service
public class CalculatorServiceImpl implements CalculatorService{


    @Override
    public int addFunction(int num1, int num2) {
        return num1+num2;
    }

    @Override
    public int minusFunction(int num1, int num2) {
        return num1-num2;
    }

    @Override
    public int multiplyFunction(int num1, int num2) {
        return num1*num2;
    }

    @Override
    public int divideFunction(int num1, int divident) {

        if(divident==0){
            return 0;
        }

        return num1/divident;
    }
}
