package dbp.proyecto;

import dbp.proyecto.exception.ResourceAlreadyExist;
import dbp.proyecto.exception.ResourceNotFoundException;
import dbp.proyecto.exception.UserAlreadyExist;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ResponseStatus(HttpStatus.CONFLICT)
    @ExceptionHandler(ResourceAlreadyExist.class)
    public String handleResourceAlreadyExist(ResourceAlreadyExist exception){
        return exception.getMessage();
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    @ExceptionHandler(ResourceNotFoundException.class)
    public String handleResourceNotFound(ResourceNotFoundException exception){return exception.getMessage();}

    @ResponseStatus(HttpStatus.CONFLICT)
    @ExceptionHandler(UserAlreadyExist.class)
    public String handleUserAlreadyExist(UserAlreadyExist exception){return exception.getMessage();}

    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(IllegalArgumentException.class)
    public String handleIllegalArgumentException(IllegalArgumentException exception){
        return exception.getMessage();
    }
}
