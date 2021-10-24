package com.bridgelab;                                              //package
import java.util.Scanner;                                          // include Scanner
import java.lang.Math;

public class LineComparison {                                     //Class

        int x1, y1, x2, y2, a1, b1, a2, b2;
        double length1;
        double length2;

        Scanner sc = new Scanner(System.in);                         //taking inputs using scanner for coordinate

    public void calculateLength() {
        System.out.println("The coordinates of 1st line are: ");    // x1,x2 and y1,y2 are co-ordinate points of 1st line
        System.out.print("x1 = ");
        x1 = sc.nextInt();
        System.out.print("y1 = ");
        y1 = sc.nextInt();
        System.out.print("x2 = ");
        x2 = sc.nextInt();
        System.out.print("y2 = ");
        y2 = sc.nextInt();
        length1 = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));  //calculating the length of 1st line
        System.out.println("The length of the line is : " + length1);
        System.out.println("The coordinates of 2nd line are:");     // a1,a2 and b1,b2 are co-ordinate points of 2nd line
        System.out.print("a1 = ");
        a1 = sc.nextInt();
        System.out.print("b1 = ");
        b1 = sc.nextInt();
        System.out.print("a2 = ");
        a2 = sc.nextInt();
        System.out.print("b2 = ");
        b2 = sc.nextInt();
        length2 = Math.sqrt(Math.pow(a2 - a1, 2) + Math.pow(b2 - b1, 2));  //calculating the length of 2nd line
        System.out.println("The length of the 2nd line is = " + length2);
    }
    double len1=length1;
    double len2=length2;
    public void equalOrNot() {
        if (len1.equals(len2))
            System.out.println("The line1 is equal to line2");
        else
            System.out.println("lines are not equal");
    }
    public void compare() {

        int compareValue =len1.compareTo(len2);
        if (compareValue==0)
            System.out.println("The line1 is equal to line2");
        else if(compareValue < 0)
            System.out.println("The line 1 is smaller then line2");
        else
            System.out.println("line1 is greater than line2");
    }
    public static void main(String[] args) {
        System.out.println("Welcome to Line Compare Program");
        LineComparison line = new LineComparison();
        line.calculateLength();
        line.equalOrNot();
        line.compare();
    }
}
