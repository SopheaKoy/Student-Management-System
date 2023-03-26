package co.istad;
import java.util.ArrayList;
import java.util.Scanner;
public class ApplicationConsole {
    static void pressKey(){
        System.out.println("--------------- Press Key Enter to Continue ----------------------");
        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
    }
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        boolean isValidate = false;
        int option =0;
        do{
            System.out.println("------------------------ Information Student ----------------------");
            System.out.println("1 -> Insert Student to System");
            System.out.println("2 -> Edit Student Information");
            System.out.println("3 -> Search Student Information");
            System.out.println("4 -> Delete Student Information");
            System.out.println("5 -> Show Student Information");
            System.out.println("6 -> Exit Program ");
            System.out.println("--------------------------------------------------------------------");
            do {
                System.out.print("Choose one Option (1-6) : ");
                String stuOp=input.next();
                try{
                    option=Integer.parseInt(stuOp);
                    isValidate = true;
                }catch (Exception e){
                    isValidate = false;
                    System.out.println("ERROR !! INVALID INPUT...! TRY AGAIN.");
                }
            }while (!isValidate);
            switch (option){
                case 1 ->{
                    Student student1 = new Student();
                    System.out.println("------------- Insert Information Student -----------------");
                    student1.inputInformation(input);
                    list.add(student1);
                }
                case 2 ->{
                    Student student1 = new Student();
                    boolean isValid = false;
                    System.out.println("--------------------- Edit Information Student ---------------");
                    int eId =0;
                    System.out.print("Enter ID to edit : ");
                    eId=input.nextInt();
                    for (int i  =0 ;i< list.size();i++){
                        if (eId == list.get(i).id){
                            do{
                                System.out.print("Enter student ID : ");
                                try{
                                    String stuId = input.next();
                                    student1.id=Integer.parseInt(stuId);
                                    isValid = true;
                                }catch (Exception e ){
                                    System.out.println("\"ERROR !! ID cannot Little\"");
                                    isValid = false;
                                }
                            }while (!isValid);
                            System.out.print("Enter student Name : ");
                            input.nextLine();
                            student1.name=input.nextLine();
                            System.out.print("Enter student Gender : ");
                            student1.gender=input.next();
                            System.out.print("Enter student Class : ");
                            input.nextLine();
                            student1.classRoom=input.nextLine();
                            do{
                                System.out.print("Enter student Age : ");
                                try{
                                    String stuAge = input.next();
                                    student1.age=Integer.parseInt(stuAge);
                                    isValid = true;
                                }catch (Exception e ){
                                    System.out.println("\"ERROR !! Age cannot Little\"");
                                    isValid = false;
                                }
                            }while (!isValid);
                            do{
                                System.out.print("Enter student Score : ");
                                try{
                                    String stuScore = input.next();
                                    student1.score=Float.parseFloat(stuScore);
                                    isValid = true;
                                }catch (Exception e ){
                                    System.out.println("\"ERROR !! Score cannot Little\"");
                                    isValid = false;
                                }
                            }while (!isValid);
                            list.set(i,student1);
                            System.out.println("-------------------------------------------");
                            System.out.println("Successfully to Edit inforamtion.");
                            System.out.println("-------------------------------------------");
                        }else{
                            System.out.println("Student With ID : "+eId+" is Wrong Pleas correct ID .....!");
                            isValid = false;
                        }
                    }
                }
                case 3 ->{
                    System.out.println("-------------------- Search Information Student ------------");
                    int op = 0;
                    boolean isValidExit = false;
                    System.out.println("1. Search By ID ");
                    System.out.println("2. Search By Name ");
                    System.out.println("3. Search By Gender");
                    System.out.println("4. Search By Class");
                    System.out.println("5. Exit Search");
                    System.out.print("Choose one Option to Search (1-5) : ");
                    String SID = input.next();
                    try{
                        op=Integer.parseInt(SID);
                    }catch (Exception e){
                        op=0;
                        System.out.println("Pleas don't input Little and Wrong (1-5) ");
                    }
                    switch (op){
                        case 1->{
                            int sId =0 ;
                            System.out.print("Enter ID to Search : ");
                            String stuId=input.next();
                            try{
                                sId=Integer.parseInt(stuId);
                            }catch (Exception e){
                                System.out.println("\"ERROR !! ID cannot Little\"");
                            }
                            for (int i =0;i<list.size();i++){
                                if (sId ==list.get(i).id){
                                    list.get(i).showInforamtion();
                                    System.out.println("ID : "+sId+" Student Search is found.");
                                    System.out.println("---------------------------------------------");
                                }else{
                                    System.out.println("ID : "+SID+" Don't hava in System.");
                                }
                            }
                        }
                        case 2->{
                            String sName ;
                            System.out.print("Enter ID to Search : ");
                            input.nextLine();
                            sName=input.nextLine();
                            for (int i =0;i<list.size();i++){
                                if (sName.equalsIgnoreCase(list.get(i).name)){
                                    list.get(i).showInforamtion();
                                    System.out.println("NAME : "+sName+" Student Search is found.");
                                    System.out.println("---------------------------------------------");
                                }
                            }
                        }
                        case 3->{
                            String sGender ;
                            System.out.print("Enter Gender to Search : ");
                            input.nextLine();
                            sGender=input.nextLine();
                            for (int i =0;i<list.size();i++){
                                if (sGender.equalsIgnoreCase(list.get(i).gender)){
                                    list.get(i).showInforamtion();
                                    System.out.println("Gender : "+sGender+" Student Search is found.");
                                    System.out.println("---------------------------------------------");
                                }
                            }
                        }
                        case 4->{
                            String sClass ;
                            System.out.print("Enter Gender to Search : ");
                            input.nextLine();
                            sClass=input.nextLine();
                            for (int i =0;i<list.size();i++){
                                if (sClass.equalsIgnoreCase(list.get(i).classRoom)){
                                    list.get(i).showInforamtion();
                                    System.out.println("Class : "+sClass+" Student Search is found.");
                                    System.out.println("---------------------------------------------");
                                }
                            }
                        }
                        case 5->{
                            System.out.println("Exit Search information Student.");
                        }
                    }
                }
                case 4 ->{
                    int dId;
                    System.out.println("--------------- Delete Information ----------------------");
                    System.out.print("Enter Student ID to delete : ");
                    dId=input.nextInt();
                    for (int i=0;i< list.size();i++){
                        if (dId==list.get(i).id){
                            list.remove(i);
                            System.out.println("ID : "+dId + " Delete Successfully .");
                        }
                    }
                }
                case 5 ->{
                    System.out.println("----------------- Show Information -------------------------");
                    for (int i=0;i<list.size(); i++){
                        list.get(i).showInforamtion();
                    }
                }
                case 6 ->{
                    System.out.println("Exit Program Student System.");
                    System.exit(0);
                }
                default -> System.out.println("Wrong Option ! Choose again from 1 - 6 !!");
            }
            pressKey();
        }while(option !=6);
    }
}