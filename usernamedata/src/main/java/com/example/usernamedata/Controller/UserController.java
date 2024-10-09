package com.example.usernamedata.Controller;

import com.example.usernamedata.Entity.UserMetaData;
import com.example.usernamedata.Services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/amazon/users/")
public class UserController {
    @Autowired
    UserService userService;
    @PostMapping("SaveUserDetail")
    public UserMetaData SaveUserDetail(@RequestBody UserMetaData userData) {
        UserMetaData user= userService.saveUserMetaDataTODB(userData);
        return user;

    }
    @GetMapping("getUserDetails/{userId}")
    public UserMetaData getUserDetails(@PathVariable String userId) {
       UserMetaData user= userService.getUserMetaDetailFromDB(userId);
		return user;
    }
}
