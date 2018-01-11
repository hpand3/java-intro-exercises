package com.thoughtworks;

public class Triangle {
    private char symbol;

    public Triangle(char symbol) {
        this.symbol = symbol;
    }

    public void single() {
        System.out.println(this.symbol);
    }

    public void horLine(int length) {
        for(int count = 0; count < length; count++) {
            System.out.print(this.symbol);
        }
        System.out.println();
    }

    public void verLine(int length) {
        for(int count = 0; count < length; count++) {
            System.out.println(this.symbol);
        }
    }

    public void rightTriangle(int length) {
        for(int count = 1; count <= length; count++) {
            this.horLine(count);
        }
    }
}

