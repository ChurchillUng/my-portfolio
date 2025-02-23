public class Project {
  private String name;
  private String description;
  
  public Project(String name, String description){
    this.name = name;
    this.description = description;
  }
  
  public void display() {
    System.out.println("Project Name: " + name);
    System.out.println("Description: " + description);
    System.out.println();
  }
