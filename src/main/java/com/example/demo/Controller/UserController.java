package com.example.demo.Controller;

import com.example.demo.Model.User;
import com.example.demo.Repository.UserRepository;
import jakarta.persistence.Id;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class UserController {

    @Autowired
    UserRepository userRepository;

    @GetMapping("/getallusers")
    public List<User> getallUsers(User user) {
        return userRepository.findAll();
    }

    @GetMapping("/getallusers/{Id}")
    public User getUserById(@PathVariable Long Id) {
        Optional<User> user = userRepository.findById(Id);
        return user.orElse((null));
    }

    @PutMapping("/updateuser/{Id}")
    public User updateuserById(@PathVariable Long Id, @RequestBody User userDetails) {
        Optional<User> optionalUser = userRepository.findById(Id);
        User user = optionalUser.get();
        user.setFullName(userDetails.getFullName());
        user.setEmail(userDetails.getEmail());
        user.setRole(userDetails.getRole());
        userRepository.save(user);
        return user;
    }

    @PostMapping("/createuser")
    public User createUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @DeleteMapping("/deleteuser/{Id}")
    public String deleteUser(@PathVariable Long Id) {
        userRepository.deleteById(Id);
        return "Deletiion succesful";
    }


}