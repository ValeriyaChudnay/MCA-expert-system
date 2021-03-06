package com.expert.config;

import com.expert.dao.ExpertDao;
import com.expert.dao.ExpertDaoImpl;
import com.expert.service.ExpertService;
import com.expert.service.ExpertServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

@Configuration
public class SpringConfig {

    public static final String DRIVER = "org.postgresql.Driver";
    public static String DB_NAME="postgres";
    public static String DB_PASSWORD="root";
    public static String DB_URL="jdbc:postgresql://localhost/expert";


    @Bean
    public JdbcTemplate getJdbcTemplate(){
        return new JdbcTemplate(getDataSource());
    }

    @Bean
    public DataSource getDataSource() {
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setUrl(DB_URL);
        dataSource.setUsername(DB_NAME);
        dataSource.setPassword(DB_PASSWORD);
        dataSource.setDriverClassName(DRIVER);
        return dataSource;
    }
    @Bean
    public ExpertDao getExpertDao(){
        return new ExpertDaoImpl(getJdbcTemplate());
    }
    @Bean
    public ExpertService getExpertService(){
        return new ExpertServiceImpl(getExpertDao());
    }



}
