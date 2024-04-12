
import java.util.Scanner;

public class trial {
   String name;
   int age;


   public trial(String name, int age) {
      this.name = name;
      this.age = age;
   }

   public String getName() {
      return name;
   }
   public void setname(String name){
    this.name = name;
   }

   public int getage() {
      return age;
   }
   public void setage(int age) {
      this.age= age;
   }


   public static void main(String[] args) {
    Scanner scanner= new Scanner(System.in);
       
     System.out.println("Enter your name");
     String name=scanner.nextLine();

     System.out.println("My name is " +name);

     System.out.println("What is your age");
     int age=scanner.nextInt();

     System.out.println("My age is " +age);


   }
    
}
