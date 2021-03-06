package gfg.jdbl.demomysql.controller;


import gfg.jdbl.demomysql.model.Person;
import gfg.jdbl.demomysql.request.CreatePersonRequest;
import gfg.jdbl.demomysql.service.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;


@RestController
public class PersonController {

    @Autowired
    PersonService personService;

private static final Logger logger= LoggerFactory.getLogger(PersonController.class);

    /*@PostMapping("/person")
    public ResponseEntity createPerson(@RequestBody @Valid CreatePersonRequest createPersonRequest){
        logger.info("createPersonRequest {}",createPersonRequest);
        MultiValueMap<String,String> headers=new HttpHeaders();
        headers.add("my header","custom header");
       // return new ResponseEntity<>(createPersonRequest,headers,HttpStatus.ACCEPTED);
        return new ResponseEntity<>(createPersonRequest, HttpStatus.ACCEPTED);

    }*/

    /*@PostMapping("/person")
    public void createPerson(@RequestBody @Valid CreatePersonRequest createPersonRequest){
        logger.info("createPersonRequest {}",createPersonRequest);

        personService.createPerson(createPersonRequest);


    }*/
    @PostMapping("/person")
    public void createPerson(@Valid @RequestBody CreatePersonRequest createPersonRequest){

        // Validations and Exception handling we have outsourced
        // Invoking service class' function
        personService.createPerson(createPersonRequest);
    }

    @GetMapping("/person")
    public Person getPersonById(@RequestParam("id") int id){
        return personService.getPerson(id);
    }

    @GetMapping("/person/all")
    public List<Person> getPeople(){
        return personService.getPeople();
    }

    @DeleteMapping("/person/{id}")
    public Person deletePerson(@PathVariable("id") int pId) throws Exception {
        return personService.deletePerson(pId);
    }



}
