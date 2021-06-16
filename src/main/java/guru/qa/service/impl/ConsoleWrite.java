package guru.qa.service.impl;

import guru.qa.service.Write;

public class ConsoleWrite implements Write {

    @Override
    public String print(String input) {
        System.out.println(input);
        return input;
    }
}
