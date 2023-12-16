package edu.yacoubi.sm.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "edu.yacoubi")
public class StudentAppConfig {
	
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
		
		String url = "jdbc:mysql://localhost:3306/student_db?useSSL=false";
		String userName = "root";
		String password = "";
		String driverClassName = "com.mysql.cj.jdbc.Driver";
		
		dataSource.setUrl(url);
		dataSource.setUsername(userName);
		dataSource.setPassword(password);
		dataSource.setDriverClassName(driverClassName);
		
		return dataSource;
	}

}
