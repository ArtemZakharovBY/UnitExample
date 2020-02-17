package by.epam.task1.ui;

public class ConsolePhrases {

    public static void writePhrase(){
        System.out.println("Hello, write your number: ");
    }

    public static void endPhrase(int number, int lastSquareNumber){
        System.out.println("Last number of square of " + number + " = " + lastSquareNumber);
    }
}
