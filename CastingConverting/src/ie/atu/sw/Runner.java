package ie.atu.sw;

public class Runner {//runs the program
	
	public static void main(String[] args) {
		byte b = 65; //8 bits in a byte
		int i = b; //32 bits in an int
		float f = i; //A float is 32 bits, has precision of 7-9 p.o.d
		long l = (long) f; //A long is 64 bits
		/*
		 * Java will recommend coercion to resolve error
		 * will not convert automatically without due to data loss
		 * decimal points will be lost following coercion
		 */
	}

}
