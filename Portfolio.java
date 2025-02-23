public class Portfolio{
  public static void main (String[] args){
    System.out.println("Welcome to my personal portfolio website!\n");
    System.out.println("About me:");
    System.out.println("I am Churchill and I work as a Product Design Engineer.\n");
    System.out.println("Education:\n");
    System.out.println("Bachelor's Degree in Mechanical Engineering | Curtin University 2018\n");
    System.out.println("Projects: \n");
    
    Project project1 = new Project("Cad Automation Tool", "Automated Cad task using SolidWorks API.");
    Project project2 = new Project("Telegram bot", "A bot that performs personal task for me.");
    
    project1.display();
    project2.display();
  }
}
