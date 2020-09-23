package Lesson_2;

public class Main {
    public static void main(String[] args) {
        //String[][] matrix = new String[4][4];
        String[][] matrix = {{"hh","2","3","-50"}, {"3","4","5","6"}, {"3","4","5","6"}, {"4","5","6","12"}};

        //Мы даем пользователю выбрать с какой размерностью сравнивать, наш случай это 4
        MethodsEx.inputMatrixValidator(matrix, 4);


    }
}
