package org.butu.blog.auth;


import lombok.Data;
import org.butu.blog.entity.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Set;

/**
 * @author BUTUbird
 */
@Data
public class MyUserDetails implements UserDetails {

    private User user;
    private String password;
    private  String username;
    private  Set<GrantedAuthority> authorities;
    private  boolean accountNonExpired= true;
    private  boolean accountNonLocked= true;
    private  boolean createAccountNonExpired= true;
    private  boolean enabled= true;



    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.authorities;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public String getUsername() {
        return this.username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return this.accountNonExpired;
    }

    @Override
    public boolean isAccountNonLocked() {
        return this.accountNonLocked;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return this.createAccountNonExpired;
    }

    @Override
    public boolean isEnabled() {
        return this.enabled;
    }
}
