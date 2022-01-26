class concatenate
{ 
  public static void main(String args[])
   {
   concatenate Obj=new concatenate();
   Obj.consum("3"+"8");
   Obj.consum("Good"+" "+"Morning");
   }
  void consum(int x)
  {
   System.out.println("Concatenated number:" +x);
  }
  void consum(String x)
   {
    System.out.println("Concatenated String=" +x);
   }
}
