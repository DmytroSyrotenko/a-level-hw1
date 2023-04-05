package HW2;

public class HW2Task3 {
    /*Определить является ли переданное в метод число четным или нет и вывести результат в
     консоль.
     Задания 2, 3, 4 предполагают наличие метода main() и метода, который выполняет задание.*/
    public static void main(String[] args) {

        EvenOdd(99);
    }

    public static int EvenOdd(int number) {

        if (number % 2 == 0) {
            System.out.println("Chet");
        } else {
            System.out.println("Nechet");
        }
        return number;
    }
}