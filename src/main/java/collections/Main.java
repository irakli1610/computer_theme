package collections;

import java.util.*;



public class Main {

	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		names.add("nodo");
		names.add("nika");
		names.add("beglari");
		names.add("miriani");
		names.add("shota");
		
		names.add(2, "zauri");
		System.out.println(names.get(2));

		//---------------------------
		Vehicle bicycle = new Vehicle("bicycle", 1998);
		Vehicle car = new Vehicle("car", 2005);
		Vehicle tractor = new Vehicle("tractor", 1975);


		
		List< Vehicle> vehicles = new LinkedList<>();
		vehicles.add(new Vehicle());
		vehicles.add(bicycle);
		vehicles.add(car);
		vehicles.add(tractor);

		
		//----------------------
		
		HashMap<String, Vehicle> vehicleOwners = new HashMap<>();
		vehicleOwners.put("nodo",bicycle);
		vehicleOwners.put("beglari",bicycle);
		vehicleOwners.put("shota",bicycle);

		System.out.println(vehicleOwners);
		
		vehicleOwners.put("nodo",car);    //this 3 will update previous list becouse their keys(names) already exist in hashmap
		vehicleOwners.put("beglari",tractor);
		vehicleOwners.put("shota",bicycle);
		
		System.out.println(vehicleOwners);

		
		
		HashSet<String> namesOfEmployees = new HashSet<>();
		namesOfEmployees.add("nodo");
		namesOfEmployees.add("beglari");
		namesOfEmployees.add("shota");

		System.out.println(namesOfEmployees);
		
		namesOfEmployees.add("nodo");    //this 3 won't add previous list because their names already exist in hashSet
		namesOfEmployees.add("beglari");
		namesOfEmployees.add("shota");
		
		System.out.println(namesOfEmployees);

		PriorityQueue<Integer> garage = new PriorityQueue<>();
		garage.add(2);
		garage.add(3);
		garage.add(1);
		garage.add(9);
		garage.add(4);
		garage.add(65);
		
		
		System.out.println(garage.peek());
		garage.poll();
		System.out.println(garage.peek()); // value changed from 1 to two becouse 1 is already taken out by .poll() method
	}

}
