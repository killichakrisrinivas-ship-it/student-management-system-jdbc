package org.example;

import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class StudentManagementSystem {
    private final StudentDAO dao;
    private final Scanner sc;

    public StudentManagementSystem() throws Exception {
        dao = new StudentDAOImpl();
        sc = new Scanner(System.in);
    }
    private Student readStudent(){
        int sid;
        while(true){
            System.out.println("Enter id");
            try{
                sid = sc.nextInt();
                sc.nextLine();
                if(sid > 0){
                    break;
                }
                else {
                    System.out.println("Id cannot be negative.");
                }
            }catch(InputMismatchException e){
                System.out.println("Please enter a valid number.");
                System.out.println(e.getMessage());
                sc.nextLine();
            }

        }


        String name ;
        while(true){
            System.out.println("Enter name");
            name = sc.nextLine();
            if(!name.trim().isEmpty()){
                break;
            }
            else{
                System.out.println("Name cannot be empty");
            }

        }



        int age;
        while(true){
            System.out.println("Enter age");
            try{
                age = sc.nextInt();
                sc.nextLine();
                if(age > 0 &&  age <=120){
                    break;
                }
                else{
                    System.out.println("Age must be between 1 and 120.");
                }

            }
            catch(InputMismatchException e){
                System.out.println("Enter a valid number");
                sc.nextLine();
            }

        }



        String branch;
        while(true){
            System.out.println("Enter Branch");
            branch = sc.nextLine();
            if(!branch.trim().isEmpty()){
                break;
            }
            else{
                System.out.println("Branch cannot be empty");
            }

        }

        String email;

        while (true) {

            System.out.println("Enter email:");

            email = sc.nextLine();

            if (email.contains("@") && email.contains(".")) {
                break;
            }

            System.out.println("Invalid email.");

        }

        return new Student(sid,age,name,branch,email);
    }
    private void viewStudents() {
        try{
            List<Student > students = dao.getAllStudents();
            for(Student s : students){
                System.out.println(s);
            }
        }
        catch(SQLException e){
            System.out.println("Failed to retrieve student.");
            System.out.println(e.getMessage());
        }

    }
    private void deleteStudents() {
        try{
            System.out.println("ENTER THE STUDENT ID YOU WANT TO DELETE");
            int deleteid = sc.nextInt();
            dao.deleteStudent(deleteid);
        }
        catch(SQLException e){
           System.out.println(e.getMessage());
        }

    }
    private void addStudents() {
        try{
            dao.addStudent(readStudent());
            System.out.println("Student added successfully");
        }
       catch(SQLException e){
            System.out.println("Could not add student");
       }
    }
    private void updateStudents() {
        try{
            dao.updateStudent(readStudent());
            System.out.println("Updated Successfully");
        }
       catch(SQLException e){
            System.out.println("Could not update student.");
       }
    }
    private void showMenu(){
        System.out.println("==== STUDENT MANAGEMENT SYSTEM ====");
        System.out.println("1.ADD STUDENT");
        System.out.println("2.VIEW STUDENT");
        System.out.println("3.UPDATE STUDENT");
        System.out.println("4.DELETE STUDENT");
        System.out.println("5.EXIT");
    }

    public void start()  {
        while(true){
        showMenu();
            int choice = sc.nextInt();
            switch(choice){
                //ADD STUDENT
                case 1:
                    addStudents();
                    break;
                //VIEW STUDENT
                case 2:
                    viewStudents();
                    break;
                //UPDATE STUDENT
                case 3:
                    updateStudents();
                    break;
                //DELETE STUDENT
                case 4:deleteStudents();
                    break;
                case 5:sc.close();
                    return;
                default :System.out.println("Invalid choice .Please try again");
            }

        }


    }

}
