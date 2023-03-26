package co.istad;
import java.util.Scanner;
public class Student {
    int id;
    String name;
    String gender ;
    int age;
    String classRoom;
    float score ;
    public void inputInformation(Scanner input){
        boolean isValid = false;
        do{
            System.out.print("Enter student ID : ");
            try{
                String stuId = input.next();
                id=Integer.parseInt(stuId);
                isValid = true;
            }catch (Exception e ){
                System.out.println("\"ERROR !! ID cannot Little\"");
                isValid = false;
            }
        }while (!isValid);
            System.out.print("Enter student Name : ");
            input.nextLine();
            name=input.nextLine();
            System.out.print("Enter student Gender : ");
            gender=input.next();
        do{
            System.out.print("Enter student Age : ");
            try{
                String stuAge = input.next();
                age=Integer.parseInt(stuAge);
                isValid = true;
            }catch (Exception e ){
                System.out.println("\"ERROR !! Age cannot Little\"");
                isValid = false;
            }
        }while (!isValid);
        System.out.print("Enter student Class : ");
        input.nextLine();
        classRoom=input.nextLine();
        do{
            System.out.print("Enter student Score : ");
            try{
                String stuScore = input.next();
                score=Float.parseFloat(stuScore);
                isValid = true;
            }catch (Exception e ){
                System.out.println("\"ERROR !! Score cannot Little\"");
                isValid = false;
            }
        }while (!isValid);
        System.out.println("Successfully to insert Information.");
        System.out.println("--------------------------------------------");
        System.out.println("Press Key Enter to Continue.");
    }
    public void showInforamtion(){

        System.out.println("Student ID : "+id);
        System.out.println("Student Name  : "+name);
        System.out.println("Student Gender : "+gender);
        System.out.println("Student Age   : "+age);
        System.out.println("Student Class : "+classRoom);
        System.out.println("Student Score : "+score);
        System.out.println("---------------------------------------------");
    }
    public Student(){}
    public Student(int id, String name,String gender ,int age, String classRoom, float score){
        this.id=id;
        this.name=name;
        this.gender=gender;
        this.age=age;
        this.classRoom=classRoom;
        this.score=score;
    }
}
