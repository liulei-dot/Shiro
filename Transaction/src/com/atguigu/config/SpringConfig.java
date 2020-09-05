package com.atguigu.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.sql.DataSource;

/**
 * @author Liulei
 * @create 2020-07-29 9:25
 */
public class SpringConfig {
    @Value("${driverClassName}")   //注入properties文件的配置参数
    private String driverClassName;
    @Value("${url}")
    private String url;
    @Value("${user}")
    private String username;
    @Value("${password}")
    private String password;
    @Bean
    public DataSource dataSource(){    //生成数据源，交给ioc容器管理;默认生成对象的名字就是方法名
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName(driverClassName);
        druidDataSource.setUrl(url);
        druidDataSource.setUsername(username);
        druidDataSource.setPassword(password);
        return druidDataSource;
    }

    //生成JdbcTemplate放入ioc容器
    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource){  //这种传参的，就是类似@Autowired的类型自动注入，会在IOC容器里找对应的类型注入
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        //或者使用   jdbcTemplate.setDataSource(dataSource());但是又生成了一遍数据源，还是传参自动注入比较好
        return jdbcTemplate;
    }
    //生成事务管理器，放入ioc容器
    @Bean
    public DataSourceTransactionManager dataSourceTransactionManager(DataSource dataSource){
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource);
        return dataSourceTransactionManager;
    }
}
