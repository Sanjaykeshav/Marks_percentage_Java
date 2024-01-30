import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Hello world!");

    System.out.println("enter the marks of subject 1");
    float m1=sc.nextFloat();
    
    System.out.println("enter the marks of subject 2");
    float m2=sc.nextFloat();
    
    System.out.println("enter the marks of subject 3");
    float m3=sc.nextFloat();
    
    System.out.println("enter the marks of subject 4");
    float m4=sc.nextFloat();
    
    
    System.out.println("enter the marks of subject 5");
    float m5=sc.nextFloat();

    System.out.println("marks obtained in all subjects are");

    System.out.println("subject 1= "+m1);
    System.out.println("subject 2= "+m2);
    System.out.println("subject 3= "+m3);
    System.out.println("subject 4= "+m4);
    System.out.println("subject 5= "+m5);

    float percentage =(m1+m2+m3+m4+m5)/500*100;
    System.out.println("percentage is"+percentage);
  }
  
}
