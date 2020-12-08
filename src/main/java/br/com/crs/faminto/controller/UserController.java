package br.com.crs.faminto.controller;

import br.com.crs.faminto.model.entities.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/user")
public class UserController {

    @GetMapping( path = "/{id}")
    public ResponseEntity<User> getUser(@PathVariable Long id){
        User hello = new User();
        hello.setId(id);
        hello.setName("R");
        hello.setCpf("1451");
        hello.setAge(1);
        return new ResponseEntity<>(hello, HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers(){

        List<User> userList = new ArrayList<>();

        User user1 = new User();
        user1.setId(1L);
        user1.setName("R");
        user1.setCpf("1451");
        user1.setAge(1);

        User user2 = new User();
        user2.setId(2L);
        user2.setName("C");
        user2.setCpf("1451");
        user2.setAge(1);

        userList.add(user1);
        userList.add(user2);

        return new ResponseEntity<>(userList, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<User> createUser(@RequestBody User user){

        return new ResponseEntity<>(user, HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<User> update(@RequestBody User user){
        User userResponse = user;
        userResponse.setName("Caio");

        return new ResponseEntity<>(userResponse, HttpStatus.OK);
    }



}
