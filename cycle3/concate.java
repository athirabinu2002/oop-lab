/*Java program to concatenate two numbers and strings using method
overloading concept.*/
class concate
{ 
  public static void main(String args[])
   {
   concate Obj=new concate();
   Obj.consum("5"+"6");
   Obj.consum("Namitha"+" "+"Nandan");
   }
  void consum(int a)
  {
   System.out.println("Concated number:" +a);
  }
  void consum(String a)
   {
    System.out.println("Concated String=" +a);
   }
} 
