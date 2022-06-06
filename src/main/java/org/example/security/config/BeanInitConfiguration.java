package org.example.security.config;

import com.google.code.kaptcha.Producer;
import com.google.code.kaptcha.impl.DefaultKaptcha;
import com.google.code.kaptcha.util.Config;
import org.example.security.common.constant.SecurityConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.provisioning.JdbcUserDetailsManager;

import javax.sql.DataSource;
import java.util.Properties;

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

    /**
     * 图形验证码
     */
    @Bean
    public Producer captcha() {
        Properties properties = new Properties();
        properties.setProperty("kaptcha.image.width", "150");
        properties.setProperty("kaptcha.image.height", "50");
        properties.setProperty("kaptcha.textproducer.char.string", "01234567890");
        properties.setProperty("kaptcha.textproducer.char.length", "4");

        DefaultKaptcha defaultKaptcha = new DefaultKaptcha();
        defaultKaptcha.setConfig(new Config(properties));
        return defaultKaptcha;

    }
}
