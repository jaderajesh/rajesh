import java.util.*;
class A{
    A(){
        System.out.println("class A");
    }
}
class B{
    String B(){
        return "hoi";
    }
}
class Demo1{
    public static void main(String[] args) {
        //System.out.println("hello java");
        /*ArrayList<String> ar1=new ArrayList<String>(Arrays.asList("python","java","python","ruby","test"));
        System.out.println(ar1);
        ar1.remove("python");
        System.out.println(ar1.lastIndexOf("python"));
        ArrayList<Integer> ar2=new ArrayList<Integer>(Arrays.asList(1,2,3,1,4,1,5,6,7,8,9,10,11));
       // ar2.removeIf(num -> num%2!=0 );
       ar2.retainAll(Collections.singleton(1));
        System.out.println(ar2);*/
        A a=new A();
        B b = new B();
        String k=b.B();
        System.out.println(k);

    }
}