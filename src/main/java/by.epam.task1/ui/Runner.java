package by.epam.task1.ui;

import by.epam.task1.service.NumberService;
import by.epam.task1.util.DataScanner;

public class Runner {

    public static void main(String[] args) {

        ConsolePhrases.writePhrase();
        int number = DataScanner.integerFromConsole();

        int lastNumber = NumberService.lastSquareNumber(number);
        ConsolePhrases.endPhrase(number, lastNumber);
    }
}
