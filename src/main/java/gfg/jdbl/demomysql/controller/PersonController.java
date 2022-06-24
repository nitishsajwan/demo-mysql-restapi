package gfg.jdbl.demomysql.controller;


import gfg.jdbl.demomysql.request.CreatePersonRequest;
import gfg.jdbl.demomysql.service.PersonService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;


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

    @PostMapping("/person")
    public void createPerson(@RequestBody @Valid CreatePersonRequest createPersonRequest){
        logger.info("createPersonRequest {}",createPersonRequest);

        personService.createPerson(createPersonRequest);


    }



}
