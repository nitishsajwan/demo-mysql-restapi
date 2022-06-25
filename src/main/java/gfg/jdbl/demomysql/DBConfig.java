package gfg.jdbl.demomysql;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Configuration
public class DBConfig {

    private Connection connection=null;
    @Bean
    public Connection getConnection(){
            try {
               connection= DriverManager.getConnection("jdbc:mysql://localhost/gfgjbdl?" +
                        "user=root&password=strongpassword");
            } catch (SQLException e) {
                e.printStackTrace();
            }
            return connection;
    }
}

