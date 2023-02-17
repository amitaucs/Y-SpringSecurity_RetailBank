package com.codetechies.yretailbank.ccontroller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/helpDesk")
public class HelpDeskController {

    @GetMapping("/contactUs")
    public ResponseEntity<String> contactUs(){
        return ResponseEntity.status(HttpStatus.OK).body("Please contact us 1234567890");
    }
}
