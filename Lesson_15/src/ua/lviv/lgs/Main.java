package ua.lviv.lgs;

import java.util.Scanner;

public class Main {

	static void menu() {
		System.out.println("������ 1 ��� ������ �������� �����");
		System.out.println("������ 2 ��� ������ �������� �� �������� �����");
		System.out.println("������ 3 ��� �������� �������� � �������� �����");
		System.out.println("������ 4 ��� �������� �������� � �����");
		System.out.println("������ 5 ��� �������� ��������� �������� � ��� ��������");
		System.out.println("������ 6 ��� ������� �� ����� �������");
		System.out.println("������ 7 ��� ����� � ��������");
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
