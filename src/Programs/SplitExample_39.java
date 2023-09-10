package Programs;

public class SplitExample_39 {

	public static void main(String[] args) {
		String s1 = "java string split method by technolamror";
		String[] words = s1.split("\\s");//splits the string based on whitespace
		//using java for each loop to print the elements of string array
		//System.out.print(words);
		for(String w : words) {
			System.out.println(w);
			//System.out.print(" ");
		}

	}

}
