package com.techelevator.reservations.controllers;

import com.techelevator.reservations.dao.HotelDao;
import com.techelevator.reservations.dao.MemoryHotelDao;
import com.techelevator.reservations.dao.MemoryReservationDao;
import com.techelevator.reservations.dao.ReservationDao;
import com.techelevator.reservations.model.Hotel;
import com.techelevator.reservations.model.Reservation;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.Null;
import java.util.List;

@RestController
public class HotelController<get> {

    private HotelDao hotelDao;
    private ReservationDao reservationDao;

    public HotelController() {
        this.hotelDao = new MemoryHotelDao();
        this.reservationDao = new MemoryReservationDao(hotelDao);
    }

    /**
     * Return All Hotels
     *
     * @return a list of all hotels in the system
     */
    @RequestMapping(path = "/hotels", method = RequestMethod.GET)
    public List<Hotel> list() {
        return hotelDao.list();
    }

    /**
     * Return hotel information
     *
     * @param hotelId the id of the hotel
     * @return all info for a given hotel
     */
    @RequestMapping(path = "/hotels/{hotelId}", method = RequestMethod.GET)
    public Hotel get(@PathVariable int hotelId) {
        return hotelDao.get(hotelId);
    }


    /*
    Return all reservations
     */
    @RequestMapping(path = "/reservations", method = RequestMethod.GET)
    public List<Reservation> listReservations() {
        return reservationDao.findAll();
    }

    /*
    Return a single reservation
     */
    @GetMapping(path = "/reservations/{resId")

    public Reservation getReservation(@PathVariable int resId) {
        return reservationDao.get(resId);
    }
    @GetMapping(path = "/hotels/{hotelId/reservations")
       public List<Reservation> getReservationsForHotel(@PathVariable int hotelId) {
        return reservationDao.findByHotel(hotelId);
    }
    @PostMapping(path = "/reservations")

    public Reservation addReservation(@RequestBody Reservation newReservation) {
        return reservationDao.create(newReservation, newReservation.getHotelID());
    }
    /*
    Filter hotels by state and optionally by city
     */
    @GetMapping(path = "/hotels/filter")
    public List<Hotel> filterHotels(@RequestParam(required = false) String city, @RequestParam String state) {
        return null;
    }
}
