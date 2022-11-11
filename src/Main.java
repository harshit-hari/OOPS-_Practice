 class Namaste{
    public Namaste(){
        this("RAM");
        System.out.println("Default constructor");
    }

    public Namaste(String x){
       this("RAM" , " SHYAAM");
        System.out.println("Namaste from :" + x);
    }
    public Namaste(String x , String y){
        System.out.println("Namaste from " + x + " To" + y);

    }
}
//  ............................TASK @2 ..........................

 class Base{

    Base(){
        this(5);
        System.out.println("Calling Default Constructor of Base Class");
    }

    Base( int x){

        System.out.println("Calling parameterized constructor of Base Class with x equal to " + x);
    }

 }
 class Derived extends Base{
    Derived(){
        System.out.println("Calling Default Constructor of Derived Class");
    }
    Derived(int x){
       super(5);
        System.out.println("Calling parameterized constructor of Derived Class with x equal to " + x);
    }


 }
   // >>>>>>>>>>>>>>>>>>>>>......................TASK 3.............<<<<<<<<<<<<.............

 class Student{
    int rollNumber;
    Student(){
        this("abc " , "cba");
        System.out.println("Default Constructor is called!");
    }
    Student(String firstname , String lastname){
        System.out.println("Constructor with 2 arguments, firstName: " + firstname + " and Lastname: " + lastname + " was called");


    }

    Student(String firstname , String lastname , int rollNumber){
        System.out.println("Constructor with 2 arguments, firstName: " + firstname + " and Lastname: " + lastname + " & rollNumber: " + rollNumber +" was called");
    }


         }


         //  .........................................TASK 4>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>.............




public class Main {
    public static void main(String[] args) {

      // System.out.println("Hello world!");

      //  new Namaste();
      //  Derived x1 = new Derived(5);
       // Student student1 = new Student();
      //  Student student2 = new Student("avc" , "cba");
      //  Student student3 = new Student("nehal" , "mnb" , 67);
    }
}