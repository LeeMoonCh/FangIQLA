//package net.cc1000.fangiqlweb.config;
//
//
//import com.alibaba.druid.spring.boot.autoconfigure.DruidDataSourceBuilder;
//import org.springframework.boot.context.properties.ConfigurationProperties;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.context.annotation.Primary;
//import org.springframework.context.annotation.PropertySource;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//import org.springframework.orm.jpa.JpaTransactionManager;
//import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
//import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
//import org.springframework.transaction.PlatformTransactionManager;
//
//import javax.sql.DataSource;
//import java.util.Properties;
//
//@Configuration
//public class DataSourceConfig {
//
//    @Primary
//    @Bean
//    @ConfigurationProperties("spring.datasource.druid.one")
//    public DataSource dataSourceOne(){
//        return DruidDataSourceBuilder.create().build();
//    }
//
//
//
//
//
//}
