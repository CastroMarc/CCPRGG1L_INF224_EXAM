public class Student{

    String Surname;  
    String firstName;
    Character middleInitial;
    int dateOfBirth;
    int studentNumber;
    String studentemailAddress;
    Boolean iAmAwesome;
 
    public void sayMystudentNumber(){
 
        System.out.println("My Student Number is " + studentNumber);      
 
    }

    public void sayMyEmailAddress(){
        System.out.println("My Email Address is " + studentemailAddress);
    }
 
    public void AmIAwesome(){
 
        System.out.println("I am awesome = " + iAmAwesome);
    }
 }
