package com.syntax.class8;
import java.util.Arrays;
public class Array2ddemo2 {

	public static void main(String[] args) {
        int [][] arr=new int[][] {

            {5,20,30},
            {0,25,63,45}
        };

        System.out.println(Arrays.toString(arr[0]));
        System.out.println(arr[1][2]);
        int smallest=arr[0][0]; // in case we dont know the biggest number, we can assume a big number here
        for(int i=0; i<arr.length;i++) {

            for(int j=0;j<arr[i].length;j++) {
                if(arr[i][j]<smallest) {
                    smallest=arr[i][j];
                }
            }
        }
        System.out.println(smallest);
/// this method is good when we know the biggest number
    }

	}


