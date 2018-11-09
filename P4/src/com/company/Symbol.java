package com.company;

import java.util.Arrays;

public class Symbol {
    private char [][] symbol = new char[3][3];

    private char[][] zero = new char[3][3];
    private char[][] one = new char[3][3];
    private char[][] two = new char[3][3];
    private char[][] three = new char[3][3];
    private char[][] four = new char[3][3];
    private char[][] five = new char[3][3];
    private char[][] six = new char[3][3];
    private char[][] seven = new char[3][3];
    private char[][] eight = new char[3][3];
    private char[][] nine = new char[3][3];

    Symbol(char [][] t) {
        symbol = t;
    }

    {
        //zero
        zero[0][0] = ' '; zero[0][1] = '_'; zero[0][2] = ' ';
        zero[1][0] = '|'; zero[1][1] = ' '; zero[1][2] = '|';
        zero[2][0] = '|'; zero[2][1] = '_'; zero[2][2] = '|';
        //one
        one[0][0] = ' '; one[0][1] = ' '; one[0][2] = ' ';
        one[1][0] = ' '; one[1][1] = ' '; one[1][2] = '|';
        one[2][0] = ' '; one[2][1] = ' '; one[2][2] = '|';
        //two
        two[0][0] = ' '; two[0][1] = '_'; two[0][2] = ' ';
        two[1][0] = ' '; two[1][1] = '_'; two[1][2] = '|';
        two[2][0] = '|'; two[2][1] = '_'; two[2][2] = ' ';
        //three
        three[0][0] = ' '; three[0][1] = '_'; three[0][2] = ' ';
        three[1][0] = ' '; three[1][1] = '_'; three[1][2] = '|';
        three[2][0] = ' '; three[2][1] = '_'; three[2][2] = '|';
        //four
        four[0][0] = ' '; four[0][1] = ' '; four[0][2] = ' ';
        four[1][0] = '|'; four[1][1] = '_'; four[1][2] = '|';
        four[2][0] = ' '; four[2][1] = ' '; four[2][2] = '|';
        //five
        five[0][0] = ' '; five[0][1] = '_'; five[0][2] = ' ';
        five[1][0] = '|'; five[1][1] = '_'; five[1][2] = ' ';
        five[2][0] = ' '; five[2][1] = '_'; five[2][2] = '|';
        //six
        six[0][0] = ' '; six[0][1] = '_'; six[0][2] = ' ';
        six[1][0] = '|'; six[1][1] = '_'; six[1][2] = ' ';
        six[2][0] = '|'; six[2][1] = '_'; six[2][2] = '|';
        //seven
        seven[0][0] = ' '; seven[0][1] = '_'; seven[0][2] = ' ';
        seven[1][0] = ' '; seven[1][1] = ' '; seven[1][2] = '|';
        seven[2][0] = ' '; seven[2][1] = ' '; seven[2][2] = '|';
        //eight
        eight[0][0] = ' '; eight[0][1] = '_'; eight[0][2] = ' ';
        eight[1][0] = '|'; eight[1][1] = '_'; eight[1][2] = '|';
        eight[2][0] = '|'; eight[2][1] = '_'; eight[2][2] = '|';
        //nine
        nine[0][0] = ' '; nine[0][1] = '_'; nine[0][2] = ' ';
        nine[1][0] = '|'; nine[1][1] = '_'; nine[1][2] = '|';
        nine[2][0] = ' '; nine[2][1] = '_'; nine[2][2] = '|';
    }

    private boolean isZero() {
        if (equals(zero)) return true;
        else return false;
    }
    private boolean isOne() {
        if (equals(one)) return true;
        else return false;
    }
    private boolean isTwo() {
        if (equals(two)) return true;
        else return false;
    }
    private boolean isThree() {
        if (equals(three)) return true;
        else return false;
    }
    private boolean isFour() {
        if (equals(four)) return true;
        else return false;
    }
    private boolean isFive() {
        if (equals(five)) return true;
        else return false;
    }
    private boolean isSix() {
        if (equals(six)) return true;
        else return false;
    }
    private boolean isSeven() {
        if (equals(seven)) return true;
        else return false;
    }
    private boolean isEight() {
        if (equals(eight)) return true;
        else return false;
    }
    private boolean isNine() {
        if (equals(nine)) return true;
        else return false;
    }


    public boolean equals(char[][] obj) {
        return Arrays.deepEquals(obj, this.symbol);
    }

    public int toInt() {
        if (isZero()) return 0;
        if (isOne()) return 1;
        if (isTwo()) return 2;
        if (isThree()) return 3;
        if (isFour()) return 4;
        if (isFive()) return 5;
        if (isSix()) return 6;
        if (isSeven()) return 7;
        if (isEight()) return 8;
        if (isNine()) return 9;
        return -1;
    }

}
