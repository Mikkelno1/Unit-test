package org.example;

import java.time.LocalDate;

public class Ticket
{

    public static double ticketPrice(LocalDate dateOfBirth, LocalDate today)
    {
        int childTicket = 30;
        int adultTicket = 60;
        int price = 0;
        int adultAge = 18;

        int comparison = today.compareTo(dateOfBirth);

        if (comparison == adultAge)
        {
            price += adultTicket;
        } else if (comparison > adultAge)
        {
            price += adultTicket;
        } else {
            price += childTicket;
        }

        System.out.println("The price is: " + price);
      return price;
    }
}
