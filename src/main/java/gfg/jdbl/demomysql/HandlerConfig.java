package gfg.jdbl.demomysql;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.List;


@Configuration
@ControllerAdvice
public class HandlerConfig {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Object> methodHandlerMethodArgumentNotValidException(MethodArgumentNotValidException ex){
        BindingResult br=ex.getBindingResult();
        List<FieldError> fieldError=br.getFieldErrors();
        List<String> fieldString=fieldError
                .stream()
                .map(x->x.getDefaultMessage())
                .toList();
        return new ResponseEntity<>(fieldString ,HttpStatus.BAD_REQUEST);
    }
}
