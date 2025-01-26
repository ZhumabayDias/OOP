package model;

import java.io.Serializable;

public class Room implements Serializable{
    private int number;      
    private int capacity;   

    public Room(int number, int capacity) {
        this.number = number;
        this.capacity = capacity;
    }

  
    public int getNumber() {
        return number;
    }

   
    public void setNumber(int number) {
        this.number = number;
    }

   
    public int getCapacity() {
        return capacity;
    }

   
    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }


	@Override
	public String toString() {
		return "Room [number=" + number + ", capacity=" + capacity + "]";
	}

    
}
