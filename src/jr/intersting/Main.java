package jr.intersting;

/*
Суммирование
Вводить с клавиатуры числа.
Если пользователь ввел -1,
вывести на экран сумму всех введенных
чисел и завершить программу.
-1 должно учитываться в сумме.

Подсказка: один из вариантов решения этой
задачи, использовать конструкцию:

while (true) {
    int number = считываем число;
    if (проверяем, что number -1)
        break;
}

Требования:
1. Программа должна считывать числа c клавиатуры.
2. Если пользователь ввел -1, программа должна
вывести сумму всех введенных чисел на экран и
завершиться.
3. Программа должна посчитать сумму введенных
чисел и вывести её на экран.
4. В программе должен использоваться цикл for,
while или do-while.
*/

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int enter = 0;
        int sum = 0;
        while (enter!=-1){
            enter = scanner.nextInt();
            sum+=enter;
        }
        System.out.println(sum);
    }
}
