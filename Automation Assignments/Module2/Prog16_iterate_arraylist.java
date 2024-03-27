package Assigmnet1;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Prog16_iterate_arraylist {

	public static void main(String[] args) {
		ArrayList<String>  friends = new ArrayList<String>();
		friends.add("nilam");
		friends.add("shaily");
		friends.add("nil");
		friends.add("mihan");
		friends.add("pooja");
		friends.add("geeta");
		System.out.println(friends);
		for (int f=0 ;f<friends.size();f++) {
			System.out.println(friends.get(f));
		}

		

	}

}
