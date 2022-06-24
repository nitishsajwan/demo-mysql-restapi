package gfg.jdbl.demomysql.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
public class Person {

    private int id;
    private  String firstName;
    private  String lastName;
    private int age;
    private String dob;
}
