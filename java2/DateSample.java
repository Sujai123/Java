/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.time.LocalDateTime;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.LocalTime;

/**
 *
 * @author HP
 */
public class DateSample {
    public static void main(String[] args){
        String str="17:45:18",str1="02:03:05";
        //SimpleDateFormatter format1=new SimpleDateFormatter("HH:MM:SS");
        //Date d1=new Date(str);
        Date d2=new Date();
       // LocalDateTime t1=LocalDateTime.parse(str);
        LocalDateTime t2=LocalDateTime.parse("2002-12-12T02:03:05");
        System.out.println(" "+t2+" ");
        int hh=t2.getHour();
        hh--;
        int mm=t2.getMinute();
        mm--;
        int ss=t2.getSecond();
        ss--;
        String str2="0"+hh+":"+"0"+mm+":"+"0"+ss;
        LocalTime t3=LocalTime.of(hh,mm,ss);
        System.out.println(t3);
    }
}
