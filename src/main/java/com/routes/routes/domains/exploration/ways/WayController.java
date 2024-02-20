package com.routes.routes.domains.exploration.ways;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/ways")
@AllArgsConstructor
public class WayController  {

    private final WayService wayService;
    @GetMapping("all")
    public List<Way> getWays(){
        return wayService.getWays();
    }
}
