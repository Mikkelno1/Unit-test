package org.example;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class TicketTest
{

    @Test
    void inTest()
    {
        //Arrange
        int birthYear = 1990;
        int month = 11;
        int day = 11;

        //Act
        LocalDate today = LocalDate.of(2020,11,11);
        LocalDate dateOfBirth = LocalDate.of(birthYear,month,day);

        double actual = Ticket.ticketPrice(dateOfBirth, today);
        double expected = 60.0;

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    void outTest()
    {
        //Arrange
        int birthYear = 2020;
        int month = 11;
        int day = 11;

        //Act
        LocalDate today = LocalDate.of(2025,11,11);
        LocalDate dateOfBirth = LocalDate.of(birthYear,month,day);

        double actual = Ticket.ticketPrice(dateOfBirth, today);
        double expected = 30.0;

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    void onTest()
    {
        //Arrange
        int birthYear = 2000;
        int month = 11;
        int day = 11;

        //Act
        LocalDate today = LocalDate.of(2018,11,11);
        LocalDate dateOfBirth = LocalDate.of(birthYear,month,day);

        double actual = Ticket.ticketPrice(dateOfBirth, today);
        double expected = 60.0;

        //Assert
        assertEquals(expected, actual);
    }

    @Test
    void offOneLessTest()
    {
        //Arrange
        int birthYear = 2000;
        int month = 11;
        int dayOneLess = 12;

        //Act
        LocalDate today = LocalDate.of(2018,11,11);
        LocalDate dateOfBirthOneLess = LocalDate.of(birthYear,month,dayOneLess);

        double actualOneLess = Ticket.ticketPrice(dateOfBirthOneLess, today);
        double expectedOneLess = 30.0;

        //Assert
        assertEquals(expectedOneLess, actualOneLess);
    }

    @Test
    void offOneMoreTest()
    {
        //Arrange
        int birthYear = 2000;
        int month = 11;
        int dayOneMore = 10;

        //Act
        LocalDate today = LocalDate.of(2018,11,11);
        LocalDate dateOfBirthOneMore = LocalDate.of(birthYear,month,dayOneMore);

        double actualOneMore = Ticket.ticketPrice(dateOfBirthOneMore, today);
        double expectedOneMore = 60.0;

        //Assert
        assertEquals(expectedOneMore, actualOneMore);
    }





}