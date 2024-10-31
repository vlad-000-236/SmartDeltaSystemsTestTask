package com.VI__236.SmartDeltaSystemsTestTask.errorsheandlers;

public class NotFoundException extends RuntimeException{

    private String message;
    public String errorMessage(){
        message = "User with that ID wasn't found";
        return message;
    }
}
