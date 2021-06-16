package guru.qa.service.mock;

import guru.qa.service.Operation;
import guru.qa.service.Reader;

public class MockPowerReader implements Reader {

    @Override
    public int readFirstArg() {
        return 2;
    }

    @Override
    public int readSecondArg() {
        return 3;
    }

    @Override
    public Operation readMathOperation() {
        return Operation.POW;
    }
}
