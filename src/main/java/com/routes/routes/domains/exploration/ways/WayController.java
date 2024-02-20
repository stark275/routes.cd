package com.routes.routes.domains.exploration.ways;


import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/ways")
@AllArgsConstructor
public class WayController  {

    private final WayService wayService;
    @GetMapping
    public List<Way> getWays(){
        return wayService.getWays();
    }

    @PostMapping
    public ResponseEntity<Way> save(@RequestBody Way way){
        return ResponseEntity.ok(wayService.save(way));
    }
}
