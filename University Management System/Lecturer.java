import java.util.Scanner;
import java.text.*;
class Lecturer extends Person  
  {
  	protected long staffId;
	protected String position;
  	protected int basicSalary = 2000;
  	protected int housingAllowance = 40;
  	protected int serviceAllowance;
  	protected String status;
  	protected int paySalary;
    protected int grossSalary;
    protected int workingTime;
    protected int ratePerHour = 2;
    protected int netSalary;
    protected int netSalaryTax = 3;
    protected int serviceYear;
    protected int ratePerYear = 20;

public Lecturer (){}
  
  public Lecturer ( String name, String email, String address, String faculty, String department, String contact, int age, Long staffId, String position,   String status,  int workingTime, int serviceYear )
  {
   super ( name,  email,  address,  faculty,  department, contact, age );
    
    this.staffId=staffId;
	this.position=position;
    this.basicSalary=basicSalary;
    this.housingAllowance=housingAllowance;
    this.serviceAllowance=serviceAllowance;
    this.status=status;
    this.paySalary=paySalary;
    this.grossSalary=grossSalary ;
    this.workingTime= workingTime; 
    this.serviceYear=serviceYear;
    this.netSalary=netSalary;
  }
  
  public void setStaffId (long staffId)
  {
    this.staffId = staffId;
  }
  
  public void setPosition (String position)
  {
	this.position = position;
  }

  public void setBasicSalary (int basicSalary)
  {
    this.basicSalary = basicSalary;
  }
  
  public void setHousingAllowance (int housingAllowance)
  {
    this.housingAllowance = housingAllowance;
  }
  
  public void setServiceAllowance (int serviceAllowance)
  {
    this.serviceAllowance = serviceAllowance;
  }
  
  public void setStatus (String status)
  {
    this.status = status;
  }
  
   public void setPaySalary (int salary)
  {
    this. paySalary = paySalary;
  }
  
  public void setWorkingTime (int workingTime)
  {
    this. workingTime = workingTime;
  }
  
  public void setServiceYear (int serviceYear)
  {
    this. serviceYear = serviceYear;
  }
  
  public long getStaffId()
  {
    return staffId;
  }
  public String getPosition()
  {
    return position;
  }
  public int getWorktime()
  {
    return workingTime;
  }
  
  public int getServiceYear()
  {
    return serviceYear;
  }
  
  public  int getBasicSalary()
  {
    return basicSalary;
  }
   public  int getHousingAllowance()
  {
    return housingAllowance;
  }
  public  int calculateGrossSalary()
  {
    grossSalary = basicSalary + (workingTime * ratePerHour);
    return grossSalary;
  }
  public  int calculateNetSalary()
  {
    netSalary = grossSalary - netSalaryTax;
    return netSalary;
  }
  public  int calculateServiceAllowance()
  {
    serviceAllowance = ratePerYear * serviceYear;
    return serviceAllowance;
  }
  public String getStatus()
  {
    return status;
  }
  public int paySalary()
  {
    paySalary = netSalary +housingAllowance + serviceAllowance;
    return paySalary;
  }
  
  public String getContact()
  {
   return contact;
  } 
  
  public String toString()
  {
	return super.toString()+"Staff id : "+staffId+"\n"+"Position : "+position+"\n"+"Status : "+getStatus()+"\n"+"Basic Salary : RM "+basicSalary+"\n"+"Working Time : "+workingTime+"\n"+"Housing Allowance : RM "+housingAllowance+"\n"+"Service Allowance : RM "+calculateServiceAllowance()+"\n" + "Gross Salary : RM " + calculateGrossSalary()+"\n" +"Net Salary : RM "+ calculateNetSalary()+"\n"+"Salary : RM "+paySalary()+"\n";
  }

  }
    