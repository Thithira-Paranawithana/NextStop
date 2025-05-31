package com.dotsline.bus_service.controller;

import com.dotsline.bus_service.model.Seat;
import com.dotsline.bus_service.service.SeatService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("seats")
public class SeatController {

    @Autowired
    private SeatService seatService;

//    @GetMapping("/bus/{busId}")
//    public ResponseEntity<List<Seat>> getSeatsByBus(@PathVariable Integer busId) {
//        return ResponseEntity.ok(seatService.getSeatsByBusId(busId));
//    }

    @GetMapping("/bus/{busId}")
    public ResponseEntity<List<Seat>> getSeatsByBusId(@PathVariable Integer busId) {
        List<Seat> seats = seatService.getSeatsByBusId(busId);
        return ResponseEntity.ok(seats);
    }


    @GetMapping("/seats/{id}")
    public ResponseEntity<Seat> getSeatById(@PathVariable Integer id) {
        return seatService.getSeatById(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

}
