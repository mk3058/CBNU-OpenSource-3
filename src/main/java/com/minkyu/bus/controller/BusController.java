package com.minkyu.bus.controller;

import com.minkyu.bus.presentation.dto.PositionResponse;
import com.minkyu.bus.service.BusService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/bus")
public class BusController {

    private final BusService busService;

    @GetMapping("")
    public List<PositionResponse> getPositionsByBusId(@RequestParam String busId) {
        return busService.getBusPositions(busId);
    }
}

