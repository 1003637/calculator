package guru.qa.service;

public class Calculator {

    private final Reader reader;
    private Write writer;

    public Calculator(Reader reader, Write writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public String start() {
        writer.print("Введите два числа: ");
        int first = reader.readFirstArg();
        int second = reader.readSecondArg();
        writer.print("Введите оператор (+, *, -, /, ^): ");
        Operation po = reader.readMathOperation();
        int sum = po.getOperation().invoke(first, second);
        writer.print("\nРезультат:\n");
        return first + " " + po.getSymbol() + " " + second + " = " + sum;
    }
}
