package model;

import java.util.*;

import Interfaces.Subscribers;
import OOPproject.ResearchPaper;
import Users.User;

public class Journal {
    
    private List<ResearchPaper> entries;
    private List<Subscribers> followers;
    
    
    
    private List<ResearchPaper> getEntries() {
        return this.entries;
    }
    private void setEntries(List<ResearchPaper> entries) {
        this.entries = entries;
    }
    
    private List<Subscribers> getFollowers() {
        return this.followers;
    }
    private void setFollowers(List<Subscribers> followers) {
        this.followers = followers;
    }
    
    public void addFollower() {
        //TODO
    }
    
    
}
