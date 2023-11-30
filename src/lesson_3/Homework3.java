package lesson_3;
import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {


/*
ЗАГОЛОВОК ЗАДАНИЯ
Алгоритмические структуры
ТЕКСТ ЗАДАНИЯ
1 Написать программу, чтобы она:
- выводил на экран строку "Число меньше 5", если число, которое мы ей подадим меньше 5,
- выводил строку "Число больше 5", если число, которое мы ей подадим больше 5,
- выводил строку "Число равно 5", если число, которое мы ей подадим равен 5.
*/
        Scanner scan = new Scanner(System.in);
        int Numb = scan.nextInt();
        if (Numb <5) {
            System.out.println("Число меньше 5");
        } else if (Numb > 5) {
            System.out.println("Число больше 5");
        } else if (Numb == 5) {
            System.out.println("Число равно 5");
        }

/*2 Напиши программу. которая будет проверять попало ли целое число, которое мы ей подадим
в интервал от 50 до 100 и сообщить результат на экран в следующем виде:
"Число number не содержится в интервале." или "Число number содержится в интервале.", где number - число, которое мы ей подадим.
*/

        Scanner scan2 = new Scanner(System.in);
        int Number = scan2.nextInt();
        if (Number >= 50 && Number <= 100) {
            System.out.println("Число " + Number+ " содержится в интервале.");
        } else {
            System.out.println("Число " + Number+ " не содержится в интервале.");
        }

/*
3 Напиши программу, которая по номеру месяца должна определить время года (зима, весна, лето, осень) и вывести на экран.
Пример для номера месяца 2:
зима
Пример для номера месяца 5:
весна
*/

    Scanner scan3 = new Scanner(System.in);
    int weather = scan3.nextInt();
        switch (weather) {
            case (1):
                System.out.println("Зима");
                break;
            case (2):
                System.out.println("Зима");
                break;
            case (3):
                System.out.println("Весна");
                break;
            case (4):
                System.out.println("Весна");
                break;
            case (5):
                System.out.println("Весна");
                break;
            case (6):
                System.out.println("Лето");
                break;
            case (7):
                System.out.println("Лето");
                break;
            case (8):
                System.out.println("Лето");
                break;
            case (9):
                System.out.println("Осень");
                break;
            case (10):
                System.out.println("Осень");
                break;
            case (11):
                System.out.println("Осень");
                break;
            case (12):
                System.out.println("Зима");
                break;
            default:
                System.out.println("В году 12 месяцев, введите число от 1 до 12");
        }


/*
4
Написать программу, которая будет проверять число, которое мы подадим ей.
Если число положительное, то увеличить его в два раза.
Если число отрицательное, то прибавить единицу.
Если введенное число равно нулю, необходимо вывести ноль.
Вывести результат в консоль.
*/
        Scanner scan4 = new Scanner(System.in);
        System.out.println("Введите число:");
        int CheckNumber = scan4.nextInt();
        if (CheckNumber > 0) {
            System.out.println("Число положительное, увеличиваем его в 2 раза = " + CheckNumber*2);
        }
        if (CheckNumber < 0) {
            System.out.println("Число отрицательное, прибавляем к нему единицу = " + (CheckNumber+1));
        }
        else if (CheckNumber == 0) {
            System.out.println("0");
        }

/*
6
Написать программу, которая, в зависимости от того числа, которое мы ей подадим (год)
, будет определять количество дней в году. Результат вывести на экран в следующем виде:
количество дней в этом году: x
, где
х - 366 для високосного года,
х - 365 для обычного года.
Подсказка:
В високосном году - 366 дней, тогда как в обычном - 365.
1) если год делится без остатка на 400 это високосный год;
2) в оставшихся годах после этого, если год делится без остатка на 100, то это обычный год;
3) в оставшихся годах после этого, если год делится без остатка на 4, то это високосный год;
4) все оставшиеся года невисокосные.
Так, годы 1700, 1800 и 1900 не являются високосными, так как они кратны 100 и не кратны 400.
Годы 1600 и 2000 - високосные, так как они кратны 100 и кратны 400.
Годы 2100, 2200 и 2300 - не високосные.
*/

        Scanner scan6 = new Scanner(System.in);
        System.out.println("Введите число:");
        int year = scan6.nextInt();
        int a400 = year%400;
        int b100 = a400%100;
        int c4 = b100%4;
        if (a400 == 0) {
            System.out.println("В " + year + " году 366 дней");
        }
        else if (b100 == 0) {
            System.out.println("В " + year + " году 365 дней");
        }
        else if (c4 == 0) {
            System.out.println("В " + year + " году 366 дней");
        }


/*
    7
Объявить три переменных (a, b, c) - стороны предполагаемого треугольника.
Определить возможность существования треугольника по сторонам.
Результат вывести на экран в следующем виде:
"Треугольник существует." - если треугольник с такими сторонами существует.
"Треугольник не существует." - если треугольник с такими сторонами не существует.
Подсказка:
Треугольник существует только тогда, когда сумма двух его сторон больше третьей.
Требуется сравнить каждую сторону с суммой двух других.
Если хотя бы в одном случае сторона окажется больше либо равна сумме двух других,
 то треугольника с такими сторонами не существует.
*/
        Scanner scan7 = new Scanner(System.in);
        int side1 = scan7.nextInt();
        int side2 = scan7.nextInt();
        int side3 = scan7.nextInt();
        int a = side1 + side2;
        int b = side2 + side3;
        int c = side1 + side3;
        if (a > side3 && b > side1 && c > side2) {
            System.out.println("Треугольник существует");
        } else {
            System.out.println("Треугольник не существует");
        }


/*
    8
Работа светофора для пешеходов запрограммирована следующим образом:
в начале каждого часа в течение трех минут горит зелёный сигнал,
затем в течение одной минуты - жёлтый,
а потом в течение одной минуты - красный,
затем опять зелёный горит три минуты и т. д.
Подать программе вещественное число t, означающее время в минутах, прошедшее с начала очередного часа.
Определить, сигнал какого цвета горит для пешеходов в этот момент.
Результат вывести на экран в следующем виде:
"зелёный" - если горит зелёный цвет,
"жёлтый" - если горит жёлтый цвет,
"красный" - если горит красный цвет.
Пример для числа 2.5:
зелёный
Пример для числа 3:
жёлтый
Пример для числа 4:
красный
Пример для числа 5:
зелёный
*/


        Scanner scan8 = new Scanner(System.in);
        double t = scan8.nextDouble();
        while (t > 5) {
            t -= 5;
        }
        if (t > 0 && t < 3.0) {
            System.out.println("Зеленый");
        } else if (t >=3.0 && t < 4.0) {
            System.out.println("Желтый");
        } else {
            System.out.println("Красный");
        }
    }}
