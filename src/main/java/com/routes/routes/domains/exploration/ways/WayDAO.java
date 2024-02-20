package com.routes.routes.domains.exploration.ways;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Repository
public class WayDAO {
    @Autowired
    private WayRepository repository;

    public List<Way> getWays(){
        return repository.findAll();
    }

    public Way save(Way way) {
        return repository.save(way);
    }
}
