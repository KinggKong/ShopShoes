package org.example.assshoes.Exception;

import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.Set;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(value = RuntimeException.class)
    ResponseEntity<String> handlingRuntimeException(RuntimeException runtimeException) {
        return ResponseEntity.badRequest().body(runtimeException.getMessage());
    }

//    @ExceptionHandler(value =  ConstraintViolationException.class)
//    ResponseEntity<String> handlingValidation(ConstraintViolationException ex){
//        Set<ConstraintViolation<?>> violations = ex.getConstraintViolations();
//        StringBuilder lastMessage = new StringBuilder();
//        for (ConstraintViolation<?> violation : violations) {
//            String fullMessage = violation.getMessage();
//            // Tách phần cuối cùng của thông báo
//            String lastPart = fullMessage.substring(fullMessage.lastIndexOf(":") + 1).trim();
//            lastMessage.append(lastPart).append("\n");
//        }
//        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(lastMessage.toString());
//    }

    @ExceptionHandler(value =  MethodArgumentNotValidException.class)
    ResponseEntity<String> handlingMethodException(MethodArgumentNotValidException ex){
        return ResponseEntity.badRequest().body(ex.getFieldError().getDefaultMessage());
    }
}
