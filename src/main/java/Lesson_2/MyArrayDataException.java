package Lesson_2;

public class MyArrayDataException extends NumberFormatException {
    public MyArrayDataException() {
        super("Приведение строки к целому числу не успешно");
    }

    public MyArrayDataException(String s) {
        super(s);
    }
}
