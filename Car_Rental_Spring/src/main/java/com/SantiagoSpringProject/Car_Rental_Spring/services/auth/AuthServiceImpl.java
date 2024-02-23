package com.SantiagoSpringProject.Car_Rental_Spring.services.auth;

import com.SantiagoSpringProject.Car_Rental_Spring.dto.SignupRequest;
import com.SantiagoSpringProject.Car_Rental_Spring.dto.UserDto;
import com.SantiagoSpringProject.Car_Rental_Spring.entity.User;
import com.SantiagoSpringProject.Car_Rental_Spring.enums.UserRole;
import com.SantiagoSpringProject.Car_Rental_Spring.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthServiceImpl implements AuthService{
    private final UserRepository userRepository;

    @Override
    public UserDto createCustomer(SignupRequest signupRequest) {
        User user= new User();
        user.setName(signupRequest.getName());
        user.setEmail(signupRequest.getEmail());
        user.setPassword(signupRequest.getPassword());
        user.setUserRole(UserRole.CUSTOMER);
        User createdUser=userRepository.save(user);
        UserDto userDto = new UserDto();
        userDto.setId(createdUser.getId());
        return userDto;
    }

    @Override
    public boolean hasCustomerWithEmail(String email) {
        return userRepository.findFirstByEmail(email).isPresent();
    }
}
