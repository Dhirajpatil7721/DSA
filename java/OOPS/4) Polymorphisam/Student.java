class Person{
    String name;
    int age;


public void Pinfo(String name) {

    System.out.println(name);
    
}
public void Pinfo(int age) {

    System.out.println(age);
    
}

public void Pinfo(String name ,int age) {

    System.out.println(name +" "+ age);
    
}


}

public class Student{


public static void main(String[] args) {
    
Person Per = new Person();

Per.Pinfo("Dhiraj");
Per.Pinfo(22);
Per.Pinfo("patil" ,24);

}

}