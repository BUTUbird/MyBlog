package org.butu.blog.auth;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.butu.blog.api.UserService;
import org.butu.blog.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

/**
 * @author BUTUbird
 */
@Service
public class MyUserDetailsService implements UserDetailsService {
    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.eq("username",username);
        User user = userService.getOne(wrapper);
        if (user == null){
            throw new UsernameNotFoundException("没有该用户");
        }
        MyUserDetails userDetails = new MyUserDetails();
        userDetails.setUser(user);
        userDetails.setUsername(user.getUsername());
        userDetails.setPassword(user.getPassword());
        System.out.println("userDetails"+userDetails.getPassword());
        SimpleGrantedAuthority authority = new SimpleGrantedAuthority("TEST");
        Set<GrantedAuthority> authorities = new HashSet<>();
        authorities.add(authority);
        userDetails.setAuthorities(authorities);
        return userDetails;
    }
}
