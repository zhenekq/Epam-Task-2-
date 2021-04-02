package by.epamtc.enter;

import java.util.Scanner;

public class ReadNumber {
    public static double readDoubleNumber(){
        Scanner scanner = new Scanner(System.in);
        while(!scanner.hasNextDouble()){
            scanner.nextLine();
            System.out.println("Enter the integer number");
        }
        return scanner.nextDouble();
    }
    public static int readIntegerNumber(){
        Scanner scanner = new Scanner(System.in);
        while(!scanner.hasNextInt()){
            scanner.nextLine();
            System.out.println("Enter the number pls!");
        }
        return scanner.nextInt();
    }
    public static String readString(){
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNextInt() || scanner.hasNextDouble() || scanner.hasNextFloat()){
            scanner.nextLine();
            System.out.println("Color can't be a number!");
        }
        return scanner.nextLine();
    }
}
