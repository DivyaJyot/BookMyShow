package com.fav.BookMyshow.model;

import java.time.LocalDateTime;
import java.util.List;

public class Ticket extends BaseModel{
    private LocalDateTime timeOfBooking;
    private double amount;
    private List<ShowSeats> showSeatsList;
}
