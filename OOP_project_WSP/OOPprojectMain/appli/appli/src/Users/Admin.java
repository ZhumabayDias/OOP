package Users;

import java.io.Serializable;
import java.util.*;
import Interfaces.Researchable;
import Interfaces.Subscribers;
import enums.SchoolName;
import DBs.DBContext;
import DBs.ReaderWriter;

public class Admin extends Employee implements Researchable, Subscribers {

    private static Admin instance = new Admin();
    
    private Admin() {
    	super("a_ilyas", "admin");
    }
    
    public static Admin getInstance() {
        return instance;
    }
    
    
}
