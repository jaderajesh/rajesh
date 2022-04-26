import java.util.*;
class Demo2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the ID:");
        int i=sc.nextInt();
        System.out.println("enter the name:");
        String name=sc.next();
        System.out.println("enter the age:");
        int age=sc.nextInt();
        System.out.println("enter the salary:");
        double salary=sc.nextDouble();
        System.out.println("enter the designation:");
        String desi=sc.next();
    
    
        System.out.println("ID:"+i);
        System.out.println("Name:"+name);
        System.out.println("Age :"+age);
        System.out.println("Salary:"+salary);
        System.out.println("designation:"+desi);
    }
}