package com.bob.refactoring;

/**
 * @author boblw
 * @title: Movie
 * @projectName refactoring
 * @description: 影片 只是一个简单的纯数据类
 * @date 2019/10/23 19:47
 */
public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String _title;
    private int _priceCode;
    public Movie(String title, int priceCode) {
        this._title = title;
        this._priceCode = priceCode;
    }
    public int getPriceCode() {
        return _priceCode;
    }
    public void setPriceCode(int arg) {
        this._priceCode = arg;
    }
    public String getTitle() {
        return _title;
    }
}
