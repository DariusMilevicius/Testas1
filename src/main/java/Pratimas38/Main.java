package Pratimas38;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner readinput = new Scanner(System.in);
        int bakelis = 1000;
        String enterkey = "Kiek ipilti kavos S->100 ml, M->150 ml, L->200ml  ? ";
        System.out.print(enterkey);


        enterkey = readinput.nextLine();


        if (enterkey.equals("S")) {


            bakelis = bakelis - 100;
            System.out.println("It works!");
        }


    }
}
