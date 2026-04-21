# The code of Example 01
~~~
public class Teacher {
    String name,gender;
    String phone;
    void setInformation(String n,String m,String ph){
        name=n;
        gender=m;
        phone=ph;
    }
    void show(){
        System.out.println("Teacher's Name :"+name);
        System.out.println("Teacher's Gender :"+gender);
        System.out.println("Teacher's Name :"+phone);
        System.out.println("\n\n");

    }
}
public class Main{
    public static void main(String[] args){
        Teacher t1=new Teacher();
        t1.setInformation("Anisul Islam","Male","1749272722");
        t1.show();
       Teacher t2=new Teacher();
        t2.setInformation("mahmud","Male","017797273923");
        t2.show();
    }
}
~~~
