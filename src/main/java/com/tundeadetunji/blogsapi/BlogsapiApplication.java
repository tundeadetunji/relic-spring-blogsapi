package com.tundeadetunji.blogsapi;

import com.tundeadetunji.blogsapi.business.internal.General;
import com.tundeadetunji.blogsapi.business.models.Role;
import com.tundeadetunji.blogsapi.business.models.User;
import com.tundeadetunji.blogsapi.business.services.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class BlogsapiApplication extends General {

    public static void main(String[] args) {
        SpringApplication.run(BlogsapiApplication.class, args);
		System.out.println("app started.....");
    }

    @Bean
    CommandLineRunner commandLineRunner(UserService userService){
        return args -> {
            userService.saveRole(new Role(null, General.userRoles.ROLE_ADMIN.toString()));
            userService.saveRole(new Role(null, General.userRoles.ROLE_USER.toString()));

            userService.saveUser(new User(null, "amy@blogs.com", "amy", "sequel", "Amy", "First", new ArrayList<>()));

            userService.addRoleToUser("amy", userRoles.ROLE_ADMIN.toString());
            userService.addRoleToUser("amy", userRoles.ROLE_USER.toString());
        };
    }


    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
