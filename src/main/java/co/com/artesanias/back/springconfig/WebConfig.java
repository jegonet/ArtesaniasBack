/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.artesanias.back.springconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages="co.com.artesanias.back.servicios")
public class WebConfig extends WebMvcConfigurerAdapter {

	/**
	 * Since we don't have any controller logic, simpler to just
	 * define controller for page using View Controller. Note:
	 * had to extend WebMvcConfigurerAdapter to get this functionality
	 * @param registry
	 */
	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
            //No hay vistas de Springs que sean necesarias
	}
	
	@Bean
	public InternalResourceViewResolver viewResolver() {
            InternalResourceViewResolver resolver = new InternalResourceViewResolver();
            resolver.setPrefix("/WEB-INF/view/"); //no hay vistas que agregar para que sean analizadas
            //resolver.setSuffix(".jsp");
            return resolver;
	}
}