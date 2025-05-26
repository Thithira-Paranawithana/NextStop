package com.dotsline.bus_service.dao;

import com.dotsline.bus_service.model.Seat;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SeatRepository extends JpaRepository<Seat, Integer> {
    List<Seat> findByBusId(Integer busId);
}
