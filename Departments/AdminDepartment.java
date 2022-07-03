package Departments;


public class AdminDepartment extends SuperDepartment {
    
	public AdminDepartment() 
	{ 
	
	}
	@Override
	public String departmentName()
	{
		return "Admin Department";
	}
	
	@Override
	public String getTodaysWork()
	{
		return "Complete your documents Submission";
	}
	
	@Override
	public String getWorkDeadline()
	{
		return "Complete by EOD";
	}
		
	@Override
	public String isTodayAHoliday()
	{
		return "Today is not a Holiday";
	}
	 

}
