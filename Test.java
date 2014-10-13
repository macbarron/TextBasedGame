import java.util.*;

public class Test {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<String>();
		System.out.println("What do /b/ ?");
		String[] input = scanner.nextLine().split("\\s+");        
		for (String i : input) {
			list.add(i);               
		}
        System.out.println(list);
	}
}