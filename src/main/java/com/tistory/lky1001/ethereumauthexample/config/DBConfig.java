package com.tistory.lky1001.ethereumauthexample.config;

import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.orm.hibernate5.LocalSessionFactoryBuilder;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

@SuppressWarnings("ALL")
@Configuration
@EnableTransactionManagement
public class DBConfig {

    @Bean
    public HibernateTemplate hibernateTemplate(DataSource dataSource) {
        return new HibernateTemplate(sessionFactory(dataSource));
    }

    @Bean
    public SessionFactory sessionFactory(DataSource dataSource) {
        return new LocalSessionFactoryBuilder(dataSource)
                .scanPackages("com.tistory.lky1001.ethereumauthexample")
                .buildSessionFactory();
    }
}