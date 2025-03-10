package ie.atu.sw;

public class Runner {//runs the program
	
	public static void main(String[] args) {
		byte b = 65; //8 bits in a byte
		int i = b; //32 bits in an int
		float f = i; //A float is 32 bits, has precision of 7-9 p.o.d
		long l = (long) f; //A long is 64 bits
		double d = l; //A 64 bit decimal number, precision of 16-19 p.o.d.
		char c = d; //A char has 16 bits
		/*
		 * Type mismatch: cannot convert from double to char
		 * Not enough bits in a char to store the bits of the double
		 */
	}

}
