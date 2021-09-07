package com.bridgelabz;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class HotelReservationTest {

    //Chceking the Hotel Details.
    HotelReservation obj_hotel1=new HotelReservation("Lakewood","Regular");
    HotelReservation obj_hotel2=new HotelReservation("Bridgewood","Regular");
    HotelReservation obj_hotel3=new HotelReservation("Ridgewood","Regular");

    //checking the cheapest Hotel.
    HotelReservation cheap_hotel=new HotelReservation();

    @Test
    public void toCheck_HotelDetails(){obj_hotel1.hotelDetails();}

    @Test
    public void toCheck_cheapHotel(){cheap_hotel.cheapestHotel();}

    @Test
    public void toCheck_Weekday_Weekend_Rate(){
        obj_hotel1.weekday_weekend_rate();
        obj_hotel2.weekday_weekend_rate();
        obj_hotel3.weekday_weekend_rate();
    }
    


}