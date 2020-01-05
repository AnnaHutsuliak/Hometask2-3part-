package com.epam.hometask2;
public class Hometask2 {
    public static void main(String[] arg) {
        int deposit = 10_000;
        int month = 6;
        int percent = 12;
        int percentage_profit_year = deposit*percent/100;
        System.out.println("profit_for_year="+percentage_profit_year);
        int percentage_profit_6month = percentage_profit_year/12*month;
        System.out.println("profit_for_sixmonth="+percentage_profit_6month);
