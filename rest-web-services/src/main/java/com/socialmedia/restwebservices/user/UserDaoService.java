package com.socialmedia.restwebservices.user;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class UserDaoService {

    private static List<User> users = new ArrayList<>();

    static {
        users.add(new User(1,"Omkar", LocalDate.now().minusYears(30)));
        users.add(new User(2,"Arman", LocalDate.now().minusYears(31)));
        users.add(new User(3,"Santosh", LocalDate.now().minusYears(32)));
    }

    public static List<User> findUsers() {
        return users;
    }
}
