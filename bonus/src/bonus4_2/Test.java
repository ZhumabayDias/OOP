package bonus4_2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Размер мира: ");
		int worldX = scanner.nextInt();
		int worldY = scanner.nextInt();
		World world = new World(worldX,worldY);
		System.out.println("Координация слайма:");
		int slimeX = scanner.nextInt();
		int	slimeY = scanner.nextInt();
		System.out.println("Здоровье слайма:");
		int slimeXp = scanner.nextInt();
        Slime slime = new Slime(slimeX,slimeY,slimeXp);
        System.out.println("Координация еды:");
		int foodX = scanner.nextInt();
		int	foodY = scanner.nextInt();
        Food food = new Food(foodX, foodY);
        if (Minecraft.canGo(world,slime,food)) {
            System.out.println("Slime can");
        } else {
            System.out.println("Slime cannot");
        }

	}

}
