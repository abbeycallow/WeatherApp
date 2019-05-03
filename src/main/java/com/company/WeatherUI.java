package com.company;
import java.io.IOException;
import java.util.Scanner;

public class WeatherUI {

    public static void main(String[] args) throws IOException {


       System.out.println("Welcome to your own personal weather app :)");

        System.out.println("Please enter the city");
        String city = new Scanner(System.in).nextLine();

        System.out.println("please enter the state");
        String state = new Scanner(System.in).nextLine();

        System.out.println("please enter the high for today");
        int high = new Scanner(System.in).nextInt();

        System.out.println("please enter the low for today");
        int low = new Scanner(System.in).nextInt();

        Weather weather = new Weather(high, low, city, state);
        WeatherService weatherService = new WeatherService();
        weatherService.weatherCheck(weather);
    }
}
