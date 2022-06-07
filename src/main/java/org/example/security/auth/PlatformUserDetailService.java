package org.example.security.auth;

import org.example.security.common.exception.BusinessException;
import org.example.security.domain.entity.PlatformUser;
import org.example.security.domain.reposities.PlatformUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Component
public class PlatformUserDetailService implements UserDetailsService {

    @Autowired
    private PlatformUserRepository platformUserRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        PlatformUser platformUser = platformUserRepository.queryTopByUsername(username);
        if (Objects.isNull(platformUser)) {
            throw new BusinessException("user not exist");
        }
        return platformUser;
    }
}
