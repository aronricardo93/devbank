package com.DevBank.service;

import com.DevBank.domain.models.User;

public interface UserService {

    User findById(Long id);
    User create(User user);

}
