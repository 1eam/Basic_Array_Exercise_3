package basicArrayExercise;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		String [] fruits = new String [] {"Apple", "Banana", "Pear", "Mandarine", "Orange", "Plumbs", "Melon", "Grapes" };

		System.out.println(Arrays.toString (fruits));
		System.out.println(fruits [2]);
		System.out.println(fruits [7]);
		System.out.println(fruits [5]);
		System.out.println(fruits [5]);
		
		System.out.println("My favourite fruits, ranked in order are " + fruits [5] + " " + fruits [7] + " and " + fruits [4]);
		
		int optellenWaardenParameters = optellen(7,8);
		System.out.println(optellenWaardenParameters);
		
	}//Hier wordt een Method gemaakt, buiten de main
	public static int optellen(int x, int y) {
		return x + y;
	}
}
/*Inconvenience nr1:
 * line 15: For readability improvement it would be better if "fruits [5]" could be displayed as: "fruits "Plumbs" instead*/