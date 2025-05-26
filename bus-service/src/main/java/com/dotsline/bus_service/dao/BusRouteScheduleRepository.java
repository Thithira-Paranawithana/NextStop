package com.dotsline.bus_service.dao;

import com.dotsline.bus_service.model.BusRouteSchedule;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BusRouteScheduleRepository extends JpaRepository<BusRouteSchedule, Integer> {
}
