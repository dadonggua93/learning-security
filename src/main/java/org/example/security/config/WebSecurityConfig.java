package org.example.security.config;

import org.example.security.common.constant.SecurityConstant;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests()
                .antMatchers("/admin/**").hasAnyAuthority(SecurityConstant.ROLE_ADMIN)
                .antMatchers("/user/**").hasAnyAuthority(SecurityConstant.ROLE_USER)
                .antMatchers("/captcha/**").permitAll()
                .anyRequest().authenticated()
                .and().csrf().disable()
                .formLogin()
                .and().httpBasic();

    }


}
