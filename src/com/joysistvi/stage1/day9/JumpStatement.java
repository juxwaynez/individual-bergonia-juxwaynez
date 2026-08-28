package com.joysistvi.stage1.day9;

public class JumpStatement {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            if (i == 5 || i == 8 || i == 10) {
                continue;
            }
        }
    } // Added missing closing brace for main
}


/*
for (int i = 0; i <= 10; i++){

            for (int j = 0; j <= 10; j++){

                if(j == 5) {
                    break;
                }

                System.out.println(i + " " + j);
            }

            System.out.println();
        }
 */