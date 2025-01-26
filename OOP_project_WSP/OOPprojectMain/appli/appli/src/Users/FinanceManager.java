package Users;

import java.io.Serializable;

import Interfaces.Subscribers;
import model.FinanceOffice;

public class FinanceManager extends Employee implements Subscribers {
	private static final long serialVersionUID = 6L;
    private static FinanceOffice financeOffice = FinanceOffice.getInstance();
    
    public FinanceManager(String name, String password) {
    	super(name,password);
    }
    
    public void giveSalary(Employee user) {
    	user.setPaid(true);
    	financeOffice.setTotalBudget(-1*user.getSalary());
    }
    
    public double viewBudget() {
    	return financeOffice.getTotalBudget();
    }
    
}
