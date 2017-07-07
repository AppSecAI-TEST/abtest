package java8.stream;
import java.util.ArrayList;
import java.util.List;
public class User {
	private int id;
	private String name;
	private int age;
	public User(int id, String name, int age) {
		this.id = id; 
		this.name = name;
		this.age = age;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public static List<User> getUsers() {
		List<User> list = new ArrayList<User>();
		list.add(new User(1, "Raj", 20));
		list.add(new User(2, "Shiva", 15));
		list.add(new User(3, "Ram", 25));
		list.add(new User(4, "Anupam", 30));
		list.add(new User(5, "Prabhat", 18));
		list.add(new User(6, "Dinesh", 20));
		list.add(new User(7, "Rana", 15));
		list.add(new User(8, "Raju", 25));
		list.add(new User(9, "Keshav", 30));
		list.add(new User(10, "Mahesh", 18));
		return list;
	}
} 