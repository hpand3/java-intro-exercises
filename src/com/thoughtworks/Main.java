package com.thoughtworks;
import com.thoughtworks.Triangle;

public class Main {
    public static void main(String[] args) {
        Triangle tri = new Triangle('*');
        System.out.println("Single");
        tri.single();
        System.out.println("Horizontal line");
        tri.horLine(8);
        System.out.println("Vertical Line");
        tri.verLine(3);
        System.out.println("Right triangle");
        tri.rightTriangle(3);
    }
}