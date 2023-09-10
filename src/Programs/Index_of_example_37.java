package Programs;

public class Index_of_example_37 {

	public static void main(String[] args) {
		String s1 = "this is index of example";
		int index1 = s1.indexOf("is");//returns the index of is substring
		int index2 = s1.indexOf("of");//returns the index of index substring
		//System.out.println(index1+"   "+index2);//28
		
		//passing substring with from index
		int index3 = s1.indexOf("is",4);//returns the index of is substring after 4th index
		System.out.println(index3);//5 i.e, the index of another is
		
		//passing char value
		int index4= s1.indexOf('s',4);//returns the index of char value
		System.out.println(index4);//3

	}

}
