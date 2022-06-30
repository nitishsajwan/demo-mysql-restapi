package gfg.jdbl.demomysql.service;

import gfg.jdbl.demomysql.model.Person;
import gfg.jdbl.demomysql.repository.PersonRepository;
import gfg.jdbl.demomysql.request.CreatePersonRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    private static final Logger logger= LoggerFactory.getLogger(PersonService.class);
    @Autowired
    PersonRepository personRepository;
    public void createPerson(CreatePersonRequest createPersonRequest){
        Person person= Person.
                builder()
                .dob(createPersonRequest.getDob())
                .firstName(createPersonRequest.getFirstName())
                .lastName(createPersonRequest.getLastName())
                .build();
        logger.info("Person Object {}",person);
        personRepository.insertPerson(person);
    }


    public Person getPerson(int id) {
    }

    public List<Person> getPeople() {
    }

    public Person deletePerson(int pId) {
    }
}
