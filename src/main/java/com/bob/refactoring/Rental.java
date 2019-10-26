package com.bob.refactoring;

/**
 * @author boblw
 * @title: Rental
 * @projectName refactoring
 * @description: 租赁 表示某个顾客租了一部影片
 * @date 2019/10/23 19:54
 */
public class Rental {
    private Movie _movie;
    private int _daysRented;
    public Rental(Movie movie, int daysRented) {
        this._movie = movie;
        this._daysRented = daysRented;
    }
    public int getDaysRented() {
        return _daysRented;
    }
    public Movie getMovie() {
        return _movie;
    }
}
