package Homework.Lesson_3_Boolean_if.HW3;

public class Homework3 {

    public static void main(String[] args) {

/*        Задача №1

        Необходимо создать две целочисленные переменные (a, b),
        присвоить произвольные значения переменным на ваш выбор
        и вывести следующие строки:
        a == b - если переменные равны
        a < b - если переменная a меньше b
        a > b - если переменная b меньше a
*/
        System.out.println("Task1:");

        int a = 50;
        int b = 15;

        if (a == b) {
            System.out.println("a == b");

        } else if (a < b) {
            System.out.println("a < b");
        }
        else {
            System.out.println("a > b");
        }

        /*Задача №2

        Необходимо создать две целочисленные переменные (a, b),
        присвоить произвольные значения переменным на ваш выбор и вывести следующие строки:
        maybe a and b are even - если сумма переменных четная
        some variable is odd - если сумма переменных нечетная*/

        System.out.println("Task2:");

        int a1 = 49;
        int b1 = 68;
        int sum = a1 + b1;

        if (sum % 2 == 0)
        {
            System.out.println("maybe a and b are even");

        } else if (sum % 2 != 0 ) {
            System.out.println("some variable is odd");
        }

        /*Задача №3

        Необходимо создать целочисленную переменную, присвоить произвольное
        значение переменной на ваш выбор и вывести следующие строки:
        больше 10 - если переменная больше 10
        меньше 100 - если переменная меньше 100
        результат деления на 2 больше 20 - если это соответствует истине
        значение переменной между 5 и 40 включительно - если это правда
        значение переменной меньше 5 или больше 40 - если предыдущие условие ложное*/

        System.out.println("Task3:");

        int d  = 41;

        if (d > 10) {
            System.out.println("больше 10");
        }

        if (d < 100) {
            System.out.println("меньше 100");
        }

        if (d / 2.0 > 20) {
            System.out.println("результат деления на 2 больше 20");
        }

        if (d >= 5 && d <= 40) {
            System.out.println("значение переменной между 5 и 40 включительно");

        } else {
            System.out.println("значение переменной меньше 5 или больше 40");
        }
    }
}
