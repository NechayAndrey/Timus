package Laba9.f1;

public class example_8 {
    //Генерация исключения в методе.
    public static int m() {
        try {
            System.out.println("0");
            throw new RuntimeException();
        } finally {
            System.out.println("1");
            return 2;
        }

    }

    public static void main(String[] args) {
        System.out.println(m());

    }
}
