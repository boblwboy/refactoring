package com.bob.refactoring;

import org.junit.Test;


import static org.junit.Assert.*;

/**
 * @author boblw
 * @title: CustomerTest
 * @projectName refactoring
 * @description: 测试代码
 * @date 2019/10/26 17:05
 */
public class CustomerTest {

    @Test
    public void statement() {

        Customer customer = new Customer("liubob");

        Movie movie = new Movie("tom and jerry", Movie.CHILDRENS);
        Movie movie1 = new Movie("wind talker", Movie.REGULAR);
        Movie movie2 = new Movie("Gemini Man", Movie.NEW_RELEASE);

        Rental rental = new Rental(movie, 1);
        Rental rental1 = new Rental(movie1, 2);
        Rental rental2 = new Rental(movie2, 3);

        customer.addRental(rental);
        customer.addRental(rental1);
        customer.addRental(rental2);

        System.out.println(customer.statement());

        assertEquals(customer.statement(),"Rental Record for liubob\n" +
                "\ttom and jerry\t1.5\n" +
                "\twind talker\t2.0\n" +
                "\tGemini Man\t9.0\n" +
                "Amount owed is 12.5\n" +
                "You earned 4 frequent renter points");
    }

    @Test
    public void statement1Rental() {

        Customer customer = new Customer("liubob");

        Movie movie = new Movie("tom and jerry", Movie.CHILDRENS);

        Rental rental = new Rental(movie, 1);

        customer.addRental(rental);

        System.out.println(customer.statement());

        assertEquals(customer.statement(),"Rental Record for liubob\n" +
                "\ttom and jerry\t1.5\n" +
                "Amount owed is 1.5\n" +
                "You earned 1 frequent renter points");
    }

    @Test
    public void statement2Rental() {

        Customer customer = new Customer("liubob");

        Movie movie1 = new Movie("wind talker", Movie.REGULAR);
        Movie movie2 = new Movie("Gemini Man", Movie.NEW_RELEASE);

        Rental rental1 = new Rental(movie1, 2);
        Rental rental2 = new Rental(movie2, 3);

        customer.addRental(rental1);
        customer.addRental(rental2);

        System.out.println(customer.statement());

        assertEquals(customer.statement(),"Rental Record for liubob\n" +
                "\twind talker\t2.0\n" +
                "\tGemini Man\t9.0\n" +
                "Amount owed is 11.0\n" +
                "You earned 3 frequent renter points");
    }
}