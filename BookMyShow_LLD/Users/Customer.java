package BookMyShow_LLD.Users;

import BookMyShow_LLD.Booking.Booking;

import java.util.List;

public class Customer extends Person {

    public boolean makeBooking(Booking booking){
        return true;
    }
    public List<Booking> getBookings(){
        return null;
    }

}
