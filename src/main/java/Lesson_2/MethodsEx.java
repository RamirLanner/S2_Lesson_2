package Lesson_2;

public class MethodsEx {

    public static void inputMatrixValidator(String[][] matrix, int dimention) {
        if (matrix.length != dimention) throw new MyArraySizeException();
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length != dimention) {
                throw new MyArraySizeException();
            }
        }
        System.out.println(sumElements(matrix));
    }

    private static int sumElements(String[][] matrix) /*throws MyArrayDataException*/{
        int sumOfAllElements = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                try {
                    sumOfAllElements += Integer.parseInt(matrix[i][j]);
                } catch (NumberFormatException e){
                    throw new MyArrayDataException("Приведение элемента типа String матрицы ["+i+"]["+j+"],\n"+
                            " к типу Integer не возможно.");
                }
            }
        }
        return sumOfAllElements;
    }

}
