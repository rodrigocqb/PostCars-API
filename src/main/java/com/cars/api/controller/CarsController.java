package com.cars.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cars.api.dto.CarDTO;

@RestController
@RequestMapping("/api")
public class CarsController {

    @PostMapping("/cars")
    public void create(@RequestBody CarDTO req) {
        System.out.println(req.modelo());
        System.out.println(req.fabricante());
        System.out.println(req.dataFabricacao());
        System.out.println(req.valor());
        System.out.println(req.anoModelo());
    }
}
