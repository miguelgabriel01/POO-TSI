public class Project {

  public String name;
  // estimed time in mouths
  public Integer estimatedTime;
  public Number cost;
  public Employee[] employees = new Employee[4];
  public String stage;

  public Project(String name, Integer estimatedTime, Number cost) {
    this.name = name;
    this.estimatedTime = estimatedTime;
    this.cost = cost;
    this.stage = "initialized";
  }

  public void addEmployee(Employee[] employees) {
    this.employees = employees;
  }
}
