package org.example;

import java.time.LocalDate;
import java.time.Period;

public class Ticket
{

    public static double ticketPrice(LocalDate dateOfBirth, LocalDate today)
    {
        double childTicket = 30.0;
        double adultTicket = 60.0;
        double price;
        int adultAge = 18;


        int comparison = Period.between(dateOfBirth, today).getYears();

        if (comparison >= adultAge)
        {
            price = adultTicket;
        } else {
            price = childTicket;
        }

      return price;
    }
}
