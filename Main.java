package com.metanit;

public class Main {

    public static void main(String[] args) {
        int elements[] = {1, 3, 5, 8, 83, 12, 14, 16, 34, 56};
        getLast(elements);
        int lastIndex = getLast(elements);
        System.out.println(lastIndex);
    }

    public static int getLast(int[] array) {
        int lastIndex = array[array.length - 1];


        return lastIndex;
    }
}



