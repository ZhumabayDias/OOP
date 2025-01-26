package OOPproject;

import java.io.Serializable;
import java.util.Date;
import java.util.Vector;

import model.Journal;

public class ResearchPaper implements Comparable, Serializable {
    
	private String title;
    private String[] authors;
    private String journal;
    private int pages;
    private int citations;
    private Date publicationDate;
    private String doi;

    public ResearchPaper(String title, String[] authors, String journal, int pages, int citations, Date publicationDate, String doi) {
        this.title = title;
        this.authors = authors;
        this.journal = journal;
        this.pages = pages;
        this.citations = citations;
        this.publicationDate = publicationDate;
        this.doi = doi;
    }

    public String getTitle() {
        return title;
    }

    public String[] getAuthors() {
        return authors;
    }

    public String getJournal() {
        return journal;
    }

    public int getPages() {
        return pages;
    }

    public int getJustCitations() {
        return citations;
    }

    public Date getPublicationDate() {
        return publicationDate;
    }

    public String getDoi() {
        return doi;
    }


	public String getCitation(String format) {
        if (format.equalsIgnoreCase("Plain Text")) {
            return String.format("%s. %s. %s. %d pages. DOI: %s.", 
                                 String.join(", ", authors), title, journal, pages, doi);
        } else if (format.equalsIgnoreCase("BibTeX")) {
            return String.format("@article{%s,\n  title={%s},\n  author={%s},\n  journal={%s},\n  pages={%d},\n  year={%tY},\n  doi={%s}\n}", 
                                 doi, title, String.join(" and ", authors), journal, pages, publicationDate, doi);
        } else {
            return "Unknown format";
        }
    }

    @Override
    public String toString() {
        return String.format("Title: %s, Authors: %s, Journal: %s, Citations: %d", 
                             title, String.join(", ", authors), journal, citations);
    }

    @Override
	public int compareTo(Object o) {
		if(o == null)return -1;
		if(!(o instanceof ResearchPaper))return -1;
		ResearchPaper e = (ResearchPaper) o;
		if(this.getJustCitations() < e.getJustCitations()) {
			return -1;
		}else if(this.getJustCitations() > e.getJustCitations()) {
			return 1;
		}
		return 0;
	}
    
   
    
}
