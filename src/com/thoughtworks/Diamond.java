package com.thoughtworks;

public class Diamond {
    private char symbol;

    public Diamond(char symbol) {
        this.symbol = symbol;
    }

    public void isoTriangle(int height) {
        int maxNumSymbols = 2 * height - 1;
        int rowSpace = 0;
        int upperBound, lowerBound = 0;

        for (int numSymbols = 1; numSymbols <= height; numSymbols += 1) {

            rowSpace = Math.abs(height - numSymbols);
            upperBound = maxNumSymbols - rowSpace;
            lowerBound = rowSpace + 1;

            for (int column = 1; column <= maxNumSymbols; column += 1) {

                if (column > upperBound || column < lowerBound) {
                    System.out.print(' ');
                } else {
                    System.out.print(this.symbol);
                }

            }
            System.out.println();
        }
    }

    public void diamond(int height) {
        
    }


}
