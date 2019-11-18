package pack1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  
		  List<Customer> lst = new ArrayList<>();
		  
		  Customer customer1 = new Customer("Jack", new Address("Pune",12345),new Vehicle("Car")); 
		  Customer customer2 = new Customer("Rob", new Address("Mumbai",54321),new Vehicle("Bike"));
		  Customer customer3 = new Customer("Kesha", new Address("Banglore",456789),new Vehicle("Car"));
		  Customer customer4 = new Customer("John", new Address("Mumbai",54321),new Vehicle("Car"));
		  Customer customer5 = new Customer("Lisa", new Address("Delhi",987654),new Vehicle("Bike"));
		  lst = Arrays.asList(customer1,customer2,customer3,customer4,customer5);
		  
		//  System.out.println(lst);
		 
		  
		  // Before Java 8
		 /* for (Customer iter : lst) {
			System.out.println(iter);
		}*/
		  
		  
		  // ForEach implementation
		  lst.forEach(p -> {
			  System.out.println(p);
		  });
		  
		  System.out.println("******************Stream API to get specific Customer from a List****************************");
		  // Stream API to get specific Customer from a List
		  Customer robData = lst.stream().filter(p -> p.name.equals("Rob")).findAny().orElse(null);
		  System.out.println(robData);
		  
		  System.out.println("***************Convert list(without duplicate keys) to map*******************************");
		  //Save list to map
		  Map<String, Customer> mp = lst.stream().collect(Collectors.toMap(e -> e.name, e -> e));
		  // e -> e = Function.identity()
		  Map<String, Customer> mp1 = lst.stream().collect(Collectors.toMap(e -> e.name, Function.identity()));
		  mp1.entrySet().forEach(p -> System.out.println(p.getKey()+ " "+p.getValue())); 
		  
		  System.out.println("*****************Stream API to get specific Customer from a Map*****************************");
		  // Stream API to get specific Customer from a Map
		  Map<String, Customer> lisaData = mp.entrySet().stream().filter(p -> p.getKey().equals("Lisa")).collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue()));
		  // Alternate way
		  Map<String, Customer> lisaData1 = mp.entrySet().stream().filter(p -> p.getKey().equals("Lisa")).collect(Collectors.toMap(Map.Entry :: getKey, Map.Entry :: getValue));
		  System.out.println(lisaData1);
		  
		  
	}	
}



class Customer{
	String name;
	
	Address address;
	Vehicle vehicle;
	public Customer(String name, Address address, Vehicle vehicle) {
		super();
		this.name = name;
		this.address = address;
		this.vehicle = vehicle;
	}
	@Override
	public String toString() {
		return "Customer [name=" + name + ", address=" + address + ", vehicle=" + vehicle + "]";
	}
	
}

class Address{
	String city;
	Integer pinCode;
	public Address(String city, Integer pinCode) {
		super();
		this.city = city;
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", pinCode=" + pinCode + "]";
	}
	
}

class Vehicle{
	String type;

	public Vehicle(String type) {
		super();
		this.type = type;
	}

	@Override
	public String toString() {
		return "Vehicle [type=" + type + "]";
	}
	
}
