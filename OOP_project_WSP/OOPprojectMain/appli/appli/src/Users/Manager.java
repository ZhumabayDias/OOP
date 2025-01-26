//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package Users;

import Interfaces.Subscribers;
import enums.CourseType;
import enums.ManagerType;
import enums.SchoolName;
import java.io.PrintStream;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;
import model.Course;
import model.Message;
import model.News;
import model.Semester;

public class Manager extends Employee implements Subscribers {
    private static final long serialVersionUID = 5L;
    private ManagerType type;
    private static Vector<News> zhanalyktar = new Vector();

    public Manager(String name, String password, ManagerType type) {
        super(name, password);
        this.type = type;
    }



    public List<Message> getMessages() {
		return messages;
	}


	public ManagerType getType() {
		return type;
	}



	public void setType(ManagerType type) {
		this.type = type;
	}



	public static Vector<News> getZhanalyktar() {
		return zhanalyktar;
	}
	


	public void openCourseRegistration(Course course) {
        course.openRegistration();
        System.out.println("Регистрация на курс " + course.getCourseName() + " открыта.");
    }

    
    
    public void addNews(String topic, String zhanalyk, Vector<User> users) {
    	News news = new News(topic,zhanalyk);
    	news.notifyObservers(users);
    }
    
   
}