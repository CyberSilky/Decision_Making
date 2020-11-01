package com.company;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Pick a number between 1 and 20: ");
        Scanner scanner = new Scanner(System.in);

        int inPuttedNum = scanner.nextInt();

        if (inPuttedNum <10){
            System.out.println("Enjoy the good luck a friend brings you.");
        } else{
            System.out.println("Your shoe selection will make you very happy today.");
        }
    }
}
