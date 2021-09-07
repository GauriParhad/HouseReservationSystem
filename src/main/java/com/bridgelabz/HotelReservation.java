package com.bridgelabz;

public class HotelReservation{
    String hotel;
    String customer;

    HotelReservation(String hotel,String customer){
        this.hotel=hotel;
        this.customer=customer;

    }

        void hotelDetails () {
            if (hotel1 == "Lakewood") {
                int rate = 110;
                System.out.println("Rate of regular customers of lakewood hotel" + rate);
            }
            if (hotel2 == "Bridgewood") {
                int rate = 160;
                System.out.println("Rate of regular customers of Bridgewood hotel" + rate);
            }
            if (hotel3 == "Ridgewood") {
                int rate = 220;
                System.out.println("Rate of regular customers of Ridgewood hotel" + rate);
            }
        }

    public static void main(String[] args) {
        HotelReservation obj_hotel1 = new HotelReservation("Lakewood", "Regular");
        HotelReservation obj_hotel2 = new HotelReservation("Bridgewood", "Regular");
        HotelReservation obj_hotel3 = new HotelReservation("Ridgewood", "Regular");
        hotel1.hotelDetails();
        hotel2.hotelDetails();
        hotel3.hotelDetails();
    }
}

