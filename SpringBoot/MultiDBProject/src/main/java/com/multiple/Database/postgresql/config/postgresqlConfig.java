package com.multiple.Database.postgresql.config;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "secondentityManagerFactoryBean", basePackages = {
		"com.multiple.Database.postgresql.repository" }, transactionManagerRef = "secondtransactionManager")

public class postgresqlConfig {

	@Autowired
	private Environment environment;

	// datasource
	@Bean("secondDataSource")
	@Primary

	public DataSource datasource() {
		DriverManagerDataSource datasource = new DriverManagerDataSource();
		datasource.setUrl(environment.getProperty("spring.seconddatasource.url"));
		datasource.setDriverClassName(environment.getProperty("spring.seconddatasource.driver-class-name"));
		datasource.setUsername(environment.getProperty("spring.seconddatasource.username"));
		datasource.setPassword(environment.getProperty("spring.seconddatasource.password"));
		return datasource;

	}

	// entity manager factory bean
	@Bean(name = "secondentityManagerFactoryBean")
	@Primary
	public LocalContainerEntityManagerFactoryBean entityManagerfactoryBean() {
		LocalContainerEntityManagerFactoryBean bean = new LocalContainerEntityManagerFactoryBean();
		bean.setDataSource(datasource());
		bean.setPackagesToScan("com.multiple.Database.postgresql.entity");
		JpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		bean.setJpaVendorAdapter(adapter);
		Map<String, String> props = new HashMap<>();
		props.put("hibernate.dialect", "org.hibernate.dialect.PostgreSQLDialect");
		props.put("hibernate.show_sql", "true");
		props.put("hibernate.hbm2ddl.auto", "update");

		bean.setJpaPropertyMap(props);
		return bean;

	}

	// transaction Manager
	@Bean(name = "secondtransactionManager")
	@Primary
	public PlatformTransactionManager transactionManager() {
		JpaTransactionManager manager = new JpaTransactionManager();
		manager.setEntityManagerFactory(entityManagerfactoryBean().getObject());

		return manager;

	}
}
