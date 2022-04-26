import java.util.Scanner;
class clerk{
    int id;
    String name;
    static int salary=15000;
    static String designation="clerk";
    clerk(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your ID");
        id=sc.nextInt();
        System.out.println("Enter your Name");
        name=sc.next();
        System.out.println("Enter your Age");
    }
    void show(){
        System.out.println("\nID:"+id);
        System.out.println("Name:"+name);
    }
}
class developer{
    int id;
    String name;
    static int salary=25000;
    static String designation="developer";
    developer(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your ID");
        id=sc.nextInt();
        System.out.println("Enter your Name");
        name=sc.next();
        System.out.println("Enter your Age");
    }
    void show(){
        System.out.println("\nID:"+id);
        System.out.println("Name:"+name);
    }
}
class tester{
    int id;
    String name;
    static int salary=20000;
    static String designation="tester";
    tester(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your ID");
        id=sc.nextInt();
        System.out.println("Enter your Name");
        name=sc.next();
        System.out.println("Enter your Age");
    }
    void show(){
        System.out.println("\nID:"+id);
        System.out.println("Name:"+name);
    }
}
class manager{
    int id;
    String name;
    static int salary=50000;
    static String designation="manager";
    manager(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your ID");
        id=sc.nextInt();
        System.out.println("Enter your Name");
        name=sc.next();
        System.out.println("Enter your Age");
    }
    void show(){
        System.out.println("\nID:"+id);
        System.out.println("Name:"+name);
    }
}
class Demo3{
public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numnber between 0 and 5");
        int i=sc.nextInt();
        if(i>0 && i<5){
            switch(i){
                case 1:
                    clerk c=new clerk();
                    c.show();
                    System.out.println("Salary:"+clerk.salary);
                    System.out.println("designation:"+clerk.designation);
                    break;
                case 2:
                    developer d=new developer();
                    d.show();
                    System.out.println("Salary:"+developer.salary);
                    System.out.println("designation:"+developer.designation);
                    break;
                case 3:
                    tester t=new tester();
                    t.show();
                    System.out.println("Salary:"+tester.salary);
                    System.out.println("designation:"+tester.designation);
                    break;
                case 4:
                    manager m=new manager();
                    m.show();
                    System.out.println("Salary:"+manager.salary);
                    System.out.println("designation:"+manager.designation);
                    break;
                default:
                    System.out.println("Exit, thank you");
            }
        }

    }
}