package laba4;

public class Example3 {
    public static void main(String[] args) {
        // число символов которое необходимо вывести
        int a = 10;
        // число строк которое необходимо вывести
        int b = 10;
        System.out.println("Будет выведен прямоугольник из цифр 2" +
                " с шириной: " + a + " символов");

        System.out.println("высотой: " + b + " строк");
        //создание двухмерного массива необходимого размера
        int [][] graph = new int [b][a];
        //переменная нужна для вывода количества строк
        int z = 0;
        //заполнение массива
        for (int i =0; i < b; i ++){
            for (int j = 0; j < a; j++){
                graph[i][j] = 2;
            }
        }
        // вывод массива в консоль
        for (int i =0; i < b; i++){
            //переменная для повышения номера индекса для вывода в консоль
            int count = i + 1;

            if (count > 9) {
                System.out.print("номер строки " + count + " : ");
            } else System.out.print("номер строки  " + count + " : ");

            for (int j = 0; j < a; j++){
                System.out.print(graph[i][j] + " ");
                z ++;
            }
            System.out.println(" Количество символов в строке " + z);
            //обнуление счетчика
            z = 0;
        }
    }
}
