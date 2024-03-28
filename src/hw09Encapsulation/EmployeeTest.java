package hw09Encapsulation;

public class EmployeeTest {
	public static void main(String[] args) {
		// Creating Employee object

		Employee employee = new Employee();
		employee.setName("Shampa Afroz");
		employee.setAge(400);
		employee.setSex('F');
		employee.setCitizen(true);

		System.out.println("Name:" + employee.getName() + "\nAge:" + employee.getAge() + "\nSex:" + employee.getSex()
				+ "\nCitizen:" + employee.isCitizen());

	}
}
