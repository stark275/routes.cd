package com.routes.routes.domains.exploration.ways;

import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WayService {
    public List<Way> getWays(){
        return List.of(
                new Way(),
                new Way()
        );
    }
}
