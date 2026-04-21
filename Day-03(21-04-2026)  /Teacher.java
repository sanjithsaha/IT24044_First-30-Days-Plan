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
