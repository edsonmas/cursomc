package com.edsonMatheus.cursomc.resources.exceptions;

import java.util.ArrayList;
import java.util.List;

public class ValidationError extends StandardError {
    private static final long serialVersionUID = 1L;

    private List<FildMessage> errors = new ArrayList<>();

    public List<FildMessage> getErrors() {
        return errors;
    }
    public void addError(String fildName, String message){
        errors.add(new FildMessage(fildName,message));
    }
    public ValidationError(Integer status, String msg, Long timeStamp) {
        super(status, msg, timeStamp);
    }


}
