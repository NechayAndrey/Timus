package laba2;

import java.util.Scanner;

public class Example3 {
        public static void main(String[] args) {

            System.out.println("Ведите любое целое число в диапазоне от 5 до 10: ");
            Scanner in = new Scanner(System.in);
            int x = in.nextInt();

            if (x > 4 && x < 10) {
                System.out.println("Введенное число удовлетворяет требованиям");
            } else System.out.println("Введенное число не удовлетворяет требованиям");
            in.close();
        }
}
