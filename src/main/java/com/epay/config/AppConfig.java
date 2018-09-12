/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epay.config;

/**
 *
 * @author ADITYA
 */
import com.epay.dao.impl.conLoginImpl;
import java.net.URISyntaxException;
import javax.sql.DataSource;
import org.apache.commons.dbcp.BasicDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@EnableWebMvc
@Configuration
@ComponentScan(basePackages = { "com.epay" }, excludeFilters = { @Filter(type = FilterType.ANNOTATION, value = Configuration.class)})
@PropertySource("classpath:sqlmap.properties")
public class AppConfig extends WebMvcConfigurerAdapter{
        
    @Autowired
    private Environment environment;
    
    @Bean(destroyMethod = "close")
    public DataSource dataSource() {
        BasicDataSource dataSource = new BasicDataSource();
        dataSource.setDriverClassName(environment.getRequiredProperty("jdbc.driver"));
        dataSource.setUrl(environment.getRequiredProperty("jdbc.url"));
        dataSource.setUsername(environment.getRequiredProperty("jdbc.username"));
        dataSource.setPassword(environment.getRequiredProperty("jdbc.password"));
        dataSource.setMaxActive(100);
        dataSource.setMaxWait(40000);
        dataSource.setMaxIdle(20);
        return  dataSource;
    }
   @Bean
     public PlatformTransactionManager transactionManager() {
         return new DataSourceTransactionManager(dataSource());
     }
    public PlatformTransactionManager annotationDrivenTransactionManager() throws URISyntaxException {
         return transactionManager();
     }


    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
      SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
      sqlSessionFactory.setDataSource(dataSource());
      return (SqlSessionFactory) sqlSessionFactory.getObject();
    }

   
    @Bean
    public conLoginImpl conLoginImpl() throws Exception {
      SqlSessionTemplate sessionTemplate = new SqlSessionTemplate(sqlSessionFactory());
      sessionTemplate.getConfiguration().addMapper(conLoginImpl.class); // new code
      return sessionTemplate.getMapper(conLoginImpl.class);
    }
}

