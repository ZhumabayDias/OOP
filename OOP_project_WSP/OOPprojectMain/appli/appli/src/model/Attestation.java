package model;

import java.util.Set;

import Users.Teacher;

import java.util.HashSet;

public class Attestation {
    
    private Double firstAtt;
    private Double secondAtt;
    private Double finalExam;
    
    
    public Attestation() {
		this.firstAtt = null;
		this.secondAtt = null;
		this.finalExam = null;
	}
    
    
	public Double getFirstAtt() {
        return this.firstAtt;
    }
    public void setFirstAtt(double firstAtt) {
        this.firstAtt = firstAtt;
    }
    
    public Double getSecondAtt() {
        return this.secondAtt;
    }
    public void setSecondAtt(double secondAtt) {
        this.secondAtt = secondAtt;
    }
    
    public Double getFinal() {
        return this.finalExam;
    }
    public void setFinal(double finalExam) {
        this.finalExam = finalExam;
    }
    
    public double getTotal() {
    	double first = (this.firstAtt != null ? this.firstAtt : 0);
    	double second = (this.secondAtt != null ? this.secondAtt : 0);
    	double fin = (this.finalExam != null ? this.finalExam : 0);
        return first + second + fin;
    }
    
}
