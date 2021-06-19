import java.util.*; 
abstract class Details {
  public abstract String phoenDetails(int num);
}

class Phone extends Details {
  public String phoenDetails(int num) {
	  String name;
	  switch (num) {
	  case 1:
	    name ="Apple";
	    break;
	  case 2:
	    name ="Samsung";
	    break;
	  case 3:
	    name ="Google";
	    break;
	  case 4:
	    name ="Huawei";
	    break;
	  case 5:
	    name ="OnePlus";
	    break;
	  case 6:
	    name ="Xiaomi";
	    break;
	  case 7:
	    name ="LG";
	    break;
	  case 8:
		 name ="Oppo";
		  break;
	  case 9:
		  name ="Vivo";
		  break;
	  case 10:
		  name ="Nokia";
		  break;
	  default:
		  name ="Out of range";
	}
    return name;
  }
}

class Main {
  public static void main(String[]  args) {
    Phone myObj = new Phone(); 
   
   Scanner sc= new Scanner(System.in);    //System.in is a standard input stream  
   System.out.print("Enter no. between 1 to 10 to see phone brand rank.") ; 
  
   while (!sc.hasNextInt()) {
       System.out.println("That's not a number!");
       sc.next();
   }
   int aa= sc.nextInt();
   if (aa == (int)aa)
   {
	   String a= myObj.phoenDetails(aa);
	   
	   if (aa<11)
	   {
		   System.out.println("Phone brand rank for no "+ aa +" is : "+ a);
	   }
	   else
	   {
		   System.out.println(a);
	   }
   }
   else
   {
	   System.out.println("Not a Number");
   }
  
  }
}