package guru.qa.service.mock;

import guru.qa.service.Operation;
import guru.qa.service.Write;

public class MockWrite implements Write {

    public String print(String output) {
        return output;
    }
}
