package com.thoughtworks;
import com.thoughtworks.Triangle;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Triangle tri = new Triangle('*');
        System.out.println("Triangle Exercises");
        System.out.println("Single");
        tri.single();
        System.out.println("Horizontal line");
        tri.horLine(8);
        System.out.println("Vertical Line");
        tri.verLine(3);
        System.out.println("Right triangle");
        tri.rightTriangle(3);

        System.out.println();

        Diamond dia = new Diamond('*');
        System.out.println("Diamond Exercises");
        System.out.println("Isosceles Triangle");
        dia.isoTriangle(4);
        System.out.println("Diamond");
        dia.diamond(4);
        System.out.println("Diamond with names");
        dia.diamondWithName("Harsh", 4);

        System.out.println();

        System.out.println("FizzBuzz Output");
        FizzBuzz();

        System.out.println("FizzBuzz Output");
        FizzBuzz();
    }

    public static void FizzBuzz() {
        for (int count = 1; count <= 100; count++) {
            if (count % 3 == 0 && count % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if(count % 3 == 0) {
                System.out.println("Fizz");
            } else if(count % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(count);
            }
        }
    }

    public static void primeFactor(int n) {
        List<Integer> factors = new ArrayList();

        while (n % 2 == 0) {
            factors.add(2);
            n /= 2;
        }






    }
}
