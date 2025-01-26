package model;

import java.util.Set;

import Users.Employee;
import Users.User;

import java.io.Serializable;
import java.util.HashSet;

public class Message implements Serializable{
	 private static final long serialVersionUID = 1L;

    @Override
	public String toString() {
		return "Message [message=" + message + ", sender=" + sender + ", recipient=" + recipient + "]";
	}

	private String message;
    private User sender;
    private User recipient;
    
    public Message (User recipient,User sender,String message){
    	this.recipient = recipient;
    	this.sender = sender;
    	this.message = message;
    }

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public User getSender() {
		return sender;
	}

	public void setSender(User sender) {
		this.sender = sender;
	}

	public User getRecipient() {
		return recipient;
	}

	public void setRecipient(User recipient) {
		this.recipient = recipient;
	}
    
   
    
}
