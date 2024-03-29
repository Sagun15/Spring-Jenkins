package com.example.demo.Controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * This is a health check controller for backend
 */
@RestController
public class TestController {


    /**
     * @return health check to determine if server is up and running
     */
    @GetMapping("/api/v2")
    public ResponseEntity health()
    {
        return new ResponseEntity("Helathy2", HttpStatus.OK);
    }
}
