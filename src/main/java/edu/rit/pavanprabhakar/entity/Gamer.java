package edu.rit.pavanprabhakar.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Gamer {

    private String platform;
    private String region;
    private String source_player_id;
    private String source_character;
    private String target_player_id;
    private String target_character;
    private long damage;

    public Gamer() {
    }

    public Gamer(String platform, String region, String source_player_id, String source_character, String target_player_id, String target_character, long damage) {
        this.platform = platform;
        this.region = region;
        this.source_player_id = source_player_id;
        this.source_character = source_character;
        this.target_player_id = target_player_id;
        this.target_character = target_character;
        this.damage = damage;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getSource_player_id() {
        return source_player_id;
    }

    public void setSource_player_id(String source_player_id) {
        this.source_player_id = source_player_id;
    }

    public String getSource_character() {
        return source_character;
    }

    public void setSource_character(String source_character) {
        this.source_character = source_character;
    }

    public String getTarget_player_id() {
        return target_player_id;
    }

    public void setTarget_player_id(String target_player_id) {
        this.target_player_id = target_player_id;
    }

    public String getTarget_character() {
        return target_character;
    }

    public void setTarget_character(String target_character) {
        this.target_character = target_character;
    }

    public long getDamage() {
        return damage;
    }

    public void setDamage(long damage) {
        this.damage = damage;
    }

    @Override
    public String toString() {
        return "Gamer{" +
                "platform='" + platform + '\'' +
                ", region='" + region + '\'' +
                ", source_player_id='" + source_player_id + '\'' +
                ", source_character='" + source_character + '\'' +
                ", target_player_id='" + target_player_id + '\'' +
                ", target_character='" + target_character + '\'' +
                ", damage=" + damage +
                '}';
    }
}
