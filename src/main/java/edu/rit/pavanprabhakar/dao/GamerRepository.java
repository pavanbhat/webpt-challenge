package edu.rit.pavanprabhakar.dao;

import edu.rit.pavanprabhakar.entity.Gamer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GamerRepository extends MongoRepository<Gamer, String> {
    boolean findBySource_player_idIsFalse(String source_player_id);
}
