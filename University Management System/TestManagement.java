import java.util.Scanner;
import java.util.*;
class TestManagement {
 public static void main(String[] args){
 
    String name;
	String email;
	String address;
    String faculty;
  	String department;
    String contact;
    int age;
   
    long staffId;
    String position;
    int basicSalary = 2000;
    int housingAllowance = 40;
    int serviceAllowance;
    String status;
    int paySalary;
    int grossSalary;
    int workingTime;
    int ratePerHour = 2;
    int netSalary;
    int netSalaryTax = 3;
    int serviceYear;
    int ratePerYear = 20;
   
    long studentId;
	String programmeIntake;
	String programmeName;
    int creditHours;
    int ratePerCredit=20;
    int feeTotal;
   
   
   Scanner lecturer1 = new Scanner (System.in);
   
    System.out.println("Enter Lecturer Name : ");
    name = lecturer1.nextLine();   
   
    System.out.println ("Enter Lecturer Email : ");
    email = lecturer1.nextLine(); 
   
    System.out.println("Enter Lecturer Address : ");
    address = lecturer1.nextLine();
   
    System.out.println("Enter Lecturer Faculty : ");
    faculty = lecturer1.nextLine(); 
   
    System.out.println("Enter Lecturer Department : ");
    department = lecturer1.nextLine(); 
   
    System.out.println("Enter Lecturer Contact : ");
    contact = lecturer1.nextLine(); 
   
    System.out.println("Enter Lecturer Age : ");
    age = lecturer1.nextInt(); 
   
    System.out.println("Enter Lecturer ID : ");
    staffId = lecturer1.nextLong();  
  
    System.out.println("Enter Lecturer Working Time : ");
    workingTime = lecturer1.nextInt();
   
    System.out.println("Enter Lecturer Service Year : ");
    serviceYear = lecturer1.nextInt();

   
    Lecturer l1 = new Lecturer ( name,  email,  address,  faculty,  department,  contact,  age,  staffId,  "Head",    "Permanent",   workingTime,  serviceYear);
    l1.getAge();
    System.out.print(l1);
    l1.getContact();
    System.out.println();
   

   
   Scanner student1 = new Scanner (System.in); 
   
    System.out.println("Enter Student Name : ");
    name = student1.nextLine();   
   
    System.out.println ("Enter Student Email : ");
    email = student1.nextLine(); 
   
    System.out.println("Enter Student Address : ");
    address = student1.nextLine();
   
    System.out.println("Enter Student Faculty : ");
    faculty = student1.nextLine(); 
   
    System.out.println("Enter Student Department : ");
    department = student1.nextLine(); 
   
    System.out.println("Enter Student Programme Intake : ");
    programmeIntake = student1.nextLine(); 
   
    System.out.println("Enter Student Programme Name : ");
    programmeName = student1.nextLine();
    
    System.out.println("Enter Student Contact : ");
    contact = student1.nextLine(); 
   
    System.out.println("Enter Student Age : ");
    age = student1.nextInt(); 
   
    System.out.println("Enter Student ID : ");
    studentId = student1.nextLong();
    
    System.out.println("Enter Student Credit Hours : ");
    creditHours = student1.nextInt();
   
    
    Student s1 = new Student ( name, email, address, faculty, department , contact, age, studentId, programmeIntake, programmeName,  creditHours, "Active" );
    s1.getAge();
    System.out.print(s1);
    s1.getContact();
    System.out.println();
   

   
  Scanner student2 = new Scanner (System.in); 
   
    System.out.println("Enter Student Name : ");
    name = student2.nextLine();   
   
    System.out.println ("Enter Student Email : ");
    email = student2.nextLine(); 
   
    System.out.println("Enter Student Address : ");
    address = student2.nextLine();
   
    System.out.println("Enter Student Faculty : ");
    faculty = student2.nextLine(); 
   
    System.out.println("Enter Student Department : ");
    department = student2.nextLine(); 
    
    System.out.println("Enter Student Programme Intake : ");
    programmeIntake = student2.nextLine(); 
   
    System.out.println("Enter Student Programme Name : ");
    programmeName = student2.nextLine();
    
    System.out.println("Enter Student Contact : ");
    contact = student2.nextLine(); 
   
    System.out.println("Enter Student Age : ");
    age = student2.nextInt(); 
   
    System.out.println("Enter Student ID : ");
    studentId = student2.nextLong();
  
    System.out.println("Enter Student Credit Hours : ");
    creditHours = student2.nextInt();
   
   
   Student s2 = new Student ( name, email, address, faculty, department , contact, age, studentId, programmeIntake, programmeName,  creditHours, "Active" );
   s2.getAge();
   System.out.print(s2);
   s2.getContact();
   System.out.println();
      

}
}
