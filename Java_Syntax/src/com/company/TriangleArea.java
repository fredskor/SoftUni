package com.company;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter the X Y (separated by space) coordinate of the point A: ");
        String coordinatesA = console.nextLine();

        System.out.print("Enter the X Y (separated by space) coordinate of the point B: ");
        String coordinatesB = console.nextLine();

        System.out.print("Enter the X Y (separated by space) coordinate of the point C: ");
        String coordinatesC = console.nextLine();

        String[] xyA = coordinatesA.split(" ");
        String[] xyB = coordinatesB.split(" ");
        String[] xyC = coordinatesC.split(" ");

        int Ax = Integer.parseInt(xyA[0]);
        int Ay = Integer.parseInt(xyA[1]);
        int Bx = Integer.parseInt(xyB[0]);
        int By = Integer.parseInt(xyB[1]);
        int Cx = Integer.parseInt(xyC[0]);
        int Cy = Integer.parseInt(xyC[1]);

        int triangleArea = (Ax * (By - Cy) + Bx * (Cy - Ay) + Cx * (Ay - By)) / 2;

        if (triangleArea == 0){
            System.out.println("The three points lie in a straight line and do not form a triangle. Result = " + triangleArea);
        }
        else {
            System.out.println("The Area of a Triangle is: " + Math.abs(triangleArea));
        }
    }
}
