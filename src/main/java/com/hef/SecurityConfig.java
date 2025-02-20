package com.hef;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {


	@Bean
	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		 http.csrf().disable()  
	        .cors() // Enable CORS
	        .and()
	        .authorizeHttpRequests(auth -> auth
	        		
	        		//patient
	            .requestMatchers("/api/patients/save").permitAll()
	            .requestMatchers("/api/patients/findall").permitAll()
	            .requestMatchers("/api/patients/findbyid/{id}").permitAll()
	            .requestMatchers("/api/patients/deletebyid/{id}").permitAll() 
	            .requestMatchers("/api/patients/update/{id}").permitAll() 
	            
	               //Doctor
	            .requestMatchers("/api/doctors/save").permitAll()
	            .requestMatchers("/api/doctors/findall").permitAll()
	            .requestMatchers("/api/doctors/findbyid/{id}").permitAll()
	            .requestMatchers("/api/doctors/deletebyid/{id}").permitAll() 
	            .requestMatchers("/api/doctors/update/{id}").permitAll() 
	            
	              //Appointment
	            .requestMatchers("/api/appointments/save").permitAll()
	            .requestMatchers("/api/appointments/findall").permitAll()
	            .requestMatchers("/api/appointments/findbyid/{id}").permitAll()
	            .requestMatchers("/api/appointments/deletebyid/{id}").permitAll() 
	            .requestMatchers("/api/appointments/update/{id}").permitAll() 
	            
	               //User
	            .requestMatchers("/api/user/register").permitAll()
	            .requestMatchers("/api/user/login").permitAll()
	           
		          
	            
	        )
	        .formLogin()
	        .and()
	        .logout();

	    return http.build();
	}


    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

   
}
