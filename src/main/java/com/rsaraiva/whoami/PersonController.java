package com.elo7.config.sync;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {

    @RequestMapping("/whoami")
    public Person whoami(@RequestParam(value="name", defaultValue="Rubens") String name) {
        return new Person(name);
    }
}
