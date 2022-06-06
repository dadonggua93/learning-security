package org.example.security.domain.entity;

import lombok.Data;
import org.example.security.common.constant.RoleEnum;
import org.hibernate.annotations.Where;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Collection;
import java.util.List;

@Where(clause = "del_flag = '0'")
@Table(name = "user")
@Data
public class PlatformUser extends BaseEntity implements UserDetails {

    @Id
    private Long id;

    private String username;

    private String password;


    private String roles;

    private String nickname;
    private String email;
    private String mobile;
    private String address;
    @Column(name = "account_status")
    private String accountStatus;
    @Column(name = "lock_status")
    private String lockStatus;


    private List<GrantedAuthority> authorities;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
