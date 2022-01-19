package org.butu.blog.config;

import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author BUTUbird
 */
public class WebCrossConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")
                .allowCredentials(true)
                .allowedMethods("*")
                .allowedHeaders("*")
                .allowedOrigins("*")
                .maxAge(6000);
    }
}
