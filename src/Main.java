import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] number = new int[3];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        double[] numberFractional = {1.57, 7.654, 9.986};
        int[] apple = {1, 3, 4, 5, 76, 87, 98};

        System.out.println(number[1]);
        System.out.println(numberFractional[2]);
        System.out.println(apple[0]);
    }


    public static void task2() {
        System.out.println("Задача 2");
        int[] number = new int[12];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        for (int i = 0; i < 12; i++) {
            System.out.print(number[i]);
            if (i != number.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();
        double[] numberFractional = {1.57, 7.654, 9.986};
        for (int i = 0; i < numberFractional.length; i++) {
            System.out.print(numberFractional[i]);
            if (i != numberFractional.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();
        int[] apple = {1, 3, 4, 5, 76, 87, 98};
        for (int i = 0; i < apple.length; i++) {
            System.out.print(apple[i]);
            if (i != apple.length - 1){
                System.out.print(", ");
            }
        }
        System.out.println();


    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] number = new int[12];
        number[0] = 1;
        number[1] = 2;
        number[2] = 3;
        for (int i = number.length-1; i >= 0; i--) {
            System.out.print(number[i]);
            if (i != 0){
                System.out.print(", ");
            }
        }
        System.out.println();
        double[] numberFractional = {1.57, 7.654, 9.986};
        for (int i = numberFractional.length-1; i >= 0; i--) {
            System.out.print(numberFractional[i]);
            if (i != 0){
                System.out.print(", ");
            }
        }
        System.out.println();
        int[] apple = {1, 3, 4, 5, 76, 87, 98};
        for (int i = apple.length-1; i >= 0; i--) {
            System.out.print(apple[i]);
            if (i != 0){
                System.out.print(", ");
            }
        }
        System.out.println();

    }
    public static void task4() {
        System.out.println("Задача 4");
        int[] number = {1, 2, 3, 4, 5, 6, 7, 8,9,10};
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 != 0){
                number[i] += 1;
            }

        }
        System.out.println(Arrays.toString(number));
            }

            





}