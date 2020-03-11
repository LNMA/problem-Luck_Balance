package com.louay.projects;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please input number of contests: ");
        int contest = input.nextInt();
        System.out.print("please input the maximum number of important contests can lose: ");
        int loseNum = input.nextInt();

        int [][] arr = new int[contest][2];

        fillAnArray(arr,input);

        int counter = 0;
        int temp = 0;
        int totalSum = 0;
        for (int i = 0; i < arr.length; i++) {
            totalSum += arr[i][0];

            if (arr[i][1] == 1){
                counter++;
                if (counter == loseNum){
                    temp = arr[i][0];
                }
            }
        }


        System.out.println("\nThe maximum amount of luck Lena can have after all the contests: "+(totalSum-(temp*2)));
    }

    public static void fillAnArray (int [][] arr, Scanner input) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.printf("enter element at %d raw, %d column: ", (i + 1), (j + 1));
                if (j == 0) {
                    arr[i][j] = input.nextInt();
                } else if (j == 1) {
                    arr[i][j] = input2Column(input);
                }
            }
        }
    }

    public static int input2Column(Scanner input) {
        int type = input.nextInt();
        if (type == 0 || type == 1) {
            return type;
        } else {
            System.out.println(" the contest's importance rating must be 0 or 1, try again.");
            type = input2Column(input);
            return type;
        }
    }

}
