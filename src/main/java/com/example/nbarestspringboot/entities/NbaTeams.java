package com.example.nbarestspringboot.entities;
import java.util.List;

public class NbaTeams {

    private List<Team> easternConference;
    private List<Team> westernConference;

    public NbaTeams(List<Team> easternConference, List<Team> westernConference) {
        this.easternConference = easternConference;
        this.westernConference = westernConference;
    }

    public List<Team> getEasternConference() {
        return easternConference;
    }

    public void setEasternConference(List<Team> easternConference) {
        this.easternConference = easternConference;
    }

    public List<Team> getWesternConference() {
        return westernConference;
    }

    public void setWesternConference(List<Team> westernConference) {
        this.westernConference = westernConference;
    }
}
