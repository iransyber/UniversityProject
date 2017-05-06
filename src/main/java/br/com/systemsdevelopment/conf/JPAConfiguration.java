package br.com.systemsdevelopment.conf;

import java.util.Properties;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@EnableTransactionManagement
public class JPAConfiguration {
	
	@Bean
	public PlatformTransactionManager transactionManager(EntityManagerFactory emf){
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(emf);
		return transactionManager;
	}
	
	@Bean
	public DataSource dataSource(){
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("org.postgresql.Driver");
		//dataSource.setUrl("jdbc:postgresql://localhost:5432/Biblioteca");
		dataSource.setUrl("jdbc:postgres://ynydsdtebnbsvh:610f7b3b5e95fa9882616e5098e5e16f69d4ee0045ced203e3c7efd7ca2632a2@ec2-23-21-111-81.compute-1.amazonaws.com:5432/deol703kpl3t17");
		//dataSource.setUsername("postgres");
		dataSource.setUsername("ynydsdtebnbsvh");
		//dataSource.setPassword("iran@syber");
		dataSource.setPassword("610f7b3b5e95fa9882616e5098e5e16f69d4ee0045ced203e3c7efd7ca2632a2");
		return dataSource;
	}
	
	@Bean
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(){
		LocalContainerEntityManagerFactoryBean em = new LocalContainerEntityManagerFactoryBean();
		em.setDataSource(dataSource());
		em.setPackagesToScan("br.com.systemdevelopment.model");
		
		JpaVendorAdapter vendorAdapter = new HibernateJpaVendorAdapter();
		em.setJpaVendorAdapter(vendorAdapter);
		em.setJpaProperties(addirionalProperties());
		return em;
	}
	
	private Properties addirionalProperties(){
		Properties properties = new Properties();
		properties.setProperty("hibernate.hbm2ddl.auto", "update");
		properties.setProperty("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
		//properties.setProperty("javax.persistence.schema-generation.database.action", "drop-and-create");
		properties.setProperty("hibernate.connection.shutdown", "true");
		properties.setProperty("hibernate.format_sql", "true");	
		return properties;
	}
}
