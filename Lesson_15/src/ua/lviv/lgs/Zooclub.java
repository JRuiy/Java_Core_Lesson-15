package ua.lviv.lgs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Zooclub {

	Map<Person, List<Animal>> map = new HashMap<Person, List<Animal>>();

	public void addMembers() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("¬вед≥ть ≥м'€");
		String name = sc.next();
		System.out.println("¬вед≥ть в≥к");
		int age = sc.nextInt();
		map.put(new Person(name, age), new ArrayList<Animal>());
	}
	
	public void addPetToMembers() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("¬вед≥ть ≥м'€ учасника клубу");
		String nameOfMembers = sc.next();
		System.out.println("¬вед≥ть тип тварини");
		String type = sc.next();
		System.out.println("¬вед≥ть ≥м'€ тварини");
		String nameOfPet = sc.next();
		
		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();
		
		while(iterator.hasNext()) {
			Entry<Person, List<Animal>> next = iterator.next();
			if(next.getKey().getName().equalsIgnoreCase(nameOfMembers)) {
				List<Animal> value = next.getValue();
				Animal a = new Animal(type, nameOfPet);
				value.add(a);
				next.setValue(value);
			}
		}
	}
	
	public void deletePetOfMembers() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("¬вед≥ть ≥м'€ учасника клубу");
		String nameOfMembers = sc.next();
		System.out.println("¬вед≥ть тип тварини");
		String type = sc.next();
		System.out.println("¬вед≥ть ≥м'€ тварини");
		String nameOfPet = sc.next();
		
		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry<Person, List<Animal>> next = iterator.next();
			if(next.getKey().getName().equalsIgnoreCase(nameOfMembers)) {
				List<Animal> value = next.getValue();
				Iterator<Animal> iterator2 = value.iterator();
					while(iterator2.hasNext()) {
						Animal next2 = iterator2.next();
						if(next2.getType().equalsIgnoreCase(type)&&next2.getName().equalsIgnoreCase(nameOfPet)) {
							iterator2.remove();
						}
					}
			}
		}
	}
	
	public void deleteMember() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("¬вед≥ть ≥м'€ учасника клубу");
		String nameOfMembers = sc.next();
		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry<Person, List<Animal>> next = iterator.next();
			if(next.getKey().getName().equalsIgnoreCase(nameOfMembers)) {
				iterator.remove();
			}
		}
	}
	
	public void deleteSpecificPet() {
		Scanner sc = new Scanner(System.in);
		System.out.println();
		System.out.println("¬вед≥ть тип тваринки");
		String type = sc.next();
		Iterator<Entry<Person, List<Animal>>> iterator = map.entrySet().iterator();
		while(iterator.hasNext()) {
			Entry<Person, List<Animal>> next = iterator.next();
			List<Animal> value = next.getValue();
			Iterator<Animal> iterator2 = value.iterator();
			while(iterator2.hasNext()) {
				Animal next2 = iterator2.next();
				if(next2.getType().equalsIgnoreCase(type)) {
					iterator2.remove();
				}
			}
		}
	}
	
	public void bringZooclub() {
		Set<Entry<Person, List<Animal>>> entrySet = map.entrySet();
		for (Entry<Person, List<Animal>> entry : entrySet) {
			System.out.println(entry.getKey() + " " + entry.getValue());
		}
	}
	
	
}
