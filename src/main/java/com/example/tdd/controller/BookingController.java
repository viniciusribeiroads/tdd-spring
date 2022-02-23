package com.example.tdd.controller;

import com.example.tdd.model.BookingModel;
import com.example.tdd.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/bookings")
public class BookingController {



    @GetMapping
    public String getAll(){
        return "ok";

    }

    @PostMapping
    public ResponseEntity<BookingModel> save(@RequestBody BookingModel bookingModel){
        return ResponseEntity.ok().body(bookingModel);
    }
}
