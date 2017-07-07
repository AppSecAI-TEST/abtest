package java8.stream;
import java.util.List;
public class FilterFindFirstAndForEach {
	public static void main(String[] args) {
		List<User> list = User.getUsers();
		System.out.println("Using findFirst() ---");
		User user = list.stream().filter(u -> u.getName().startsWith("R"))
				.findFirst().orElse(null);
		System.out.println(user.getName());
		System.out.println("Using forEach() ---");
		list.stream().filter(u -> u.getName().endsWith("sh"))
				.forEach(u -> System.out.println(u.getName()));
	}
} 