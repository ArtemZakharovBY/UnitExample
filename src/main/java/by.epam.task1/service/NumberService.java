package by.epam.task1.service;

public class NumberService {

    public static int lastSquareNumber(int number){
        number = number %10;

        number = (number * number)%10;

        return number;
    }
}
