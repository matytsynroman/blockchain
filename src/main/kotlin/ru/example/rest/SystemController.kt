package ru.example.rest

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/system")
class SystemController {


    @GetMapping("/healthCheck")
    fun healthCheck(): ResponseEntity<String> {
        return ResponseEntity.ok("Application feels well")
    }
}