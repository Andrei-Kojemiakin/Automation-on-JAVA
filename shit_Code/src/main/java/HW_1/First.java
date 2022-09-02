package HW_1;

import java.util.Scanner;

public class First {

    public static void main(String[] args) {

        int result = 0;
        int temp = 0;

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        if (x > a && x > b || y > a && y > b){
            result = -1;
        } else {
            if (a < x ||  b < y) {
                temp = a;
                a = b;
                b = temp;
            }

            while (a != x) {
                if (a / 2 >= x) {
                    a = a / 2;
                    result++;
                } else if (a / 2 < x) {
                    result++;
                    break;
                }

            }

            while (b != y) {
                if (b / 2 >= y) {
                    b = b / 2;
                    result++;
                } else if (b / 2 < y) {
                    result++;
                    break;
                }

            }
        }

        System.out.println(result);

    }

}