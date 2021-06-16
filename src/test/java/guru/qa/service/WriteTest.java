package guru.qa.service;

import guru.qa.service.mock.MockPowerReader;
import guru.qa.service.mock.MockWrite;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WriteTest {

    Calculator calculator;

    @Test
    public void testWrite() {
        MockPowerReader mockPowerReader = new MockPowerReader();
        MockWrite mockWrite = new MockWrite();
        calculator = new Calculator(mockPowerReader, mockWrite);
        String result = calculator.start();
        Assertions.assertEquals(mockWrite.print(Texts.ENTER2DIGITS.getText()), "Введите два числа: ");
        Assertions.assertEquals(mockWrite.print(Texts.ENTER2OPERATORS.getText()), "Введите оператор (+, *, -, /, ^): ");
        Assertions.assertEquals(mockWrite.print(Texts.RESULT.getText()) + result, "\nРезультат:\n" + "2 ^ 3 = 8");

    }
}
