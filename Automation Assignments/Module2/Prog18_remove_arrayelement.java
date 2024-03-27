package Assigmnet1;

import java.util.ArrayList;

public class Prog18_remove_arrayelement {
 public static void main(String[] args) {

		ArrayList<String>  friends = new ArrayList<String>();
		friends.add("nilam");
		friends.add("shaily");
		friends.add("nil");
		friends.add("mihan");
		friends.add("pooja");
		friends.add("geeta");
		System.out.println(friends);
		friends.remove(2);
		System.out.println(friends);
}

}
