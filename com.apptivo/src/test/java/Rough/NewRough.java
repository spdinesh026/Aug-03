package Rough;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NewRough {
	
	public void testrough1() {
		
		ArrayList<String> names = new ArrayList<String>();
		
		names.add("Dinesh");
		names.add("Cool");
		names.add("All");
		names.add("Ask");
		names.add("And");
		
		
		Integer cone = (int) names.stream().filter(s-> s.startsWith("A")).count();
		System.out.println(cone);
		
		List<Integer> values = Arrays.asList(1,6,4,7,6,2,3,4,3,7);
		values.stream().distinct().forEach(s->System.out.print(s));
		values.stream().distinct().sorted().forEach(s->System.out.println(s));
		List<Integer> values1 = values.stream().distinct().sorted().collect(Collectors.toList());
		System.out.println(values1.get(2));
		
	}
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NewRough sui = new NewRough();
		sui.testrough1();
		

	}

}
