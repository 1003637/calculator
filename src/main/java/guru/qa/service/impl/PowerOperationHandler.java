package guru.qa.service.impl;

import guru.qa.service.OperationHandler;

import java.lang.Math.*;

public class PowerOperationHandler implements OperationHandler {

    @Override
    public int invoke(int first, int second) {
        return (int) Math.pow(first, second);
    }
}
