package com.dailycodework.ilibrary.security;

import com.dailycodework.ilibrary.Entity.User;
import com.dailycodework.ilibrary.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
@RequiredArgsConstructor
public class LibraryUserDetailsService implements UserDetailsService {

    private final UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepository.findByEmail(username)
                .map(LibraryUserDeatils::new)
                .orElseThrow(() -> new UsernameNotFoundException("No user found"));
    }

}
