package hust.soict.hedspi.MyDate;

import java.util.Scanner;

/**
 *
 * Created by FaceNet Tuan Anh at May 16, 2022
 */
public class MyDate {
    private int day;
    private int month;
    private int year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }
    public MyDate(){
         
    }
    public void print(){
        System.out.println("The date is: Ngày " + day + " Tháng " + month + " Năm " + year);
    }
    public void accept(){
        Scanner dateInput = new Scanner(System.in);
        System.out.print("Day: ");
        setDay(dateInput.nextInt());
        System.out.print("Month: ");
        setMonth(dateInput.nextInt());
        System.out.print("Year: ");
        setYear(dateInput.nextInt());
    }
    public MyDate(String dateFormat){
        System.out.println(dateFormat);
    }
}
