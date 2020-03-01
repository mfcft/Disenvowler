package disenvowler;

public class Runner {
	
	
	public void removevowels(String s) {
		String vowels = s;
		
		for(int i= 0; i<s.length(); i++) { // iterates through the String characters
			char c = s.charAt(i);
			if(c=='a' || c=='e'||c=='i'||c=='o'||c=='u' || c ==' ') { // when a vowel or empty space is found it gets removed
				String a ="" + c;
				s = s.replace(a, ""); 
				
			}
		}
		System.out.println("Consonantes: " + s);
		System.out.println("Vogais: " + getvowels(vowels));
	}
	
	
	public String getvowels(String s) { // method that returns a string with only the vowels of another given string
		String vowels = new String();
		for(int i= 0; i<s.length(); i++) { // iterate the string
			char c = s.charAt(i);
			if(c=='a' || c=='e'||c=='i'||c=='o'||c=='u' || c ==' ') { // finds vowels or spaces
				String a = "" + c; //convert char to string
					if(!a.equals(" ")) {
					vowels = vowels.concat(a); // add char each time a vowel is found
					}	
			}
		}
		return vowels;
	}
}
