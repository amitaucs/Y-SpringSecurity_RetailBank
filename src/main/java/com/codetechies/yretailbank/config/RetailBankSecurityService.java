package com.codetechies.yretailbank.config;

import com.codetechies.yretailbank.repo.CustomerRepo;
import lombok.AllArgsConstructor;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

import java.util.ArrayList;
import java.util.List;

@Configuration
@AllArgsConstructor
public class RetailBankSecurityService implements UserDetailsService {

    private CustomerRepo customerRepo;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {

        var customerList = customerRepo.findCustomerByEmail(email);
        if(customerList.isEmpty()){
            throw new UsernameNotFoundException("User does not exists. Please register yourself with our bank");
        }else{
            List<GrantedAuthority> authorities = new ArrayList<>();
            var userName = customerList.get(0).getEmail();
            var password = customerList.get(0).getPassword();
            authorities.add(new SimpleGrantedAuthority(customerList.get(0).getRole()));
            return new User(userName,password,authorities);
        }

    }
}
