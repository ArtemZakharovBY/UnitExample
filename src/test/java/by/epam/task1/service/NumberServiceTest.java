package by.epam.task1.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberServiceTest {

    @Test
    public void lastSquareNumber() {
        int number = 5;
        int resultExpected = 5;
        int resultReal = NumberService.lastSquareNumber(number);

        assertEquals(resultExpected, resultReal);
    }
}