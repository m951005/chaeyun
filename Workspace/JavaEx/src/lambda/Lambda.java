package lambda;

import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambda {
	public static void main(String[] args) {
		ArrayList<Integer> array = new ArrayList<>();
		array.add(1);
		array.add(2);
		array.add(3);
		array.add(4);
		
		array.forEach((n) -> {System.out.println(n);});
		System.out.println();
		Consumer<Integer> method = n -> {System.out.println(n);};
		array.forEach(method);
		
		Runnable runnable = () -> {
			System.out.println("Hello");
		};
		
		Runnable runnable2 = new Runnable(){
			public void run(){
		    	System.out.println("Lambda");
		    }
		};
		

	}

}
