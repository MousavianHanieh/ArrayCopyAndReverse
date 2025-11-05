package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arrA;
        arrA = new int[] {1,2,3,4,5};
        int[] arrB = new int[arrA.length];
        int[] arrC = new int[arrA.length];
        //arrB = arrA.clone();
        for(int i=0; i<arrA.length; i++) {
            arrB[i] = arrA[i];
            arrC[i] = arrA[arrA.length - i -1];
        }
        System.out.println("ArrayA:" + Arrays.toString(arrB));
        System.out.println("----------------");
        System.out.println("ArrayB:" + Arrays.toString(arrB));
        System.out.println("----------------");
        System.out.println("ArrayC:" + Arrays.toString(arrC));
    }
}