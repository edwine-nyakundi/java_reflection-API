
class Employee{
	int empId;
	String name;
}
class Demo{
	public static void main(String[] args) throws ClassNotFoundException {
		Employee employee = new Employee();
		// employee object
		Class name = employee.getClass();
		System.out.println(name);
		// string object
		name = "hello".getClass();
		System.out.println(name);
	}
}
	