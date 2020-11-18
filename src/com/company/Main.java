package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int []arr = {1,2,34,3,4,5,7,23,12};
        boolean r=false;
        for (int i = 0; i <arr.length-2 ; i++) {
            if ((arr[i] % 2 + arr[i + 1] % 2 + arr[i + 2] % 2) == 3) {
                r=true;
                break;
            }
        }
        System.out.println(r);
    }
}
