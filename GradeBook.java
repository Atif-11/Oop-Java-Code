package com.university;

public class GradeBook {
    int bookPrice;
    String bookName;

    public static void main(String[] args) {
        GradeBook b1;
        GradeBook b2;
        GradeBook b3;
        b1 = new GradeBook();
        b2 = new GradeBook();
        b3 = new GradeBook();
        b1.bookPrice = 500;
        b3 = b1;
        b2.bookPrice = 700;
        b2 = b3;
        b3.bookPrice = 50;
        System.out.printf("%s\n%d",b1.bookName,b2.bookPrice);

    }
}
