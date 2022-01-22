package Jan_22_Generics_String_and_Stringbuffers;
public class GenericMethodDemo {
	
	   public <E>void displayArrayElements(E[] elements)
	   {
		  for(E element:elements) 
		  {
			  System.out.println("element is: "+element);
		  }
	   }
		public static void main(String[] args) 
		{
			GenericMethodDemo obj=new GenericMethodDemo();
		Integer[] intarray= {10,20,30,40};
		String[] str= {"java","programming", "learning"};
		
		obj.displayArrayElements(intarray);
		obj.displayArrayElements(str);
		}

	}


