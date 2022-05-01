import java.util.Scanner;

public class App {
  public static void main(String[] args) throws Exception {
    Scanner reader = new Scanner(System.in);

    Employee[] employees = Employee.generateEmployees();

    System.out.println("Application to create a project with all characteristics!");
    System.out.println("=========================================================");

    System.out.println("What's name of this project ?");
    String projectName = reader.nextLine();
    System.out.println("=========================================================");

    System.out.println("What's estimated time os this project ? (Mouths)");
    int estimatedTime = reader.nextInt();
    System.out.println("=========================================================");

    System.out.println("What's cost os this project ?");
    float projectCost = reader.nextFloat();
    System.out.println("=========================================================");


    Project project = new Project(projectName, estimatedTime, projectCost);

    System.out.println("Here is the new project");
    System.out.println("");
    System.out.println("Name: " + project.name);
    System.out.println("Estimated time: " + project.estimatedTime + " Mouths");
    System.out.println("Cost: " + project.cost + " R$");
    System.out.println("Stage: " + project.stage);
    System.out.println("=========================================================");

    System.out.println("");
    System.out.println("Do you want to add the four available employees in this project? ? (S/N)");

    String option = reader.next();

    if ("S".equals(option) || "s".equals(option)) {
      project.addEmployee(employees);
      System.out.println("Here is the updated info of the project");
      System.out.println("");
      System.out.println("Name: " + project.name);
      System.out.println("Estimated time: " + project.estimatedTime + " Mouths");
      System.out.println("Cost: " + project.cost + "R$");
      System.out.println("Employees:");
      System.out.println("name " + project.employees[0].name);
      System.out.println("name " + project.employees[1].name);
      System.out.println("name " + project.employees[2].name);
      System.out.println("name " + project.employees[3].name);
      System.out.println("=========================================================");
    } else {
      System.out.println("Ok, another time you can create a new project and add employees");
      System.out.println("=========================================================");
    }

  }
}
