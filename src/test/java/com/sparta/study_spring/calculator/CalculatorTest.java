package com.sparta.study_spring.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    @DisplayName("덧셈 테스트")
    void test1() {
        //given
        Calculator calculator = new Calculator();

        //when
        Double result = calculator.operate(8,"+", 2);

        //then
        System.out.println("!!!!result= "+result);
        Assertions.assertEquals(10, result);
    }

    @Test
    @DisplayName("나눗셈 테스트")
    void test2() {
        //given
        Calculator calculator = new Calculator();
        //when
        Double result = calculator.operate(8, "/", 2);
        //then
        System.out.println("!!!!result= "+result);
        Assertions.assertEquals(4, result);
    }
}