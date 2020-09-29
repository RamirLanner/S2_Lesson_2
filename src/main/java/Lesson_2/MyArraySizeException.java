package Lesson_2;

public class MyArraySizeException extends RuntimeException{
    public MyArraySizeException() {
        super("Размерность массива не равна 4х4");
    }
}
