package edu.pro.model;/*
  @author   george
  @project   kafka-consumer
  @class  Message
  @version  1.0.0 
  @since 17.07.21 - 20.17
*/

public class Message {
    private String message;
    private Integer rate;

    public Message() {
    }

    public Message(String message, Integer rate) {
        this.message = message;
        this.rate = rate;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Integer getRate() {
        return rate;
    }

    public void setRate(Integer rate) {
        this.rate = rate;
    }

    @Override
    public String toString() {
        return "Message{" +
                "message='" + message + '\'' +
                ", rate=" + rate +
                '}';
    }
}
