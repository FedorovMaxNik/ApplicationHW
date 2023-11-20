package lesson_2;


public class Homework {

// задача 1
// В методе main расставь правильно знаки плюс и минус, чтобы значение переменной result получилось равным 20.
// Знаки нужно расставить только в строчке, в которой объявляется переменная result.
// Порядок следования переменных в этой строке изменять нельзя.
// Перед каждой переменной должен стоять знак либо плюс, либо минус.

    public static void main(String[] args) {
        int a = 1;
        int b = 3;
        int c = 9;
        int d = 27;
        int result = - a + b - c + d;
        System.out.println(result);

// задача 2
// Пусть цена товара A обычно составляет 1000 руб, и товара B составляет 500 руб.
// Если клиент покупает товары вместе, то на них действует скидка 10% на всю покупку. Выведите на экран переменную, которая стоимости суммы A+B со скидкой. Отдельно выведите на экран сумму скидки от этой покупки.
// Вывод программы
// Cумма покупки со скидкой: 1350.0
// Сумма скидки: 150.0

        int ProductA = 1000;
        int ProductB = 500;
        double Discount = 0.1;
        double Sum = (ProductA + ProductB) * Discount;
        double Purchase = (ProductA + ProductB - Sum);
        System.out.println("Сумма покупки со скидкой: " + Purchase);
        System.out.println("Сумма скидки: " + Sum);

// задача 3.
// а) товар А стоит 200 руб и на него скидка 15%, а товар Б стоит 30 руб. Клиент взял 10 A и 2 Б. Выведите итоговую цену:

        int ProductAA = 200;
        double DiscountProductAA = 0.15;
        double PriceProductAA = ProductAA - (ProductAA * DiscountProductAA);
        int ProductBB = 30;
        double ClientPrice = 10 * PriceProductAA + 2 * ProductBB;
        System.out.println("Итоговая цена " + ClientPrice);

// б) товар А стоит 500 руб и на него скидка 50%, а товар Б стоит 50 руб. Клиент взял 7 A и 1 Б. Выведите итоговую цену:

        int ProductAAA = 500;
        double DiscountProductAAA = 0.5;
        double PriceProductAAA = ProductAAA - (ProductAAA * DiscountProductAAA);
        int ProductBBB = 50;
        double ClientPriceB = 7 * PriceProductAAA + 1 * ProductBBB;
        System.out.println("Итоговая цена " + ClientPriceB);

// в) товар А стоит 300 руб и на него скидка 10%, а товар Б стоит 20 руб. Клиент взял 2 A и 3 Б. Выведите итоговую цену.
        int ProductAAAA = 300;
        double DiscountProductAAAA = 0.1;
        double PriceProductAAAA = ProductAAAA - (ProductAAAA * DiscountProductAAAA);
        int ProductBBBB = 20;
        double ClientPriceC = 2 * PriceProductAAAA + 3 * ProductBBBB;
        System.out.println("Итоговая цена " + ClientPriceC);



    }
}
