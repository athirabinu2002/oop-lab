 import java.util.*; 
 public class Garbage 
 { 
 public static void main(String args[]) 
 { 
 gar obj=new gar(); 
 obj=null; 
 gar a = new gar(); 
 gar b = new gar(); 
 b = a; 
 System.gc(); 
 } 
 protected void finalize() throws Throwable 
 { 
 System.out.println("Garbage collection ids done by JVM"); 
 } 
 }
