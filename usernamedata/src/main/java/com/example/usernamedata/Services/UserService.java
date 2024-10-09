package com.example.usernamedata.Services;

import com.example.usernamedata.Entity.UserMetaData;
import com.example.usernamedata.Repositiory.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public UserMetaData saveUserMetaDataTODB(UserMetaData metaData) {
//        return userRepo.save(metaData);
        return userRepo.save(metaData);
    }
    public UserMetaData getUserMetaDetailFromDB(String userId) {
        return userRepo.findAllByuniqueId(userId);
    }
}
