package icu.kyakya.mvc.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;

@EnableWebMvc
@Configuration
public class MvcConfig implements WebMvcConfigurer {

    final LocaleChangeInterceptor localeInterceptor;

    public MvcConfig(LocaleChangeInterceptor localeInterceptor) {
        this.localeInterceptor = localeInterceptor;
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addRedirectViewController("/", "/index");
        registry.addViewController("/login").setViewName("login");
    }


    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(localeInterceptor);
    }

}
