package ie.atu.sw;

public class Runner {//runs the program
	
	public static void main(String[] args) {
		byte b = 65; //8 bits in a byte
		int i = b; //32 bits in an int
		float f = i; //A float is 32 bits, has precision of 7-9 p.o.d
		long l = (long) f; //A long is 64 bits
		double d = l; //A 64 bit decimal number, precision of 16-19 p.o.d.
		char c = (char) d; //A char has 16 bits
		
		System.out.println("Result: " + c);//prints: "Result: A"
		c++;
		System.out.println("Result: " + c);//prints: "Result: B"
		
		/*
		 * 65 is A in ASCII
		 * A + 1 = B
		 * 
		 */
		
	}

}
