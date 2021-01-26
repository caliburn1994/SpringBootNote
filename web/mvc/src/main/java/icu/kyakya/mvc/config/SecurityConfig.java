package icu.kyakya.mvc.config;

import icu.kyakya.mvc.config.security.CustomAccessDeniedHandler;
import icu.kyakya.mvc.config.security.CustomAuthenticationFailureHandler;
import icu.kyakya.mvc.config.security.CustomLogoutSuccessHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.security.web.firewall.StrictHttpFirewall;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .authorizeRequests()
                    .antMatchers("/","/index","/static/**").permitAll() // 所有人都可以访问
                    .anyRequest().authenticated()
                    .and()
                // login
                .formLogin()
                    .loginPage("/login")
                    .failureUrl("/login?error=true")
                    .failureHandler(authenticationFailureHandler())
                    .permitAll()
                    .and()
                // logout
                    .logout()
                    .deleteCookies("JSESSIONID")
                    .logoutSuccessHandler(logoutSuccessHandler());
//                .permitAll();
    }


    @Override
    protected void configure(final AuthenticationManagerBuilder auth) throws Exception {
        // @formatter:off
        auth.inMemoryAuthentication()
                .withUser("user1@gmail.com").password(passwordEncoder().encode("user1Pass")).roles("USER")
                .and()
                .withUser("user2").password(passwordEncoder().encode("user2Pass")).roles("USER")
                .and()
                .withUser("admi@gmail.comn").password(passwordEncoder().encode("adminPass")).roles("ADMIN");
        // @formatter:on
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        StrictHttpFirewall firewall = new StrictHttpFirewall();
        firewall.setAllowUrlEncodedDoubleSlash(true); // 允许url出现双斜杠
        web.httpFirewall(firewall);
    }

    @Bean
    public LogoutSuccessHandler logoutSuccessHandler() {
        return new CustomLogoutSuccessHandler();
    }

    @Bean
    public AccessDeniedHandler accessDeniedHandler() {
        return new CustomAccessDeniedHandler();
    }

    @Bean
    public AuthenticationFailureHandler authenticationFailureHandler() {
        return new CustomAuthenticationFailureHandler();
    }


    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
