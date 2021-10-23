package com.bridgelab;                                              //package
import java.util.Scanner;                                          // include Scanner

public class LineComparison {                                     //Class
    public static void main(String[] args) {
        System.out.println("Welcome to Line Compare Program");
                int x1,y1,x2,y2,a1,b1,a2,b2;

                Scanner sc =new Scanner(System.in);                         //taking inputs using scanner for coordinate
                System.out.println("The coordinates of 1st line are: ");    // x1,x2 and y1,y2 are co-ordinate points of 1st line
                System.out.print("x1 = ");x1=sc.nextInt();
                System.out.print("y1 = ");y1=sc.nextInt();
                System.out.print("x2 = ");x2=sc.nextInt();
                System.out.print("y2 = ");y2=sc.nextInt();
        double length1 = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));  //calculating the length of 1st line
        System.out.println("The length of the line is : "+length1);
                System.out.println("The coordinates of 2nd line are:");     // a1,a2 and b1,b2 are co-ordinate points of 2nd line
                System.out.print("a1 = ");a1=sc.nextInt();
                System.out.print("b1 = ");b1=sc.nextInt();
                System.out.print("a2 = ");a2=sc.nextInt();
                System.out.print("b2 = ");b2=sc.nextInt();
        double length2 = Math.sqrt(Math.pow(a2-a1, 2)+Math.pow(b2-b1, 2));  //calculating the length of 2nd line
        System.out.println("The length of the 2nd line is = "+length2);

        if(length1==length2)
            System.out.println("The lines are equal");
        else
            System.out.println("The lines are not equal");




            }
}
