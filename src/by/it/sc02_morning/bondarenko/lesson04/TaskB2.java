package by.it.sc02_morning.bondarenko.lesson04;

import java.rmi.MarshalException;
import java.util.Scanner;

/*
Lesson 04. Task B2. Нужно написать программу, которая вводит три числа  a b c типа int с клавиатуры
и вычисляет корни квадратного уравнения a*a*x + b*x + c = 0:
1) Если два корня, то выводится два корня через пробел.
2) Если один корень, то выводится только одно число - корень.
3) Если нет действительных корней, то выводится сообщение об ошибке "Отрицательный дискриминант"

В программе должен быть определен статический метод dis вычисления дискриминанта,
который принимает на входе три числа типа int a,b,c
а на выходе возвращает число типа double

Примеры работы

Ввод:
2 5 3
Вывод:
-1.0 -1.5

Ввод:
2 4 2
Вывод:
-1.0

Ввод:
2 2 2
Вывод:
Отрицательный дискриминант

*/
class TaskB2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double d = dis(a,b,c);
        double r = Math.sqrt(d);

        if (d>0) {
            System.out.println((-b+r)/(2.0*a)+" "+(-b-r)/(2.0*a));
        }
        if (d==0) {
            System.out.println(-b/(2.0*a));
        }
        if (d<0) {
            System.out.println("Отрицательный дискриминант");
        }
    }

    public static double dis(int aa,int bb,int cc) {
        return bb*bb-4*aa*cc;
    }
}
