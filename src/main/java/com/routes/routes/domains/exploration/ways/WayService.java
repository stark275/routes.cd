package com.routes.routes.domains.exploration.ways;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WayService {

    @Autowired
    private WayDAO wayDAO;
    public List<Way> getWays(){
        return wayDAO.getWays();
    }

    public Way save(Way way) {
        return wayDAO.save(way);
    }
}
