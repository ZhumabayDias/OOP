package problem2C;

import java.util.HashSet;

public class Test {

	public static void main(String[] args) {
		HashSet<Building> build = new HashSet<>();
		Building build1 = new Building(30,"cement");
		Building build2 = new Building(54,"aggregate");
		Building build3 = new Building(30,"cement");
		
		Dormitory dorm1 = new Dormitory(20,"cement",500);
		Dormitory dorm2 = new Dormitory(23,"aggregate",980);
		Dormitory dorm3 = new Dormitory(20,"cement",500);
		
		build.add(dorm3);
		build.add(dorm2);
		build.add(dorm1);
		build.add(build3);
		build.add(build2);
		build.add(build1);
		
		for (Building b : build){
            System.out.println(b);
        }
	}
}
