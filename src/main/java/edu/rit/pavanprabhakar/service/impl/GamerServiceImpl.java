package edu.rit.pavanprabhakar.service.impl;

import edu.rit.pavanprabhakar.dao.GamerRepository;
import edu.rit.pavanprabhakar.entity.Gamer;
import edu.rit.pavanprabhakar.service.GamerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GamerServiceImpl implements GamerService {

    @Autowired
    private GamerRepository gamerRepository;

    @Override
    public List<Gamer> getAllGamers() {
        return this.gamerRepository.findAll();
    }
}
