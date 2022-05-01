public class Employee {
  public String name;
  public String cpf;
  public String address;

  public Employee(String name, String cpf, String address) {
    this.name = name;
    this.cpf = cpf;
    this.address = address;
  }

  public static Employee[] generateEmployees() {
    Employee employee1 = new Employee("José", "999.999.999-99", "Any address");
    Employee employee2 = new Employee("Maria", "999.999.999-99", "Any adrress");
    Employee employee3 = new Employee("Creuza", "999.999.999-99", "Any adrress");
    Employee employee4 = new Employee("Jhon", "999.999.999-99", "Any adrress");
    
    Employee[] employees = new Employee[4];

    employees[0] = employee1;
    employees[1] = employee2;
    employees[2] = employee3;
    employees[3] = employee4;

    System.out.println("nome da mulesta: " + employees[2].name);
    return employees;
  }
}
