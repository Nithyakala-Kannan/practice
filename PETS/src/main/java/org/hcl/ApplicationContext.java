package org.hcl;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;


@Configuration
@EnableTransactionManagement
@PropertySource("classpath:database.properties")
public class ApplicationContext {
	@Autowired
	Environment environment;

	@Bean
	public DataSource getDataSource() {
		DriverManagerDataSource data = new DriverManagerDataSource();
		data.setDriverClassName(environment.getProperty("jdbc.driverClassName"));
		data.setUrl(environment.getProperty("jdbc.url"));
		data.setUsername(environment.getProperty("jdbc.username"));
		data.setPassword(environment.getProperty("jdbc.password"));
		return data;
	}

	@Bean
	public LocalSessionFactoryBean getFactoryBean() {
		LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();
		factoryBean.setDataSource(getDataSource());
		factoryBean.setHibernateProperties(getProperties());
		factoryBean.setPackagesToScan("org.hcl.entities");
		return factoryBean;

	}

	public Properties getProperties() {
		Properties properties = new Properties();
		properties.setProperty("hibernate.dialect", environment.getProperty("hibernate.dialect"));
		properties.setProperty("hibernate.show_sql", environment.getProperty("hibernate.show_sql"));
		properties.setProperty("hibernate.format_sql", environment.getProperty("hibernate.format_sql"));
		properties.setProperty("hibernate.hbm2ddl.auto", environment.getProperty("hibernate.hbm2ddl.auto"));
		return properties;
	}

	@Bean
	public HibernateTransactionManager getTransactionManager() {
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(getFactoryBean().getObject());
		return transactionManager;

	}

}
