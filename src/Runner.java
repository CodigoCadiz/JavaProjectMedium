import java.util.Scanner;

public class Runner {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name?");




        String name = sc.next();

        System.out.println("Hello " + name + "!");

        Question q = new Question("");

        System.out.println(" 1 = a  2 = b  3 = c  4 = d");

        for (int i = 0; i < q.question.length; i++) {
            System.out.println(q.question[i]);
            System.out.println(q.response[i]);

            boolean isValid = false;

            while (isValid == false) {

                if (sc.hasNextInt()) {
//                    if (sc.nextInt() > 4 || sc.nextInt() < 1) {
//                        System.out.println("Keep it between 1 and 4");
//                        sc.next();
//                    } else {
                        q.userInput[i] = sc.nextInt();
                        isValid = true;
                    // }
                } else {
                    System.out.println("Not a number! Try again!");
                    sc.next();
                }

            }
        }

        q.compile();

    }
}


//    System.out.println("Enter your age");
//    int age = sc.nextInt();
//
//        if(sc.hasNextInt()) {
//            int input = sc.nextInt();
//        } else {
//            System.out.print("Not a number!");
//        }
//    }
