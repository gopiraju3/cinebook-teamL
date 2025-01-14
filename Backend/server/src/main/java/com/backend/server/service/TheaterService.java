package com.backend.server.service;

import com.backend.server.Model.User;

import java.util.Optional;


public interface TheaterService {
    public User addUser(User user);
    public Optional<User> getUser(String email);

    User updateUser(User user);

    String deleteUser(String mobileNumber);

//    Inventory addItemToCart(Inventory inventory);
    int getAvailableTickets(int theaterId);
}
