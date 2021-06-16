package guru.qa.service;

import guru.qa.service.impl.StringWrite;
import guru.qa.service.mock.MockDivideReader;
import guru.qa.service.mock.MockMinusReader;
import guru.qa.service.mock.MockMultReader;
import guru.qa.service.mock.MockPowerReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EnumSource;

class CalculatorTest {

    private Calculator calculator;

    @Test
    void multTest() {
        calculator = new Calculator(new MockMultReader(), new StringWrite()); // 3, 5, *
        String result = calculator.start();
        Assertions.assertEquals("3 * 5 = 15", result);
    }

    @Test
    void divideTest() {
        calculator = new Calculator(new MockDivideReader(), new StringWrite()); // 16, 4, /
        String result = calculator.start();
        Assertions.assertEquals("16 / 4 = 4", result);
    }

    @Test
    void powTest() {
        calculator = new Calculator(new MockPowerReader(), new StringWrite()); // 2, 8, *
        String result = calculator.start();
        Assertions.assertEquals("2 ^ 3 = 8", result);
    }

    @Test
    void minusTest() {
        calculator = new Calculator(new MockMinusReader(), new StringWrite()); // 7, 2, -
        String result = calculator.start();
        Assertions.assertEquals("7 - 2 = 5", result);
    }

}