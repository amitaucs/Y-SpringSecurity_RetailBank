package com.codetechies.yretailbank.ccontroller;

import jakarta.websocket.server.PathParam;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    @GetMapping("/getBalance/{customerId}")
    public ResponseEntity<String> checkBalance(@PathParam("customerId") String customerId){
        return ResponseEntity.status(HttpStatus.OK).body("Your account balance is : 1000 INR");
    }
}
