package model;

import java.util.Vector;

public class Subject {
	private Vector<Attendance> attendances;
	private Attestation attestation;
	private String name;
	private int credits;
	
	public Subject(String name, int credits) {
		this.name = name;
		this.credits = credits;
		this.attestation = new Attestation();
		this.attendances = new Vector<>();
	}
	
	public String putAttestaion(double mark) {
		if(this.attestation.getFirstAtt() == null) {
			this.attestation.setFirstAtt(mark);
		}
		else if(this.attestation.getSecondAtt() == null) {
			this.attestation.setSecondAtt(mark);
		}
		else if(this.attestation.getFinal() == null) {
			this.attestation.setFinal(mark);
		}
		else {
			return "Sorry, all marks already putted";
		}
		return "Done!";
	}
	public void setAttestation(int num, double mark) {
		if(num == 1) {
			this.attestation.setFirstAtt(mark);
		}
		else if(num == 2) {
			this.attestation.setSecondAtt(mark);
		}
		else if(num == 3) {
			this.attestation.setFinal(mark);
		}
	}
	
	public void addAttendance(Attendance attendance) {
		this.attendances.add(attendance);
	}
	public void setAttendance(int index) {
		this.attendances.get(index).changeStatus();
	}
	public void setIsOpen(int index) {
		this.attendances.get(index).changeIsOpen();
	}
	public Vector<Attendance> getAttendances(){
		return this.attendances;
	}
	
	public int getCredits() {
		return this.credits;
	}
	public String getName() {
		return this.name;
	}
	
	public String getTranscpirt() {
		return this.name + " " + this.attestation.getTotal();
	}
}
