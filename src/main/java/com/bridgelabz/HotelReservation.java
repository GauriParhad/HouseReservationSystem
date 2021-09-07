package com.bridgelabz;

import java.text.SimpleDateFormat;

public class HotelReservation{
    String hotel;
    String customer;

    HotelReservation(String hotel,String customer){
        this.hotel=hotel;
        this.customer=customer;

    }

        void hotelDetails () {
            if (hotel == "Lakewood") {
                int rate = 110;
                System.out.println("Rate of regular customers of lakewood hotel" + rate);
            }
            if (hotel == "Bridgewood") {
                int rate = 160;
                System.out.println("Rate of regular customers of Bridgewood hotel" + rate);
            }
            if (hotel == "Ridgewood") {
                int rate = 220;
                System.out.println("Rate of regular customers of Ridgewood hotel" + rate);
            }
        }
        void cheapestHotel(){
        int count=0;
        count=(count+2);
        int Lakewood_Rate=110,Bridgewood_Rate=160,Ridgewood_Rate=220;
        Lakewood_Rate=(Lakewood_Rate*count);
        Ridgewood_Rate=(Ridgewood_Rate*count);
        if (Lakewood_Rate<Bridgewood_Rate && Lakewood_Rate<Ridgewood_Rate){
            System.out.println("Lakewood");
            System.out.println(Lakewood_Rate);
        }
            if (Bridgewood_Rate<Lakewood_Rate && Bridgewood_Rate<Ridgewood_Rate>) {
                System.out.println("Bridgewood");
                System.out.println(Bridgewood_Rate);
            }
            if (Ridgewood_Rate<Bridgewood_Rate && Ridgewood_Rate<Lakewood_Rate>) {
                System.out.println("Ridgewood");
                System.out.println(Ridgewood_Rate);
            }

        }

    public static void main(String[] args) {
        HotelReservation obj_hotel1 = new HotelReservation("Lakewood", "Regular");
        HotelReservation obj_hotel2 = new HotelReservation("Bridgewood", "Regular");
        HotelReservation obj_hotel3 = new HotelReservation("Ridgewood", "Regular");
        hotel1.hotelDetails();
        hotel2.hotelDetails();
        hotel3.hotelDetails();
        String sDate1 = "10-09-2019";
        String sDate2 = "20-09-2019";
        Date date1 = new SimpleDateFormat("dd-MM-yyyy").parse(sDate1);
        Date date2 = new SimpleDateFormat("dd-MM-yyyy").parse(sDate2);
        System.out.println(sDate1 + "\t" + date1);
        System.out.println(sDate2 + "\t" + date2);
        HotelReservation hotel = new HotelReservation();
        hotel.cheapestHotel();
    }

}

