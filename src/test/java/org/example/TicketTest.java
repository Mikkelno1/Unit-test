package org.example;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest
{

    @Test
    void onTest()
    {
        //Arrange
        int year = 2026;
        int month = 03;
        int day = 02;

        //Act
        LocalDate dateOfBirth = LocalDate.of(year, month, day);
        LocalDate today = LocalDate.now();

        //Assert
        assertEquals(dateOfBirth,today);
    }

    @Test
    void outTest()
    {
        //Arrange

        //Act

        //Assert
    }
    //Arrange

    //Act

    //Assert



}