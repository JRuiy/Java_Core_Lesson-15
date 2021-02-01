package ua.lviv.lgs;

import java.util.Scanner;

public class Main {

	static void menu() {
		System.out.println("Введіть 1 щоб Додати учасника клубу");
		System.out.println("Введіть 2 щоб Додати тваринку до учасника клубу");
		System.out.println("Введіть 3 щоб Видалити тваринку з учасника клубу");
		System.out.println("Введіть 4 щоб Видалити учасника з клубу");
		System.out.println("Введіть 5 щоб Видалити конкретну тваринку зі всіх власників");
		System.out.println("Введіть 6 щоб Вивести на екран зооклуб");
		System.out.println("Введіть 7 щоб Вийти з програми");
	}

	public static void main(String[] args) {
		menu();
		Zooclub z = new Zooclub();
		Scanner sc = new Scanner(System.in);
		while (true) {
			switch (sc.next()) {
			case "1": {
				z.addMembers();
				break;
			}
			case "2": {
				z.addPetToMembers();
				break;
			}
			case "3": {
				z.deletePetOfMembers();
				break;
			}
			case "4": {
				z.deleteMember();
				break;
			}
			case "5": {
				z.deleteSpecificPet();
				break;
			}
			case "6": {
				z.bringZooclub();
				break;
			}
			case "7": {
				System.exit(0);
				break;
			}
			}
		}

	}
}
