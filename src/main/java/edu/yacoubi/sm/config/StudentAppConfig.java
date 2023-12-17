package edu.yacoubi.sm.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "edu.yacoubi")
@PropertySource("classpath:database.properties")
public class StudentAppConfig implements WebMvcConfigurer {
	
	@Autowired
	Environment environment;
	
	private final String URL = "url";
	private final String USER = "user";
	private final String DRIVER = "driver";
	private final String PASSWORD = "password";
	
	
	@Bean
	InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver vResolver = new InternalResourceViewResolver();
		
		vResolver.setPrefix("/WEB-INF/view/");
		vResolver.setSuffix(".jsp");
		
		return vResolver;
	}
	
	@Bean
	JdbcTemplate jdbcTemplate() {
		return new JdbcTemplate(dataSource());
	}
	
	private DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		
//		String url = "jdbc:mysql://localhost:3306/student_db?useSSL=false";
//		String userName = "root";
//		String password = "";
//		String driverClassName = "com.mysql.cj.jdbc.Driver";
		
		dataSource.setUrl(environment.getProperty(URL));
		dataSource.setUsername(environment.getProperty(USER));
		dataSource.setPassword(environment.getProperty(PASSWORD));
		dataSource.setDriverClassName(environment.getProperty(DRIVER));
		
		return dataSource;
	}
	
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/URLToReachResourcesFolger/**") // mapping for /resources
		.addResourceLocations("/resources/");
	}
}
