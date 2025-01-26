package model;

import java.util.Set;
import java.util.Vector;

import DBs.DBContext;
import DBs.ReaderWriter;
import Users.Manager;
import Users.Student;
import Users.User;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class News implements Serializable {
    
    private String topic;
    private String news;
    private List<Journal> newsJournal;
    
    
    
    public News(String topic, String news) {
		this.topic = topic;
		this.news = news;
	}
    
	private String getTopic() {
        return this.topic;
    }
    private void setTopic(String topic) {
        this.topic = topic;
    }
    
    private String getNews() {
        return this.news;
    }
    private void setNews(String news) {
        this.news = news;
    }
    
    private List<Journal> getNewsJournal() {
        return this.newsJournal;
    }
    private void setNewsJournal(List<Journal> newsJournal) {
        this.newsJournal = newsJournal;
    }
    
    public void notifyObservers(Vector<User> users) {
        for(User user : users) {
        	user.update(this);
        }
//<<<<<<< HEAD
//<<<<<<< HEAD
        ReaderWriter.serialize(users, DBContext.getFullPath()+"user.txt");
//=======
//        ReaderWriter.serialize(users, "/Users/apple/Desktop/WSP_system/OOPprojectMain/appli/appli/src/files/user.txt");
//>>>>>>> dias
//=======
//        ReaderWriter.serialize(users, "/Users/apple/Desktop/WSP_system/OOPprojectMain/appli/appli/src/files/user.txt");
//
//>>>>>>> dias2
    }

	@Override
	public String toString() {
		return "News [topic=" + getTopic() + ", news=" + getNews() + "]";
	}
    
    
    
}
