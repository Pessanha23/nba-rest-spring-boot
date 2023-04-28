package com.example.nbarestspringboot.service;

import com.example.nbarestspringboot.entities.Team;
import com.example.nbarestspringboot.repositories.TeamRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TeamService {

    @Autowired
    private TeamRepository teamRepository;

    public List<Team> findAll() {
        return teamRepository.findAll();
    }

    public Team findById(Integer id) {
        Optional<Team> obj = teamRepository.findById(id);
        return obj.orElseThrow(() -> new RuntimeException(String.valueOf(id)));
    }

    public Team insert(Team obj) {
        List<Team> allTeams = teamRepository.findAll();
        if (obj.getName().isEmpty()) {
            throw new RuntimeException();
        }
        for (Team allTeam : allTeams) {
            if (allTeam.getName().equals(obj.getName())) {
                throw new RuntimeException();
            }
        }
        return teamRepository.save(obj);
    }

}
