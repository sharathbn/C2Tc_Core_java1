package Dec_27_Primitive_Data_Types;
public class TypeCastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				// widening/implicit typecasting
						byte b = 10;
						int i = b;
						System.out.println(i);

						float f = 22.14f;
						double d = f;
						System.out.println(d);

						char ch = 'A';
						int i3 = ch;
						System.out.println(i3);

						char var1 = '\u00A7';
						int i4 = var1;
						System.out.println(i4);
						// narrowing/explicit typcasting

						double f1 = 10.532f;
						float l = (float) f1;
						System.out.println(l);

						float f2 = 34.56f;
						double i1 = (double) f2;
						System.out.println(i1);

						long l1 = 9223372036854775806L;
						double i2 = (double) l1;
						System.out.println(i2);
						
						byte b1=65;
						char ch1=(char)b1;
						System.out.println(ch1);

	}


}
