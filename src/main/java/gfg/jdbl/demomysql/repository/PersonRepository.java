package gfg.jdbl.demomysql.repository;

import gfg.jdbl.demomysql.model.Person;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.sql.Connection;

@Repository
public class PersonRepository {

    private static final Logger logger= LoggerFactory.getLogger(PersonRepository.class);

    @Autowired
    Connection connection;

    public PersonRepository(Connection connection) {
        this.connection = connection;
        logger.info("Connection object {}",connection);

    }


    public void insertPerson(Person person){
    // method can be used for pushing data into the database


    }

}
