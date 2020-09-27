package Collections.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeOperationsWithStreams {
	
	public static void main(String[]args) {
		
		
		List<Employee> employeeList = new ArrayList<Employee>();
		
		Employee e1= new Employee("venky",1);
		Employee e2= new Employee("abc",2);
		Employee e3= new Employee("xyz",3);
		
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		
		
		//get Emp List using streams
		
		List<String> empNames = employeeList.stream().map(e->e.getEname()).collect(Collectors.toList());
		employeeList.stream().forEach(e->e.getEname());
		empNames.stream().forEach((temp)->System.out.println(temp));

		
		
		
		
		
		
	}
	
	
	
	

}
