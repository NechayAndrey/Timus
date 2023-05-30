package Timus;

import java.util.Scanner;
public class task_2023 {
    public static void main(String[] args) {
        String[][] name = new String[][]{{"Alice", "Ariel", "Aurora", "Phil", "Peter", "Olaf", "Phoebus", "Ralph", "Robin"},
                {"Bambi", "Belle", "Bolt", "Mulan", "Mowgli", "Mickey", "Silver", "Simba", "Stitch"},
                {"Dumbo", "Genie", "Jiminy", "Kuzko", "Kida", "Kenai", "Tarzan", "Tiana", "Winnie"}};

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int curent_position = 0;
        int steps = 0;
        String a;
        for (int i = 0; i < n; i ++) {
            a = in.next();
            for (int j =0; j < name.length; j ++) {
                for (int k = 0; k < 9; k ++) {
                    if (a.equals(name[j][k])) {
                        steps += Math.abs(j - curent_position);
                        curent_position = j;
                    }
                }
            }
        }
        System.out.println(steps);
    }
}
