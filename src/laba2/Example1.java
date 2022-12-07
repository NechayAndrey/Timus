package laba2;

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Программа проверит, делится ли число на три");
        System.out.println("Введите число: ");
        int A = in.nextInt();
        int B = 3;
        int C = A % B;
        if(C == 0) {
            System.out.println("Число делится на три без остатка");
        }
        else {System.out.println("Число не делится на три без остатка");
            in.close();
        }
    }
}
