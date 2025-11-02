package com.sweetshop.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.sweetshop.backend.model.Sweet;
import com.sweetshop.backend.repository.SweetRepository;
import java.util.List;

@RestController
@RequestMapping("/api/sweets")
public class SweetController {

    @Autowired
    private SweetRepository sweetRepository;

    @GetMapping
    public List<Sweet> getAllSweets() {
        return sweetRepository.findAll();
    }

    @PostMapping
    public Sweet addSweet(@RequestBody Sweet sweet) {
        return sweetRepository.save(sweet);
    }
}
