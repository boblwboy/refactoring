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
        Movie movie3 = new Movie("Terminator", Movie.REGULAR);
        Movie movie4 = new Movie("black cat", Movie.CHILDRENS);


        Rental rental = new Rental(movie, 1);
        Rental rental1 = new Rental(movie1, 2);
        Rental rental2 = new Rental(movie2, 3);
        Rental rental3 = new Rental(movie3, 4);
        Rental rental4 = new Rental(movie4, 5);


        customer.addRental(rental);
        customer.addRental(rental1);
        customer.addRental(rental2);
        customer.addRental(rental3);
        customer.addRental(rental4);

        System.out.println(customer.statement());

        assertEquals(customer.statement(),"Rental Record for liubob\n" +
                "\ttom and jerry\t1.5\n" +
                "\twind talker\t2.0\n" +
                "\tGemini Man\t9.0\n" +
                "\tTerminator\t5.0\n" +
                "\tblack cat\t4.5\n" +
                "Amount owed is 22.0\n" +
                "You earned 6 frequent renter points");
    }
}