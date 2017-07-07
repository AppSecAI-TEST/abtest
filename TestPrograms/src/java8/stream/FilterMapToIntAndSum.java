package java8.stream;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;
public class FilterMapToIntAndSum {
	public static <T> void main(String[] args) {
		List<User> list = User.getUsers();
		System.out.println("--- Sum of age between the user id 2 and 4 ---");
		int sum = list.stream().filter(u -> u.getId() >= 2 && u.getId() <= 4)
				.mapToInt(u -> u.getAge()).sum();
		System.out.println("Sum: " + sum);
		
		int add = list.stream().filter(new Predicate<User>() {

			@Override
			public boolean test(User u) {
				return (u.getId() >= 2 && u.getId() <= 4);
			}
		}).mapToInt(u -> u.getAge()).sum();
		
		
		User u=list.stream().reduce(new BinaryOperator<User>() {
			
			@Override
			public User apply(User t, User u) {
				// TODO Auto-generated method stub
				return null;
			}
		}).get();
		
		System.out.println(add);
	}
} 