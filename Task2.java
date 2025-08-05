import java.util.ArrayList;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args){
        ArrayList<Student> students=new ArrayList<>();
        Scanner sc=new Scanner(System.in);
        int choice=0;
        while(choice!=5){
            System.out.println("\n---Student Record Management System---");
            System.out.println("1. Add student");
            System.out.println("2. view Students");
            System.out.println("3. update student");
            System.out.println("4. Delete student");
            System.out.println("5. Exit");
            System.out.println("Enter your choice:");
            choice=sc.nextInt();
            if(choice==1){
                System.out.println("Enter Student ID:");
                int id=sc.nextInt();
                System.out.println("Enter Student Name:");
                String name=sc.next();
                System.out.println("Enter Student marks");
                double marks=sc.nextDouble();
                students.add(new Student(id,name,marks));
                System.out.println("Student Details added Successfully");
            }
            else if(choice==2){
                if(students.isEmpty()){
                    System.out.println("Student data not found");

                }
                else{
                    System.out.println("\n---student list---");
                    for(Student s:students){
                        System.out.println(s);
                    }
                }
            }
            else if(choice==3){
                System.out.print("Enter Student ID data to update: ");
                int updateId = sc.nextInt();
                boolean foundUpdate = false;
                for (Student s : students) {
                    if (s.getId() == updateId) {
                        sc.nextLine();
                        System.out.print("Enter new student name: ");
                        String newName = sc.nextLine();
                        System.out.print("Enter new student marks: ");
                        double newMarks = sc.nextDouble();
                        s.setName(newName);
                        s.setMarks(newMarks);
                        System.out.println("✅ Student updated successfully!");
                        foundUpdate = true;
                        break;
                    }
                }
                if (!foundUpdate) {
                    System.out.println("Student ID not found!");
                }
            }
            else if(choice==4){
                System.out.println("Enter student ID data to delete:");
                int deleteId=sc.nextInt();
                boolean foundDelete=false;
                for(int i=0;i<students.size();i++){
                    if(students.get(i).getId()==deleteId){
                        students.remove(i);
                        System.out.println("Student data deleted succesfully");
                        foundDelete=true;
                        break;
                    }
                }
                if(!foundDelete){
                    System.out.println("Student ID not found");
                }

            }
            else if(choice==5){
                System.out.println("Exit the Student Record");

            }else{
                System.out.println("Invalid choice! please try again");
            }

        }

    }
}