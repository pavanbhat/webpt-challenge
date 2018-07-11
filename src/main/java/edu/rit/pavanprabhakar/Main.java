package edu.rit.pavanprabhakar;

import edu.rit.pavanprabhakar.dao.GamerRepository;
import edu.rit.pavanprabhakar.entity.Game;
import edu.rit.pavanprabhakar.entity.Gamer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Main {

    private static final Logger log = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder restTemplateBuilder){
        return restTemplateBuilder.build();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate, GamerRepository gamerRepository) throws Exception {
        return args -> {
            Game game = restTemplate.getForObject("http://interview.wptdev.com/api/killfeed", Game.class);
            log.info(game.toString());
            gamerRepository.insert(game.getPayload());
        };
    }




}
