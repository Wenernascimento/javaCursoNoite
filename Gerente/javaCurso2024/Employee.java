package javaCurso2024;

public class Employee {
	protected String name;
	protected double salary;

// classe Construtora:

	public Employee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}

	// Método para exibir os dados do empregado:
	public double calculateBonus() {
		return this.salary * 0.10;
	}

//Método para exibir os dados do empregado:
	public void showEmployeeData() {
		System.out.println(" Nome: " + name);
		System.out.println(" Salário:" + salary);
		System.out.println(" Bônus:" + calculateBonus());
	System.out.println("salário Total :"+ (salary + calculateBonus()));
	}
	
}