package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	int [] x = {5,4,3,2,1};

    magic(x);
        System.out.println("main: " + Arrays.toString(x));
    }



    public  static void magic(int input)
    {
        input += 10;
    }
    public static void magic(int[] input)
    {
       // input = new int[]{2,2,2,2,2};
        for(int i = 0; i < input.length ; i++)
            //modifying by reference it happens by the array[] initialization
        input[i] += 10;
    }
}
