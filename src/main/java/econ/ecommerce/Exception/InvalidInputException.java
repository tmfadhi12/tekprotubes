package econ.ecommerce.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value = HttpStatus.BAD_REQUEST, reason = "Type Mismatch")
public class InvalidInputException extends RuntimeException{
    public InvalidInputException(String msg) {
        super(msg);
    }
}
