package guru.qa;

import guru.qa.service.Calculator;
import guru.qa.service.impl.ConsoleReader;
import guru.qa.service.impl.ConsoleWrite;

public class Application {

    public static void main(String[] args) {
        String result = new Calculator(new ConsoleReader(), new ConsoleWrite()).start();
        System.out.println(result);
    }
}
