package com.bob.refactoring;

import java.util.Enumeration;
import java.util.Vector;

/**
 * @author boblw
 * @title: Customer
 * @projectName refactoring
 * @description: 顾客
 * @date 2019/10/23 20:14
 */
public class Customer {
    private String name;
    private Vector _rentals = new Vector();

    public Customer(String name) {
        this.name = name;
    }
    public void addRental(Rental arg) {
        _rentals.add(arg);
    }
    public String getName() {
        return name;
    }
    public String statement() {
        double totalAmount = 0;
        int frequentRenterPonts = 0;
        Enumeration rentals = _rentals.elements();
        String result = "Rental Record for " + getName() + "\n";
        while (rentals.hasMoreElements()) {
            double thisAmount = 0;
            Rental each = (Rental) rentals.nextElement();
            //determine amounts for each line
            switch (each.getMovie().getPriceCode()) {
                case Movie.REGULAR:
                    thisAmount += 2;
                    if (each.getDaysRented() > 2)
                        thisAmount += (each.getDaysRented() - 2) * 1.5;
                    break;
                case Movie.NEW_RELEASE:
                    thisAmount += each.getDaysRented() * 3;
                    break;
                case Movie.CHILDRENS:
                    thisAmount += 1.5;
                    if (each.getDaysRented() > 3)
                        thisAmount += (each.getDaysRented() - 3) * 1.5;
                    break;
            }
            //add frequent renter points
            frequentRenterPonts++;
            //add bonus for a two day new release rental
            if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDaysRented() > 1)
                frequentRenterPonts++;
            //show figures for this rental
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;

        }
        //add footer lines
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPonts) + "frequent renter points";
        return result;
    }
}
