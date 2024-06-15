package org.example.assshoes.config;

import jakarta.servlet.ServletRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.web.SecurityFilterChain;

import java.util.logging.Filter;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http
                .authorizeHttpRequests(authorizeRequests ->
                        authorizeRequests
                                .requestMatchers("/**", "/users/login", "/users", "/users/logout", "/WEB-INF/**", "/css/**", "js/**", "/images/**", "/sass/**", "/fonts/**").permitAll()
                                .requestMatchers("/shoes/{id}").permitAll()
                                .requestMatchers("/carts/**").hasRole("USER")
                                .requestMatchers("/about", "/shopping", "/contact").permitAll()
                                .anyRequest().authenticated()
                )
//                .oauth2Login(oauth2Login ->
//                        oauth2Login
//                                .loginPage("/users/login")
//                                .defaultSuccessUrl("/shopping")
//                                .failureUrl("/users/login?error=true")
//                                .permitAll()
//                )
                .formLogin(formLogin ->
                        formLogin
                                .loginPage("/users/login")
                                .defaultSuccessUrl("/")
                                .failureUrl("/users/register")
                                .permitAll()
                )
                .csrf(csrf -> csrf.disable())
                .logout(logout ->
                        logout.permitAll()
                );

        return http.build();
    }

}
