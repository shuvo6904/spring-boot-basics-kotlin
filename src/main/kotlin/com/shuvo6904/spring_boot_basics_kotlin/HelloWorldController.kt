package com.shuvo6904.spring_boot_basics_kotlin

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloWorldController {

    @GetMapping
    fun helloWorld() = "Hello world!"
}