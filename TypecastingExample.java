package Phase1;

public class TypecastingExample {

	public static void main(String[] args) {
		// Typecast between float and long//
	    float f=5.74f;
	    long l=(long)f;
		System.out.println("Long value:" + l);
		// Typecast from double-> Long ->int->char//
		double d=6.06;
		long l1=(long)d;
		int i=(int)l1;
		char c=(char)'i';
		System.out.println("Double value:" + d);
		System.out.println("Long value:" + l1);
		System.out.println("Int value:" + i);
		System.out.println("Char value:" + c);
		// Typecast between long and byte//
		long l2=3333333;
		byte b=(byte)l2;
		System.out.println("Long value:" + l2);
		System.out.println("Byte value:" + b);
		//Typecast from int-> double -> long //
		int i1 =100;
		double d1=i1;
		long ll=(long)d1;
		System.out.println("Int value:" + i1);
		System.out.println("Double value:" + d1);
		System.out.println("long value:" + ll);
	}

}
