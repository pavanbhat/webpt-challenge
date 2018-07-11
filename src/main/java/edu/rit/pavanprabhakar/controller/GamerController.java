package edu.rit.pavanprabhakar.controller;

import edu.rit.pavanprabhakar.entity.Gamer;
import edu.rit.pavanprabhakar.service.GamerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = { "http://localhost:8080" , "http://localhost:4200" }, maxAge = 6000)
@RestController
@RequestMapping("/api")
public class GamerController {

    @Autowired
    private GamerService gamerService;

    // Get all gamers
    @GetMapping(value = "/gamers")
    public List<Gamer> getAllGamers(){
        return this.gamerService.getAllGamers();
    }

    // Get a gamer by source_player_id

    // Update a gamer

    // Add a gamer

    // Remove a gamer by source_player_id
}
