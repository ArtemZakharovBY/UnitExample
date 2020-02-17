package by.epam.task1.util;

import java.util.Scanner;

public class DataScanner {

    public static int integerFromConsole(){
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        while (!scanner.hasNextInt()){
            scanner.next();
        }

        number = scanner.nextInt();

        return number;
    }
}
