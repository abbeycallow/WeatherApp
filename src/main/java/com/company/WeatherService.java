package com.company;

import java.io.IOException;

public class WeatherService  {
    WeatherDao weatherDao = new WeatherDao();
    WeatherDao start = new WeatherDao();

    public void weatherCheck(Weather weather) throws IOException {
        if(weather.getHigh() >= 120) {
            System.out.println("Temp too high SORRY. please restart");
        }
        else if(weather.getLow() <= -30){
            System.out.println("Temp too low SORRY. please restart");
        }

        //else {weatherDao.writeFile(weather);}
        else start.dataConnection(weather);


    }

}

