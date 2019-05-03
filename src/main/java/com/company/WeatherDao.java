package com.company;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.*;
import java.util.*;
import java.sql.*;

public class WeatherDao {

    public void writeFile(Weather weather)throws IOException {
       // Date date = new Date();
        //weather.setDateCreated(date);
        BufferedWriter buffer = new BufferedWriter(new FileWriter(weather.getCity() +  ".txt", true));


       // buffer.write(String.valueOf(weather.getDateCreated()));
        buffer.write(String.valueOf(weather));
        buffer.newLine();

        buffer.close();
    }

    private void viewReport (Weather weather) throws IOException {

        System.out.println("\n WEATHER REPORT : ");
        FileReader file = new FileReader( weather.getCity() + ".txt" );
        BufferedReader buffer = new BufferedReader(file);

        //this loop files the char and prints them to screen.
        int i;
        while((i=buffer.read())!=-1){
            System.out.print((char)i);
        }

        //closes reader
        buffer.close();
        //closes file
        file.close();
    }
    public void dataConnection(Weather weather){

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/weatherapp?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

            Connection con = DriverManager.getConnection(url, "root", "password");

            String insertQueryStatement = "INSERT  INTO  weathertable (city,state,high,low)" + "VALUES (?, ?, ?, ?)";

            PreparedStatement preparedStatement = con.prepareStatement(insertQueryStatement);

            preparedStatement.setString(1, weather.getCity());
            preparedStatement.setString(2,weather.getState());
            preparedStatement.setInt(3,weather.getHigh());
            preparedStatement.setInt(4,weather.getLow());


           preparedStatement.execute();
           con.close();

        }catch(Exception e){ System.out.println(e);}
    }
}
