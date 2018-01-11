package com.thoughtworks;

public class Diamond {
    private char symbol;

    public Diamond(char symbol) {
        this.symbol = symbol;
    }

    public void drawLine(int maxNumSymbols, int rowSpace) {

        int upperBound = maxNumSymbols - rowSpace;
        int lowerBound = rowSpace + 1;

        for (int column = 1; column <= maxNumSymbols; column += 1) {

            if (column > upperBound || column < lowerBound) {
                System.out.print(' ');
            } else {
                System.out.print(this.symbol);
            }

        }
        System.out.println();
    }

    public void topHalfDiamond(int maxNumSymbols, int height) {

        int rowSpace;

        for (int numSymbols = 1; numSymbols <= height-1; numSymbols += 1) {

            rowSpace = Math.abs(height - numSymbols);

            this.drawLine(maxNumSymbols, rowSpace);

        }
    }

    public void bottomHalfDiamond(int maxNumSymbols, int height) {

        int rowSpace;

        for (int numSymbols = height - 1; numSymbols >= 1; numSymbols -= 1) {

            rowSpace = Math.abs(height - numSymbols);

            this.drawLine(maxNumSymbols, rowSpace);

        }
    }

    public void isoTriangle(int height) {
        int maxNumSymbols = 2 * height - 1;

        this.topHalfDiamond(maxNumSymbols, height);
        this.drawLine(maxNumSymbols, 0);
    }

    public void diamond(int height) {
        int maxNumSymbols = 2 * height - 1;

        this.topHalfDiamond(maxNumSymbols, height);
        this.drawLine(maxNumSymbols, 0);
        this.bottomHalfDiamond(maxNumSymbols, height);
    }
}
