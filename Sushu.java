import java.util.Scanner;

public class Sushu {
    public static void main(String[] args) {
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("Please input a number, i will find all the 'zhishu's which smaller than this number ");
            int number = input.nextInt();
            System.out.println("input num is: " + number);

            for (int i = 1; i <= number; i++) {
                if (judgeSushu(i)) {
                    System.out.println(i);
                }
            }
        }
    }

    public static boolean judgeSushu(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


}