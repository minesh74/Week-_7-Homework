package homeworkWeek7;

import java.util.Scanner;

public class Marksheet {
    public static void main(String[] args) {
        int math, science, english, roll, sum;                          //declare integer
        String name;                                                    //declare string

        Scanner in = new Scanner(System.in);                           //scanner used
        System.out.print(" Enter your name :            ");            //print statement
        name = in.nextLine();
        System.out.print(" Enter your Roll Number :     ");
        roll = in.nextInt();
        math = in.nextInt();

        if (math <= 100) {                                                       //if (condition)
            System.out.println(" Enter Math Marks :      " + math);              // body
        } else                                                                   //else
            System.out.println("Invalid Input, Marks should between 0 to 100");  //else body
        science = in.nextInt();
        if (science <= 100) {
            System.out.println(" Enter Science Marks :" + science);
        }
        english = in.nextInt();
        if (english <= 100) {
            System.out.println(" Enter English Marks :" + english);
        } else
            System.out.println("Invalid Input, Marks should between 0 to 100");
        sum = math + science + english;
        if (sum <= 300) {
            System.out.println("Total Marks :" + sum);

            int total = 300;
            float per = sum * 100 / total;
            System.out.println("Percantage :" + per);
            if (per >= 80) {
                System.out.println("Result :  PASS");
                System.out.println("Grade : A+");
            } else if (per >= 60) {
                System.out.println("Result :  PASS");
                System.out.println("Grade : A");
            } else if (per >= 50) {
                System.out.println("Result :  PASS");
                System.out.println("Grade : B");
            } else if (per >= 35) {
                System.out.println("Result :  PASS");
                System.out.println("Grade : C");
            } else {
                System.out.println("Result :  FAIL");
            }
        } else
            System.out.println("Invalid Marks, Re enter Marks");
    }
}