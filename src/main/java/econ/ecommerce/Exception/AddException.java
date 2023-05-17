package econ.ecommerce.Exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

public class AddException extends RuntimeException {
    public AddException(String message){
        super(message);
    }
}
