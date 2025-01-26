package OOPproject;

import java.util.Set;
import java.util.Vector;

import Interfaces.Subscribers;
import Users.User;

import java.io.Serializable;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;

public class ResearcherDecorator implements Subscribers, Serializable {
    
    private Vector<ResearchPaper> papers;
    private Integer hIndex;
    public Vector<ResearchProject> researchProject;
    private Vector<ResearchPaper> researchPaper;
    private User user;
    
    public ResearcherDecorator(User user) {
    	this.user = user;
    }
    
    public int calculateHIndex() {
        if (researchPaper == null || researchPaper.isEmpty()) {
            System.out.println("No research papers available to calculate H-Index.");
            this.hIndex = 0;
            return 0;
        }

        Vector<Integer> citations = new Vector<>();
        for (ResearchPaper paper : researchPaper) {
            citations.add(paper.getJustCitations());
        }

        Collections.sort(citations, Collections.reverseOrder());

        int hIndex = 0;
        for (int i = 0; i < citations.size(); i++) {
            if (citations.get(i) >= i + 1) {
                hIndex = i + 1;
            } else {
                break;
            }
        }
        this.hIndex = hIndex;
        return hIndex;
    }
    
    public void printPaperByDate() {
        if (researchPaper == null || researchPaper.isEmpty()) {
            System.out.println("No research papers available to sort by date.");
            return;
        }

        Vector<ResearchPaper> sortedPapers = new Vector<>(researchPaper);

        Collections.sort(sortedPapers, new PaperComparatorByDate());

        System.out.println("Research Papers sorted by Date:");
        for (ResearchPaper paper : sortedPapers) {
            System.out.println(paper);
        }
    }

    
    public void printPaperByCitations() {
        if (researchPaper == null || researchPaper.isEmpty()) {
            System.out.println("No research papers available to sort by citations.");
            return;
        }

        Vector<ResearchPaper> sortedPapers = new Vector<>(researchPaper);

        Collections.sort(sortedPapers, new PaperComparatorByCitations());

        System.out.println("Research Papers sorted by Citations:");
        for (ResearchPaper paper : sortedPapers) {
            System.out.println(paper);
        }
    }

    
    public void getCitation(String format) {
        if (researchPaper == null || researchPaper.isEmpty()) {
            System.out.println("No research papers available for citation.");
            return;
        }

        System.out.println("Research Paper Citations in format: " + format);
        for (ResearchPaper paper : researchPaper) {
            System.out.println(paper.getCitation(format));
        }
    }
    
    public void viewJoinedProjects() {
        if (researchProject == null || researchProject.isEmpty()) {
            System.out.println("You have not joined any projects.");
            return;
        }

        System.out.println("Projects you have joined:");
        int num = 1;
        for (ResearchProject project : researchProject) {
            System.out.println(num + ". " + project.getTopic());
            num++;
        }
    }


    
	public Vector<ResearchPaper> getPapers() {
		return papers;
	}
	public void setPapers(Vector<ResearchPaper> papers) {
		this.papers = papers;
	}
	public Integer gethIndex() {
		return hIndex;
	}
	public void sethIndex(Integer hIndex) {
		this.hIndex = hIndex;
	}
	public Vector<ResearchProject> getResearchProject() {
		return researchProject;
	}
	public void setResearchProject(Vector<ResearchProject> researchProject) {
		this.researchProject = researchProject;
	}
	public Vector<ResearchPaper> getResearchPaper() {
		return researchPaper;
	}
	public void setResearchPaper(Vector<ResearchPaper> researchPaper) {
		this.researchPaper = researchPaper;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "ResearcherDecorator [papers=" + papers + ", hIndex=" + hIndex + ", researchProject=" + researchProject
				+ ", researchPaper=" + researchPaper + ", user=" + user.getUserName() + "]";
	}
    
    
    
}
