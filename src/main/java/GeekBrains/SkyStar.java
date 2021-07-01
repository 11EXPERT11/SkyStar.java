package GeekBrains;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SkyStar {
    public static void main (String [] args) {


        String mass [] = new String[] {"яблоко", "солнце", "машина", "ключ"};
        Scanner scanner = new Scanner(System.in);
        String user = "";
        Random random = new Random();
        String word = mass[random.nextInt(mass.length)];
        System.out.println("Привет, я тут загадал одно слово, попробуй отгадать ##########");
        boolean End = false;

        for ( int i = 0; i < mass.length; i++) {

        }



            do {
            user = scanner.nextLine();

            if (!user.equals(word))
                System.out.println("Не угадал!");
            else
                End = true;
            return ;

        } while (!End);





        //       String[] mass = new String[] {"яблоко", "солнце", "машина", "ключ"};
  //      System.out.println("Привет, я тут загадал одно слово, попробуй отгадать ##########");

//        Scanner scanner = new Scanner(System.in);
//////        String user = scanner.nextLine();
//        Random random = new Random(mass.length);
//        Arrays.

 //       for ( int i = 0; i < mass.length; i++) {


//        }

        //System.out.print(Arrays.toString(mass));

    }
}
