package gfg.jdbl.demomysql.request;

import lombok.*;

import javax.validation.constraints.NotBlank;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CreatePersonRequest {


    @NotBlank(message = "First name should not be empty")
    private  String firstName;
    private  String lastName;
    @NotBlank(message = "DOB should not be empty")
    private String dob;
}
