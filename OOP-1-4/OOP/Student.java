package OOP;

//import OOP.Person;

public class Student extends Person{
    String id;
    Student(){
        System.out.println("ok");
    }
    public Student(String name , String id){
        this.name = name;
        this.id = id;
    }
    public String getID() {
        return id;
    }
    public void setID(String id){
        this.id = id;
    }
    public void introduce(){
        System.out.println("Name: " + this.getName());
        System.out.println("ID: " + this.getID());
        System.out.printf("My name is %s \nMy student ID is %s\n", this.name ,this.id);
    }
}