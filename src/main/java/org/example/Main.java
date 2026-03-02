package org.example;

import java.time.LocalDate;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main
{
    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your birthday \nYYYY \nMM \nDD ");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        scanner.nextLine();
        scanner.close();

        LocalDate dateOfBirth = LocalDate.of(year, month,day);
        LocalDate dateToday = LocalDate.now();

        Ticket.ticketPrice(dateOfBirth, dateToday);
    }
}