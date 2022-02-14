package project01;

public class Java1 {
int I = 7;
static int Z = 280;
static void Jack()
{
	System.out.println("charan");

}	
static void  charan()
{
	System.out.println("Ravi");
}
	       public static void main(String[] args) 
	       {
		       int a = 10;
		       Java1 f1=new Java1();
		       Java1 c2=new Java1();
	           System.out.println(f1.I);
	           System.out.println("asdfhjkl"+  Z);
	           f1.I=500;c2.Z=300;
	           
	           System.out.println(c2.I);
	           System.out.println(c2.Z);
	           System.out.println(f1.I);
	           System.out.println(c2.Z);
	           System.out.println(f1.Z);
	           Java1.Jack();
	           
	           c2.charan();
	           
	           Java1.charan();
	           
		
	}

}
