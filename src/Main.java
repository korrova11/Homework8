import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] whites = new int[3];
        whites[0] = 1;
        whites[1] = 2;
        whites[2] = 3;

        double[] reds = {1.57, 7.654, 9.986};

        boolean[] greens = {true, false, true};


    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] whites = new int[3];
        whites[0] = 1;
        whites[1] = 2;
        whites[2] = 3;
        // выводим в консоль элементы первого массива
        for (int index = 0; index < whites.length; index++) {
            if (index == whites.length - 1) {
                System.out.println(whites[index]);
                break;
            }
            System.out.print(whites[index] + ",");
        }


        double[] reds = {1.57, 7.654, 9.986};
        // выводим в консоль элементы второго массива другим способом
        System.out.println(Arrays.toString(reds));

        boolean[] greens = {true, false, true};
        //выводим в консоль элементы третьего массива еще одним способом
        for (int index = 0; index < (greens.length - 1); index++) {
            System.out.print(greens[index] + ",");
        }
        System.out.println(greens[greens.length - 1]);
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] whites = new int[3];
        whites[0] = 1;
        whites[1] = 2;
        whites[2] = 3;
        // выводим в консоль элементы первого массива в обратном порядке
        for (int index = whites.length - 1; index > 0; index--) {

            System.out.print(whites[index] + ",");
        }
        System.out.println(whites[0]);


        double[] reds = {1.57, 7.654, 9.986};
        // выводим в консоль элементы второго массива в обратном порядке
        for (int index = reds.length - 1; index > 0; index--) {

            System.out.print(reds[index] + ",");
        }
        System.out.println(reds[0]);


        boolean[] greens = {false, true, true};
        //выводим в консоль элементы третьего массива в обратном порядке
        for (int index = greens.length - 1; index > 0; index--) {

            System.out.print(greens[index] + ",");
        }
        System.out.println(greens[0]);


    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] whites = new int[3];
        whites[0] = 1;
        whites[1] = 2;
        whites[2] = 3;
        for (int index = 0; index < whites.length; index++) {
            if ((whites[index] % 2) != 0) {
                whites[index] += 1;
            }
        }
            System.out.println(Arrays.toString(whites));



    }
}
