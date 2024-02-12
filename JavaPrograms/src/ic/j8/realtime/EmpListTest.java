package ic.j8.realtime;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class EmpListTest {

	public static void main(String[] args) {

		List<Emp> empList = new ArrayList<Emp>();
        
		empList.add(new Emp(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
		empList.add(new Emp(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
		empList.add(new Emp(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
		empList.add(new Emp(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
		empList.add(new Emp(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
		empList.add(new Emp(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
		empList.add(new Emp(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
		empList.add(new Emp(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
		empList.add(new Emp(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
		empList.add(new Emp(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
		empList.add(new Emp(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
		empList.add(new Emp(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
		empList.add(new Emp(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
		empList.add(new Emp(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
		empList.add(new Emp(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
		empList.add(new Emp(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
		empList.add(new Emp(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
		
		
		
		//Q1. How many male and female emp are there
		Map<String, Long> noOfMale_nFemaleEmps = empList.stream().collect(Collectors.groupingBy(Emp::getGender, Collectors.counting()));
		System.out.println("Number of male and female emps: "+noOfMale_nFemaleEmps);
		
		System.out.println("____________________________________");
		//Q2. Print the name of all departments in the organisation
		empList.stream().map(Emp::getDept).distinct().forEach(System.out::println);
		
		System.out.println("____________________________________");
		//Q3. What is the average age of male and female emp
		Map<String, Double> avgAgeOfMale_nFemaleEmps = empList.stream().collect(Collectors.groupingBy(Emp::getGender, Collectors.averagingInt(Emp::getAge)));
		System.out.println("Average age of male and female emps: "+avgAgeOfMale_nFemaleEmps);
		
		System.out.println("____________________________________");
		//Q4. Get the details of highest paid emp in the org
		//Emp highestPaidEmp = empList.stream().collect(Collectors.maxBy(Comparator.comparingDouble(Emp::getSalary))).get();
		Emp highestPaidEmp = empList.stream().max(Comparator.comparingDouble(Emp::getSalary)).get();
		System.out.println("			Details of Highest paid Emp:");
		System.out.println(highestPaidEmp);
		
		System.out.println("____________________________________");
		//Q5. Get the names of all employee who joined after 2015
		System.out.println("			---employees who joined after 2015---");
		empList.stream().filter(e -> e.getYearOfJoining() > 2015).map(Emp::getName).forEach(System.out::println);
		
		System.out.println("____________________________________");
		//Q6. Count the number of Employees in each department
		Map<String, Long> empCountByDept = empList.stream().collect(Collectors.groupingBy(Emp::getDept, Collectors.counting()));
//		System.out.println(empCountByDept);
		empCountByDept.entrySet().stream().forEach(e -> {
			System.out.println(e.getKey()+": "+e.getValue());
		});
		
		System.out.println("____________________________________");
		//Q7. What is the average salary of each department
		Map<String, Double> avgSalaryOfDepts = empList.stream().collect(Collectors.groupingBy(Emp::getDept, Collectors.averagingDouble(Emp::getSalary)));
		avgSalaryOfDepts.entrySet().stream().forEach(e -> {
			System.out.println(e.getKey()+": "+e.getValue());
		});
		
		System.out.println("____________________________________");
		//Q8. Get the details of youngest male emp in the product development?
		Emp youngestMaleEmpInProductDevelopment = empList.stream().filter(e -> e.getGender() == "Male" && e.getDept() == "Product Development")
		.min(Comparator.comparingInt(Emp::getAge)).get();
		System.out.println(youngestMaleEmpInProductDevelopment);
		
		System.out.println("____________________________________");
		//Q9. Who has the most working experience in the organization?
		Emp seniorMostEmp = empList.stream().sorted(Comparator.comparingInt(Emp::getYearOfJoining)).findFirst().get();
		System.out.println(seniorMostEmp);
		
		System.out.println("____________________________________");
		//Q10. How many male and female emps are there in the sales and marketing team?
		Map<String, Long> countMaleFemaleEmpsInSalesMarketing = empList.stream().filter(e -> e.getDept() == "Sales And Marketing").collect(Collectors.groupingBy(Emp::getGender, Collectors.counting()));
		System.out.println(countMaleFemaleEmpsInSalesMarketing);
		
		System.out.println("____________________________________");
		//Q11. Average salary of male and female emps
		Map<String, Double> avgSalaryOfMaleAndFemaleEmps = empList.stream().collect(Collectors.groupingBy(Emp::getGender, Collectors.averagingDouble(Emp::getSalary)));
		System.out.println(avgSalaryOfMaleAndFemaleEmps);
		
		System.out.println("____________________________________");
		//Q12. List down the names of emps in each depts
		Map<String, List<Emp>> empListByDept = empList.stream().collect(Collectors.groupingBy(Emp::getDept));
		/*empListByDept.entrySet().stream().forEach(d -> {
			System.out.println("--------- Emps in : "+d.getKey()+" ---------");
			d.getValue().stream().forEach(e -> {
				System.out.println(e.getName());
			});
		});*/
		Set<Entry<String, List<Emp>>> entrySet = empListByDept.entrySet();
		for(Entry<String, List<Emp>> entry: entrySet) {
			System.out.println("--------- Emps in : "+entry.getKey()+" ---------");
			List<Emp> deptWiseEmp = entry.getValue();
			for(Emp e: deptWiseEmp) {
				System.out.println(e.getName());
			}
		}
		
		System.out.println("____________________________________");
		//Q13. Average salary and total salary of the whole organisation
		DoubleSummaryStatistics empSalaryStatistics = empList.stream().collect(Collectors.summarizingDouble(Emp::getSalary));
		System.out.println("Average Salary: "+empSalaryStatistics.getAverage());
		System.out.println("Total Salary: "+empSalaryStatistics.getSum());
		
		System.out.println("____________________________________");
		//Q14. Seperate the emps younger or equal to 25 yrs from older than 25 yrs
		Map<Boolean, List<Emp>> partitionEmpsByAge = empList.stream().collect(Collectors.partitioningBy(e -> e.getAge() > 25));
		Set<Entry<Boolean, List<Emp>>> entrySet2 = partitionEmpsByAge.entrySet();
		for(Entry<Boolean, List<Emp>> entry: entrySet2) {
			if(entry.getKey()) {
				System.out.println("-----Emp older than 25 yrs: -----");
			}
			else {
				System.out.println("-----Emp younger than or equal to 25 yrs: -----");
			}
			List<Emp> e_list = entry.getValue();
			for(Emp e: e_list) {
				System.out.println(e.getName());
			}
		}
		
		
		System.out.println("____________________________________");
		//Q15 : Who is the oldest employee in the organization? What is his age and which department he belongs to?
		Emp oldestEmp = empList.stream().max(Comparator.comparingInt(Emp::getAge)).get();
		System.out.println("Name: "+oldestEmp.getName());
		System.out.println("Age: "+oldestEmp.getAge());
		System.out.println("Dept: "+oldestEmp.getDept());
	}

}
