import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
//        String end = input.nextLine();
        // just want to add a commit

        while (true) {
            System.out.println("If you want to quite please input the pw :)");
            System.out.println();
            System.out.print("Please input student's score: ");

            int n = input.nextInt();
            String num = "";
            System.out.println("input num is: " + n);

            if(n<0 || n > 100){
                if(n == 19880926){
                    break;
                }
                System.out.println("Score will not smaller than 0, please input correct score:");
            } else if (90 <= n && n <= 100) {
                num = "A";
                System.out.println("A");
            } else if (80 <= n && n < 90) {
                num = "B";
                System.out.println("B");
            } else if (60 <= n && n < 80) {
                num = "C";
                System.out.println("C");
            }  else {
                num = "F";
                System.out.println("F");
            }

            switch(num){
                case "A":
                    System.out.println("take him/her out for a vacation!");
                    break;
                case "B":
                    System.out.println("He/she need a study tour!");
                    break;
                case "C":
                    System.out.println("beat him!");
                    break;
                case "F":
                    System.out.println("he's dead!");
                    break;

            }

        }
    }
}
