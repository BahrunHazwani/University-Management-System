import java.util.Scanner;
import java.text.*;
abstract class Person
  {
	protected String name;
	protected String email;
	protected String address;
  	protected String faculty;
  	protected String department;
    protected String contact;
    protected int age;

public Person (){}

  public Person( String name, String email, String address, String faculty, String department, String contact, int age )
  {
	this.age=age;
	this.name=name;
	this.email=email;
	this.address=address;
    this.contact=contact;
    this.faculty=faculty;
    this.department=department;
  }

  public void setName (String name)
  {
	this.name = name;
  }

  public void setEmail (String email)
  {
	this.email=email;
  }

  public void setAddress (String address)
  {
    this.address = address;
  }

  public void setContact (String contact)
  {
    this.contact = contact;
  }

  public void setFaculty (String faculty)
  {
    this.faculty = faculty;
  }

  public void setDepartment (String department)
  {
    this.department = department;
  }

  public void setAge (int age)
  {
	this.age = age;
  }

  public String getName()
  {
    return name;
  }

  public String getEmail()
  {
    return email;
  }

  public String getAdress()
  {
    return address;
  }

  public String getFaculty()
  {
    return faculty;
  }

  public String getDepartment()
  {
    return department;
  }

  public int getAge()
  {
   if (age < 18) {
      throw new ArithmeticException("Access denied - You must be at least 18 years old.");
    }
    else if (age > 18) {
      System.out.println("Access granted - You are old enough!");
    }
    return age;
  }

  public String toString()
  {
	return "Name : "+name+"\n"+"Email : "+email+"\n"+"Address : "+address+"\n"+"Faculty : "+faculty+"\n"+"Department :"+department+"\n"+ "Age : "+age+"\n"+ "Contact : "+ contact+ "\n";

  }

  public abstract String getContact();

  }

