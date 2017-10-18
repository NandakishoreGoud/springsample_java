package springmvc_example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.velocity.VelocityConfig;
import org.springframework.web.servlet.view.velocity.VelocityConfigurer;
import org.springframework.web.servlet.view.velocity.VelocityLayoutViewResolver;

/**
 * Created by cts1 on 18/10/17.
 */

public class WebConfig extends WebMvcConfigurerAdapter {


    @Bean
    public ViewResolver viewResolver() {
        VelocityLayoutViewResolver viewResolver = new VelocityLayoutViewResolver();
        viewResolver.setCache(true);
        viewResolver.setPrefix("/WEB-INF/jsp/");
        viewResolver.setLayoutUrl("/WEB-INF/layouts/layout.vm");
        viewResolver.setSuffix(".vm");
        return viewResolver;
    }

    public VelocityConfig velocityConfig = new VelocityConfig() {
        VelocityConfigurer velocityConfigurer = new VelocityConfigurer();
			VelocityConfigurer.
    }
}
