package OOPproject;

import java.util.Set;
import java.util.Vector;

import java.io.Serializable;
import java.util.HashSet;

public class ResearchProject implements Serializable {
    
	private String topic;
    private HashSet<ResearchPaper> publishedPapers; 
    private HashSet<ResearcherDecorator> participants;      
    private ResearcherDecorator superviser;
    
    public ResearchProject(String topic, ResearcherDecorator superviser) {
        this.topic = topic;
        this.superviser = superviser;
        this.publishedPapers = new HashSet<>();
        this.participants = new HashSet<>();
    }
    
    public void addParticipant(ResearcherDecorator researcher) throws Exception {
        if (researcher == null) {
            throw new Exception("Only researchers can join the project!");
        }
        if (!participants.contains(researcher)) {
            participants.add(researcher);

            if (researcher.researchProject == null) {
                researcher.researchProject = new Vector<>();
            }
            if (!researcher.researchProject.contains(this)) {
                researcher.researchProject.add(this);
            }

            System.out.println(researcher.getUser().getUserName() + " joined the project: " + topic);
        } else {
            System.out.println(researcher.getUser().getUserName() + " is already part of the project: " + topic);
        }
    }



    public String getTopic() {
        return topic;
    }

    public HashSet<ResearchPaper> getPublishedPapers() {
        return publishedPapers;
    }

    public HashSet<ResearcherDecorator> getParticipants() {
        return participants;
    }

    
    public void addPaper(ResearchPaper paper) {
        publishedPapers.add(paper);
    }

    

    @Override
    public String toString() {
        return String.format("Topic: %s, Participants: %d, Papers: %d", 
                             topic, participants.size(), publishedPapers.size());
    }

    
    
    
    
    
}
