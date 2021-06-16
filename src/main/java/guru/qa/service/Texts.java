package guru.qa.service;

public enum Texts {
    ENTER2DIGITS("Введите два числа: "),
    ENTER2OPERATORS("Введите оператор (+, *, -, /, ^): "),
    RESULT("\nРезультат:\n");

    private final String text;

    Texts(String text) {
        this.text = text;
    }

    String getText() {
        return text;
    }
}
