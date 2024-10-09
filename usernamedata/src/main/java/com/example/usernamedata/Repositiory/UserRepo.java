package com.example.usernamedata.Repositiory;

import com.example.usernamedata.Entity.UserMetaData;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserMetaData, Long> {
    UserMetaData save(UserMetaData userdata);
    UserMetaData findAllByuniqueId(String uniqueId);

}
