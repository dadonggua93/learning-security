package org.example.security.config;

import org.example.security.constant.SecurityConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.jaas.memory.InMemoryConfiguration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

import javax.sql.DataSource;

@Configuration
public class BeanInitConfiguration {
// 基于内存的 user detail
//    @Bean
//    public UserDetailsService userDetailsService() {
//        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager();
//        manager.createUser(User.withUsername("user").password(new BCryptPasswordEncoder().encode("123456")).roles(SecurityConstant.ROLE_USER).build());
//        manager.createUser(User.withUsername("root").password(new BCryptPasswordEncoder().encode("123456")).roles(SecurityConstant.ROLE_ADMIN).build());
//        return manager;
//    }

    @Autowired
    private DataSource dataSource;

    @Bean
    public UserDetailsService userDetailsService() {
        JdbcUserDetailsManager manager = new JdbcUserDetailsManager();
        manager.setDataSource(dataSource);
        manager.createUser(User.withUsername("user").password(new BCryptPasswordEncoder().encode("123456")).roles(SecurityConstant.ROLE_USER).build());
        manager.createUser(User.withUsername("root").password(new BCryptPasswordEncoder().encode("123456")).roles(SecurityConstant.ROLE_ADMIN).build());
        return manager;
    }


}
