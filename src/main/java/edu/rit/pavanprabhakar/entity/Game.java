package edu.rit.pavanprabhakar.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Game {
    private String status;
    private String reason;
    private List<Gamer> payload;

    public Game() {
    }

    public Game(String status, String reason, List<Gamer> payload) {
        this.status = status;
        this.reason = reason;
        this.payload = payload;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public List<Gamer> getPayload() {
        return payload;
    }

    public void setPayload(List<Gamer> payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        return "Game{" +
                "status='" + status + '\'' +
                ", reason='" + reason + '\'' +
                ", payload=" + payload +
                '}';
    }
}
