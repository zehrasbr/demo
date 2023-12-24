package com.example.demo.controller;

import com.example.demo.controller.entity.Person;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/person")
public class PersonController {
    @GetMapping(path = "/getirServisBilgisi")
    public String getirServisBilgisi() {
        return "Merhaba";
    }
    /*@GetMapping(path="/getPerson")
    public Person getirPerson(){
        Person person = new Person();
        return person;
    }*/
    @GetMapping(path = "/getPerson/{pathVeriable}")
    public Person getirPerson(@PathVariable Person pathVeriable){
    return pathVeriable;
    }
    @GetMapping(path = "/getPerson")
    public Person getPerson(@RequestParam Person requestParam){
        return requestParam;
    }
    /*
    @PostMapping("/kaydet")
    public Person kaydet(@RequestBody Person requestPerson){
        Person person = new Person();
        person.setName(requestPerson.getName());
        person.setSurname(requestPerson.getSurname());
        return person;
    }*/
}
