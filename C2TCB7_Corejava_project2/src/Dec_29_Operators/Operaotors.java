package Dec_29_Operators;
public class Operaotors {

	public static void main(String[] args) {
		int  a=10;
		int b=20;
	  
		int c=a+(b++)+(++a)-b;
        System.out.println(c);
        
        int d=(a++)+b+a+(++b);
        System.out.println(d);
	}

}

