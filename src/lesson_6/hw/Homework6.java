package lesson_6.hw;

import java.util.Arrays;
import java.util.Scanner;

public class Homework6 {
    public static void main(String[] args) {

/*
Требования:
Создать класс Human.
• Добавить в класс Human поля: имя(String), пол(boolean), возраст(int), отец(Human), мать(Human).
• Добавить в класс конструктор public Human(String name, boolean sex, int age).
• Добавить в класс конструктор public Human(String name, boolean sex, int age, Human father, Human mother).
• Создай 9 разных объектов типа Human (4 объекта без отца и матери и 5 объектов с ними)).
• Выведи созданные объекты на экран

public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;
            if (this.father != null) {
                text += ", отец: " + this.father.name;
            }
            if (this.mother != null) {
                text += ", мать: " + this.mother.name;
            }
            return text;
        }
*/
        System.out.println("Задание 1");
        Human human1 = new Human("Максим", false, 79);
        Human human2 = new Human("Виктор", false, 88);
        Human human3 = new Human("Маша", true, 69);
        Human human4 = new Human("Вика", true, 59);

        Human human5 = new Human("Вася", false, 19, human1, human3);
        Human human6 = new Human("Женя", false, 23, human1, human3);
        Human human7 = new Human("Саша", true, 27, human1, human3);
        Human human8 = new Human("Катя", true, 30, human2, human4);
        Human human9 = new Human("Ирина", true, 35, human2, human4);

        System.out.println(human1);
        System.out.println(human2);
        System.out.println(human3);
        System.out.println(human4);
        System.out.println(human5);
        System.out.println(human6);
        System.out.println(human7);
        System.out.println(human8);
        System.out.println(human9);


/*2
Создать класс Cat (кот) с пятью конструкторами:
- Имя,
- Имя, вес, возраст
- Имя, возраст (вес стандартный)
- вес, цвет, (имя, адрес и возраст - неизвестные. Кот - бездомный)
- вес, цвет, адрес (чужой домашний кот)

Задача конструктора - сделать объект валидным.
Например, если вес не известен, то нужно указать какой-нибудь средний вес.
Кот не может ничего не весить.
То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
*/

        System.out.println("Задание 2");
        Cat cat = new Cat(10, "black", null);
        System.out.println(cat);



/*3
1. Внутри класса Solution создай public static классы Man и Woman.
2. У классов должны быть поля: name (String), age (int), address (String).
3. Создай конструкторы, в которые передаются все возможные параметры.
4. Создай по два объекта каждого класса со всеми данными используя конструктор.
5. Объекты выведи на экран в таком формате: name + " " + age + " " + address

В этой задаче можно создавать static class внутри основного класса
*/
        System.out.println("Задание 3");

        Solution.Man man = new Solution.Man("Kolya", 20, "pr. Lenina");
        Solution.Man man2 = new Solution.Man("Valera", 25, "pr. Lenina");
        System.out.println(man);
        System.out.println(man2);
        Solution.Women woman = new Solution.Women("Nina", 18, "Marks str.");
        Solution.Women woman2 = new Solution.Women("Sveta", 20, "Engels str.");
        System.out.println(woman);
        System.out.println(woman2);


/*4
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введет слово "сумма".
Вывести на экран полученную сумму.
*/
        System.out.println("Задание 4. Вводите числа либо слово - сумма");

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        boolean stop = false;
        while (!stop){
            String go = scanner.nextLine();
            if ("сумма".equals(go)) {
                stop = true;
            } else {
                sum += Integer.parseInt(go);
            }
        }
        System.out.println(sum);


/*5
Написать программу, которая:
1. считывает с консоли число N, которое должно быть больше 0
2. потом считывает N чисел с консолиы
3. выводит на экран максимальное из введенных N чисел.
*/

        System.out.println("Задание 5. Введите желаемое количество вводимых в консоль цифр ");
        int n = scanner.nextInt();
        System.out.println("Необходимо ввести в консоль " + n + " чисел");
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array [i] = scanner.nextInt();
        }
        Arrays.sort(array);
        System.out.println("Максимальное введеное число " + array[n-1]);


}
}

