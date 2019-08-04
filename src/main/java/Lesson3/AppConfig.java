package Lesson3;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;
import java.util.Properties;

@EnableTransactionManagement
@ComponentScan("com.geekbrains")
//@PropertySource("classpath:db-config.properties")
public class AppConfig {
    /*
    @Bean
    public DataSource dataSource(
            @Value("${datasource.driver}") final String dataSourceDriver,
            @Value("${datasource.url}") final String dataSourceUrl,
            @Value("${datasource.user}") final String dataSourceUser,
            @Value("${datasource.password}") final String dataSourcePassword
    ){
        final DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName(dataSourceDriver);
        dataSource.setUrl(dataSourceUrl);
        dataSource.setUsername(dataSourceUser);
        dataSource.setPassword(dataSourcePassword);
        return dataSource;
    }
    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(final DataSource dataSource,
                                                                       @Value("${hibernate.show_sql}") final boolean showSql,
                                                                       @Value("${hibernate.hbm2ddl.auto}")  final String tableStrategy,
                                                                       @Value("${hibernate.dialect}")   final String dialect
    ){
        final  LocalContainerEntityManagerFactoryBean factoryBean;
        factoryBean = new LocalContainerEntityManagerFactoryBean();
        factoryBean.setDataSource(dataSource);
        factoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        factoryBean.setPackagesToScan("com.geekbrains.SPRING_Lesson3_HW");

        final Properties properties = new Properties();

        properties.put("hibernate.show_sql", showSql);

        properties.put("hibernate.hbm2ddl.auto", tableStrategy);

        properties.put("hibernate.dialect", dialect);

        factoryBean.setJpaProperties(properties);

        return factoryBean;
    }
    @Bean
    public PlatformTransactionManager transactionManager(final LocalContainerEntityManagerFactoryBean
                                                                 entityManagerFactory){
        final JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory.getObject());
        return transactionManager;
    }


     */


    //Устанавливаем соединение
    @Bean
    public DataSource dataSource (){
        final DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://127.0.0.1:3306/SPRINGLesson3");
        dataSource.setUsername("root");
        dataSource.setPassword("123123");
        return dataSource;
    }

    //При использовании спринга в качесотва обертки исп LocalContainer.., в кот в качества обекта
    //подается созданный выше бин для настройки свойств объекта

    @Bean
    public LocalContainerEntityManagerFactoryBean entityManagerFactory(final DataSource dataSource){
        final  LocalContainerEntityManagerFactoryBean factoryBean;
        factoryBean = new LocalContainerEntityManagerFactoryBean();
        factoryBean.setDataSource(dataSource);
        factoryBean.setJpaVendorAdapter(new HibernateJpaVendorAdapter());
        factoryBean.setPackagesToScan("com.geekbrains.SPRING_Lesson3_HW");

        final Properties properties = new Properties();

        properties.put("hibernate.show_sql", "true");

        properties.put("hibernate.hbm2ddl.auto", "update");

        properties.put("hibernate.dialect", "org.hibernate.dialect.MySQL5Dialect");

        factoryBean.setJpaProperties(properties);

        return factoryBean;
    }
    //Для правильной работы @EnableTransactionManagement создается третий бин, который будет
    //управлять автоматической транзакций, чтобы понизить количество рутинного кода
    @Bean
    public PlatformTransactionManager transactionManager(final LocalContainerEntityManagerFactoryBean
                                                                 entityManagerFactory){
        final JpaTransactionManager transactionManager = new JpaTransactionManager();
        transactionManager.setEntityManagerFactory(entityManagerFactory.getObject());
        return transactionManager;
    }


}
