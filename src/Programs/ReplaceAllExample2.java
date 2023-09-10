package Programs;

public class ReplaceAllExample2 {

	public static void main(String[] args) {
		String s1 = "My name is Rajendra. My name is lamror.My name is technolamror";
		String replaceString = s1.replaceAll("is", "was");//replce all occurances of is to was
		System.out.println(replaceString);

	}

}
