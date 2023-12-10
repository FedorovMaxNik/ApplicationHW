package lesson_5;

import java.util.Scanner;

public class Homework5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
/*
1
1. Создать массив на 10 строк.
2. Ввести с клавиатуры 8 строк и сохранить их в массив.
3. Вывести содержимое всего массива (10 элементов) на экран в обратном порядке. Каждый элемент - с новой строки.
*/
        System.out.println("Задание 1. Введите 8 строк: ");
        int [] array = new int[10];
        for (int i = 0; i < 8; i++) {
            array [i] = scanner.nextInt();
        }
        for (int i = array.length - 1; i >= 0; i --) {
            System.out.println(array [i]);
        }

/*2
1.1. Создай массив на 10 чисел
1.2. Считай с консоли 10 чисел и заполни ими массив
2. Найти максимальное число из элементов массива
*/
        System.out.println("Задание 2. Введите 10 чисел:");
        int [] array2 = new int[10];
        for (int i = 0; i < 10; i++) {
            array2 [i] = scanner.nextInt();
        }
        int max = array2[0];
        for (int i = 0; i < array2.length; i++) {
            if (array2 [i] > max) {
                max = array2 [i];
            }
        }
        System.out.println("Максимальное значение массива " + max);


/*3
1. Создать массив на 10 строк.
2. Создать массив на 10 чисел.
3. Ввести с клавиатуры 10 строк, заполнить ими массив строк.
4. В каждую ячейку массива чисел записать длину строки из массива строк,
индекс/номер ячейки которой совпадает с текущим индексом из массива чисел.
*/
        System.out.println("Задание 3. Введите 10 строк (буквенные значения):");
        int[] number = new int[10];
        String[] str = new String[10];
        for (int i = 0; i < str.length; i++) {
            str [i] = scanner.nextLine();
            number[i] = str [i].length ();
        }
        for (int i: number) {
            System.out.println(i);
        }

/*4
1. Создать массив на 10 чисел.
2. Ввести с клавиатуры 10 чисел и записать их в массив.
3. Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.
*/
        System.out.println("Задание 4. Введите 10 чисел: ");
        int [] array4 = new int[10];
        for (int i = 0; i < 10; i++) {
            array4 [i] = scanner.nextInt();
        }
        for (int i = array4.length - 1; i >= 0; i-- ) {
            System.out.println(array4[i]);
        }

/*
5
1. Создать массив на 20 чисел.
2. Ввести в него значения с клавиатуры.
3. Создать два массива на 10 чисел каждый.
4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.
*/
        System.out.println("Задание 5. Введите 20 чисел:");
        int [] array20 = new int[20];
        for (int i = 0; i < 20; i++) {
            array20[i] = scanner.nextInt();
        }
        int [] array10a = new int[10];
        int [] array10b = new int[10];
        for (int i = 0; i < array20.length; i++) {
            if (i < array20.length / 2) {
                array10a [i] = array20 [i];
            }
            else {
                array10b [i - 10] = array20 [i];
            }
        }
            System.out.println("Массив array10a ");
            for (int i: array10a) {
                System.out.println(i);
            }
            System.out.println("Массив array10b ");
            for (int i: array10b) {
                System.out.println(i);
            }


/*
6
Создать массив на 20 чисел.
Заполнить его числами с клавиатуры.
Найти максимальное и минимальное числа в массиве.
Вывести на экран максимальное и минимальное числа через пробел.
*/

        System.out.println("Задание 6. Введите 20 чисел:");
        int[] array6 = new int[20];
        for (int i = 0; i < array6.length; i++) {
            array6[i] = scanner.nextInt();
        }
        int maximum = array6[0];
        int minimum = array6[0];
        for (int i = 0; i < array6.length; i++) {
            if (array6[i] > maximum) {
                maximum = array6[i];
            } else if (array6[i] < minimum) {
                minimum = array6[i];
            }
        }
        System.out.println("Максимальное значение в массиве - " + maximum + "." + " Минимальное значение в массиве - " + minimum);

/*7
Задача: Написать программу, которая вводит с клавиатуры 20 чисел и выводит их в убывающем порядке.
*/
        System.out.println("Задание 7. Введите 20 произвольных чисел:");
        int[] array7 = new int[20];
        for (int i = 0; i < array7.length; i++) {
            array7[i] = scanner.nextInt();
        }
        for (int i = 0; i < array7.length; i++) {
        boolean sorted = false;
        while (!sorted) {
            sorted = true;
            int remember = 0;
            for (int l = 0; l < array7.length - 1; l++) {
                if (array7 [l] < array7[l + 1]) {
                    sorted = false;
                    remember = array7[l];
                    array7 [l] = array7[l + 1];
                    array7 [l + 1] = remember;
                }
            }
        }
            System.out.println(array7[i]);
        }

    }
}
