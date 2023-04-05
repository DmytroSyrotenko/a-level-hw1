package HW5;

import java.util.Arrays;

public class HW5Task3 {

    public static void main(String[] args) {


        int[][] array = {{11, 12, 13}, {14, 15, 16}, {17, 18, 19}};


        System.out.println("Original array :" + Arrays.deepToString(array));
        System.out.println("Transformed array :" + Arrays.deepToString(stringsToRows(array)));
    }

    public static int[][] stringsToRows(int[][] array) {

        int[][] newArray = new int[3][3];

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                newArray[i][j] = array[j][i];
            }
        }
        return newArray;
    }
}