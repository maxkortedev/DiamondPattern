package com.maxkorte;

public class Main {

    public static void main(String[] args) {
	    byte height = Byte.parseByte(args[0]);
        printDiamond(height);
    }

    public static void printDiamond(byte height){
        for (byte i = 0; i < height; i++){
            printStep(i);
        }
        for (byte i = (byte) (height - 2); i >= 0; i--){
            printStep(i);
        }
    }

    public static void printStep(byte i){
        for (byte j = 0; j <= i; j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
