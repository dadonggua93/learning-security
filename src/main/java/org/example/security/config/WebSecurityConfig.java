package org.example.security.config;

import org.example.security.constant.SecurityConstant;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests()
                .antMatchers("/admin/**").hasRole(SecurityConstant.ROLE_ADMIN)
                .antMatchers("/user/**").hasRole(SecurityConstant.ROLE_USER)
                .anyRequest().authenticated().and().formLogin().and().httpBasic();

    }
}
