package model;

import Users.FinanceManager;
import Users.Admin;
import Users.Employee;

import java.util.*;

public class FinanceOffice {
    
	private static FinanceOffice financeOffice = new FinanceOffice();
    private double totalBudget;
    
    private FinanceOffice() {
    	this.totalBudget = 999999999;
    }
    
    public static FinanceOffice getInstance() {
        return financeOffice;
    }
    
    public double getTotalBudget() {
        return this.totalBudget;
    }
    public void setTotalBudget(double totalBudget) {
        this.totalBudget += totalBudget;
    }
    
    
}
