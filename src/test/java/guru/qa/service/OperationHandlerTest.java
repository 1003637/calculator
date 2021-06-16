package guru.qa.service;

import guru.qa.service.impl.*;
import guru.qa.service.mock.MockMultReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class OperationHandlerTest {

    private OperationHandler handler;

    @Test
    void sumTest() {
        handler = new SumOperationHandler();
        int sum = handler.invoke(3, 5);
        Assertions.assertEquals(8, sum);
    }

    @Test
    void multTest() {
        handler = new MultOperationHandler();
        Assertions.assertEquals(15, handler.invoke(3, 5));
    }

    @Test
    void minusTest() {
        handler = new MinusOperationHandler();
        Assertions.assertEquals(4, handler.invoke(10, 6));
    }

    @Test
    void divideTest() {
        handler  = new DivideOperationHandler(); // 16, 4, /
        Assertions.assertEquals(4, handler.invoke(16, 4));
    }

    @Test
    void powTest() {
        handler  = new PowerOperationHandler(); // 2, 3, ^
        Assertions.assertEquals(8, handler.invoke(2, 3));
    }
}