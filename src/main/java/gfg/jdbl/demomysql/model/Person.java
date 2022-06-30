package gfg.jdbl.demomysql.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Transient;

@Getter
@Setter
@AllArgsConstructor
@Builder
@ToString
@NoArgsConstructor
@Entity

public class Person {
    @Id
    private int id;
    @Column(name="first_name",length = 30)
    private  String firstName;
    private  String lastName;
    private int age;
    private String dob;
    @Transient
    private String dummy;
}
