package com.example.ck_nhom2_thantai.object;


public class ResponseMessage {
    private String message;

    // Getter và Setter cho trường message
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ResponseMessage(String message) {
        this.message = message;
    }
}