package laba1;

import java.util.Scanner;

import static java.lang.System.*;

public class Example6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        out.println("Input name: ");
        String name = in.nextLine();

        out.println("Input surname: ");
        String surname = in.nextLine();

        out.println("Input patronymic: ");
        String patronymic = in.nextLine();

        out.println("Name: " + name);
        out.println("Surname: " + surname);
        out.println("Patronymic: " + patronymic);
        in.close();

    }
}
