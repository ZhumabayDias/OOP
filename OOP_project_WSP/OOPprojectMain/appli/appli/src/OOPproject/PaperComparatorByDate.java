package OOPproject;

import java.util.Comparator;

public class PaperComparatorByDate implements Comparator<ResearchPaper> {
	@Override
	public int compare(ResearchPaper first, ResearchPaper second) {
		return first.getPublicationDate().compareTo(second.getPublicationDate());
	}
}
