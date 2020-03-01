package disenvowler;

public class Runner {
	
	public void removevowels(String s) {
		String vowels = s;
		for(int i= 0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c=='a' || c=='e'||c=='i'||c=='o'||c=='u' || c ==' ') {
				String a ="" + c;
				s = s.replace(a, "");
				
			}
		}
		System.out.println("Consonantes: " + s);
		System.out.println("Vogais: " + getvowels(vowels));
	}
	public String getvowels(String s) {
		String vowels = new String();
		for(int i= 0; i<s.length(); i++) {
			char c = s.charAt(i);
			if(c=='a' || c=='e'||c=='i'||c=='o'||c=='u' || c ==' ') {
				String a ="" + c;
					if(!a.equals(" ")) {
					vowels = vowels.concat(a);
					}	
			}
		}
		return vowels;
	}
}
