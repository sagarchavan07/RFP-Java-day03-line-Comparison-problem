package com.bridgelabz;

public class LineComparison {
    public static void main(String[] args) {
        int x1,y1,x2,y2;
        double lengthOfline;

        System.out.println("Welcome to Line Comparison Computation");

        x1=2;
        y1=2;
        x2=5;
        y2=5;

        lengthOfline=(Math.sqrt( Math.pow((x2-x1),2) + Math.pow((y2-y1),2) ));
        System.out.println("Length of line = "+lengthOfline);
    }
}
