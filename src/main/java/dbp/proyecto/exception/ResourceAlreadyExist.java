package dbp.proyecto.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.CONFLICT, reason = "Resource already exist")
public class ResourceAlreadyExist extends RuntimeException {
    public ResourceAlreadyExist(String message) {
        super(message);
    }
}
