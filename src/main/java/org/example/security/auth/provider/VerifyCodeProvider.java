package org.example.security.auth.provider;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

@Component
public class VerifyCodeProvider extends DaoAuthenticationProvider {


    @Override
    protected void additionalAuthenticationChecks(UserDetails userDetails, UsernamePasswordAuthenticationToken authentication) throws AuthenticationException {
        // 图形验证码校验
        Object details = authentication.getDetails();
        super.additionalAuthenticationChecks(userDetails, authentication);
    }
}
