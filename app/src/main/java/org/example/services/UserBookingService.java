package org.example.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.example.entity.User;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class UserBookingService {
    private static final String TRAINS_PATH = "org/example/localDB/trains.json";
    private static final String USERS_PATH = "org/example/localDB/users.json";
    private ObjectMapper objectMapper = new ObjectMapper();
    private User user;

    private List<User> userList;

    public UserBookingService(User user) throws IOException {

        this.user = user;
        File users = new File(USERS_PATH);
        userList = objectMapper.readValue(users, new TypeReference<List<User>>() {
        });
    }
}
