package views;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Vector;

import DBs.DBContext;
import OOPproject.PaperComparatorByDate;
import OOPproject.ResearchPaper;
import OOPproject.ResearchProject;
import OOPproject.ResearcherDecorator;
import Users.Student;
import Users.Teacher;
import Users.User;

public class ResearcherView {

	private static ResearcherDecorator researcher;
	private static Scanner input = new Scanner(System.in);
	
	public static void setResearcherView(ResearcherDecorator res) {
		researcher = res;
	}
	
	public static void welcome() {
		System.out.println("Welcome to Researcher menu");
		menu();
	}
	
	public static void menu() {
		System.out.println("0. Quit");
		System.out.println("1. Information");
		System.out.println("2. Publish project");
		System.out.println("3. Calculate hIndex");
		System.out.println("4. Print paper");
		System.out.println("5. Get Citation");
		System.out.println("6. Create Project");
		System.out.println("7. Join to Project");
		System.out.println("8. Add paper");
		System.out.println("9. View papers");
		System.out.println("10. View projects");
		
		int option = input.nextInt();
		
		if(option == 0) {
			if(researcher.getUser() instanceof Student) {
				StudentView.menu();
			}else if(researcher.getUser() instanceof Teacher) {
				TeacherView.menu();
			}
		}else if(option == 1) {
			System.out.println(researcher.toString());
			menu();
		}else if(option == 1) {
			
		}else if(option == 3) {
			System.out.println(researcher.calculateHIndex());
			menu();
		}else if(option == 4) {
			printPapers();
		}else if(option == 5) {
			printGetCitation();
		}else if(option == 6) {
			createProject();
		}else if(option == 7) {
			joinToProject();
		}else if(option == 8) {
			addPaper();
		}else if(option == 9) {
			viewPapers();
		}else if(option == 10) {
			researcher.viewJoinedProjects();
			System.out.println();
			menu();
		}
	
	}
	
	public static void publishProject() {
		
	}
	
	public static void printPapers() {
		System.out.println("0. Quit\n1. Select sorting");
		int option = input.nextInt();
		if(option == 0) {
			menu();
		}else if(option == 1) {
			System.out.println("1. Sort by Date");
			System.out.println("2. Sort by Citations");
			int answer = input.nextInt();
			if(answer == 1) {
				researcher.printPaperByDate();
			}else if(answer == 2) {
				researcher.printPaperByCitations();
			}
		}
		menu();
	}
	
	public static void printGetCitation() {
		System.out.println("0. Quit\n1. Select pattern");
		int option = input.nextInt();
		if(option == 0) {
			menu();
		}else if(option == 1) {
			System.out.println("1. Plain Text\n2. BibTeX");
			int answer = input.nextInt();
			if(answer == 1) {
				researcher.getCitation("Plain Text");
			}else if(answer == 2) {
				researcher.getCitation("BibTeX");
			}
		}
		menu();
	}
	
	public static void createProject() {
	    input.nextLine(); 
	    System.out.println("Enter the topic of the project:");
	    String topic = input.nextLine().trim();

	    if (topic.isEmpty()) {
	        System.out.println("Error: The topic cannot be empty. Please try again.");
	        menu();
	        return;
	    }

	    if (researcher.researchProject == null) {
	        researcher.researchProject = new Vector<>();
	    }

	    ResearchProject project = new ResearchProject(topic, researcher);
	    researcher.researchProject.add(project); 
	    DBContext.projects.add(project);         

	    try {
	        DBContext.saveProjects();
	        System.out.println("Project created and saved successfully!");
	    } catch (Exception e) {
	        System.out.println("Error: Failed to save the project. " + e.getMessage());
	    }

	    menu();
	}


	
	public static void joinToProject() {
	    if (DBContext.projects.isEmpty()) {
	        System.out.println("No projects available to join.");
	        menu();
	        return;
	    }

	    int num = 1;
	    for (ResearchProject project : DBContext.projects) {
	        System.out.println(num + ". " + project.getTopic());
	        num++;
	    }
	    System.out.println("0. Quit\nSelect a project to join:");

	    int option = input.nextInt();
	    input.nextLine();

	    if (option == 0) {
	        menu();
	        return;
	    }

	    if (option < 1 || option > DBContext.projects.size()) {
	        System.out.println("Invalid option. Please try again.");
	        joinToProject();
	        return;
	    }

	    ResearchProject selectedProject = DBContext.projects.get(option - 1);

	    try {
	        selectedProject.addParticipant(researcher);
	        DBContext.saveProjects(); 
	        System.out.println("You have successfully joined the project: " + selectedProject.getTopic());
	    } catch (Exception e) {
	        System.out.println("Failed to join the project: " + e.getMessage());
	    }

	    menu();
	}


	
	public static void addPaper() {
	    if (researcher.researchProject == null) {
	        researcher.researchProject = new Vector<>();
	    }

	    if (researcher.researchProject.isEmpty()) {
	        System.out.println("You are not participating in any projects.");
	        menu();
	        return;
	    }

	    int num = 1;
	    System.out.println("Select a project to add a paper:");
	    for (ResearchProject project : researcher.researchProject) {
	        System.out.println(num + ". " + project.getTopic());
	        num++;
	    }
	    System.out.println("0. Quit");

	    int option = input.nextInt();
	    input.nextLine(); 

	    if (option == 0) {
	        menu();
	        return;
	    }

	    if (option < 1 || option > researcher.researchProject.size()) {
	        System.out.println("Invalid option. Please try again.");
	        addPaper(); 
	        return;
	    }

	    ResearchProject selectedProject = researcher.researchProject.get(option - 1);

	    System.out.println("Enter the title of the paper:");
	    String title = input.nextLine();

	    System.out.println("Enter the authors (comma-separated):");
	    String[] authors = input.nextLine().split(",");

	    System.out.println("Enter the journal name:");
	    String journal = input.nextLine();

	    System.out.println("Enter the number of pages:");
	    int pages = input.nextInt();
	    input.nextLine(); 

	    System.out.println("Enter the number of citations:");
	    int citations = input.nextInt();
	    input.nextLine(); 

	    System.out.println("Enter the DOI:");
	    String doi = input.nextLine();

	    System.out.println("Enter the publication date (yyyy-mm-dd):");
	    String dateInput = input.nextLine();
	    Date publicationDate;
	    try {
	        publicationDate = new SimpleDateFormat("yyyy-MM-dd").parse(dateInput);
	    } catch (Exception e) {
	        System.out.println("Invalid date format. Please try again.");
	        addPaper();
	        return;
	    }

	    ResearchPaper newPaper = new ResearchPaper(title, authors, journal, pages, citations, publicationDate, doi);

	    selectedProject.addPaper(newPaper);
	    System.out.println("Paper added successfully to the project: " + selectedProject.getTopic());

	    DBContext.saveProjects();

	    menu();
	}

	public static void viewPapers() {
	    if (researcher.researchProject == null || researcher.researchProject.isEmpty()) {
	        System.out.println("You are not participating in any projects.");
	        menu();
	        return;
	    }

	    System.out.println("Your research papers:");

	    boolean hasPapers = false;

	    for (ResearchProject project : researcher.researchProject) {
	        System.out.println("Project: " + project.getTopic());

	        if (project.getPublishedPapers().isEmpty()) {
	            System.out.println("  No papers in this project.");
	        } else {
	            for (ResearchPaper paper : project.getPublishedPapers()) {
	                System.out.println("  - " + paper);
	            }
	            hasPapers = true;
	        }
	    }

	    if (!hasPapers) {
	        System.out.println("No papers available in any of your projects.");
	    }

	    menu();
	}

	

	
}
