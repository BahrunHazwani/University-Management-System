import java.util.Scanner;
import java.text.*;
class Student extends Person 
  {
 	protected long studentId;
	protected String programmeIntake;
	protected String programmeName;
    protected int creditHours;
  	protected int ratePerCredit=20;
  	protected String status;
  	protected int feeTotal;
  
public Student (){}
  public Student(  String name, String email, String address, String faculty, String department , String contact, int age, long studentId, String programmeIntake, String programmeName, int creditHours, String status )
  {
   super (name,  email,  address,  faculty,  department, contact, age);
    
	this.studentId=studentId;
	this.programmeIntake=programmeIntake;
	this.programmeName=programmeName;
	this.creditHours=creditHours;
    this.ratePerCredit=ratePerCredit;
    this.status=status;
    this.feeTotal=feeTotal;
  }
  
  public void setStudentId (long studentId)
  {
	this.studentId = studentId;
  }
  
  public void setProgrammeIntake (String programmeIntake)
  {
	this.programmeIntake = programmeIntake;
  }
  
  public void setProgrammeName (String programmeName)
  {
    this.programmeName=programmeName;
  }
  
  public void setCreditHours (int creditHours)
  {
    this.creditHours=creditHours;
  }

  public void setRatePerCredit (int ratePerCredit)
  {
    this.ratePerCredit = ratePerCredit;
  }
  
  public void setStatus (String status)
  {
    this.status = status;
  }
  
  public void setFeeTotal (int feeTotal)
  {
   this.feeTotal = feeTotal;
  }
  
  public long getStudentId()
  {
	return studentId;
  }
  
  public String getProgrammeIntake()
  {
    return programmeIntake;
  }
  
  public String getProgrammeName()
  {
    return programmeName;
  }
 public int getRatePerCredit()
  {
    return ratePerCredit;
  }

  public int getCreditHours()
  {
    return creditHours;
  }

  public String getStatus(){
    return status;
  }
  
  public int calculateTotalFees()
  {
    feeTotal = creditHours * ratePerCredit;
    return feeTotal;
  }   

  public String getContact()
  {
  	return contact;
  } 

  public String toString()
  {
	return super.toString()+"Student id : "+studentId+"\n"+"Programme Intake : "+programmeIntake+"\n"+"Programme Name : "+programmeName+"\n"+"Status : "+status+"\n"+"Credit Hours : " +creditHours+"\n"+"Fee Total : RM "+calculateTotalFees()+"\n";
      
  }

  }
    