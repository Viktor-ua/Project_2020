package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int [] array = new int[] {55, 21, 99, 2, 89, 4};

        int r = 0;

        /*do {
            r = 0;
            for (int i = 0; i < array.length - 1; i++){
                if (array[i] > array[i + 1]) {
                    int z = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = z;
                    r++;
                }
            }
        }while (r != 0);*/

        for (int i = 0; i < array.length - 1; i++){
            if (array[i] > array[i + 1]){
                r = i;
                while (array[r] > array[r + 1]){
                    int z = array[r];
                    array[r] = array[r + 1];
                    array[r + 1] = z;
                    if(r != 0){
                        r--;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
