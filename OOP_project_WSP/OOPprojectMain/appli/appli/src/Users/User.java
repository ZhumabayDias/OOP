package Users;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Vector;

import DBs.DBContext;
import Interfaces.Observer;
import model.Message;
import model.News;

public abstract class User implements Observer, Serializable{
	@Override
	public int hashCode() {
		return Objects.hash(password, userId, userName);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		return Objects.equals(password, other.password) && userId == other.userId
				&& Objects.equals(userName, other.userName);
	}

	private String userName;
	private String password;
	private int userId;
	public  List<Message> messages = new ArrayList<Message>();
	
	
	public Vector<News> news = new Vector<News>();
	
	{
		userId++;
	}
	
	public User(String name, String password) {
		this.password = password;
		this.userName = name;
	}
	
	@Override
    public void update(News latestNews) {
    	news.add(latestNews);
    }

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String toString() {
		return "Name: "+getUserName();
	}
	
	public void addMessage(Message message) {
		messages.add(message);
		
	}
	
}
