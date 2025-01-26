package model;

import java.util.Set;

import Interfaces.CanSendRequest;
import Users.Manager;
import Users.Student;
import Users.Teacher;
import enums.StatusType;

import java.util.*;

public class Request {
    
    private CanSendRequest sender;
    private String title;
    private String describtion;
    private StatusType status;
    
    
    private CanSendRequest getSender() {
        return this.sender;
    }
    private void setSender(CanSendRequest sender) {
        this.sender = sender;
    }
    
    private String getTitle() {
        return this.title;
    }
    private void setTitle(String title) {
        this.title = title;
    }
    
    private String getDescribtion() {
        return this.describtion;
    }
    private void setDescribtion(String describtion) {
        this.describtion = describtion;
    }
    
    private StatusType getStatus() {
        return this.status;
    }
    private void setStatus(StatusType status) {
        this.status = status;
    }
    
}
