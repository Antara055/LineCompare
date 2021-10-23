package com.bridgelab;                                              //package
import java.util.Scanner;                                          // include Scanner

public class LineComparison {                                     //Class
    public static void main(String[] args) {
        System.out.println("Welcome to Line Compare Program");
                int x1,y1;
                int x2,y2;
                Scanner sc =new Scanner(System.in);             //taking inputs using scanner
                System.out.println("The coordinates are: ");    // x1,x2 and y1,y2 are co-ordinate points
                System.out.print("x1 = ");x1=sc.nextInt();
                System.out.print("y1 = ");y1=sc.nextInt();
                System.out.print("x2 = ");x2=sc.nextInt();
                System.out.print("y2 = ");y2=sc.nextInt();

                double length = Math.sqrt(Math.pow(x2-x1, 2)+Math.pow(y2-y1, 2));  //calculating the length of the line
                System.out.println("The length of the line is : "+length);


            }
}
