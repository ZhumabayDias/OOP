package OOPproject;

import java.util.Comparator;

public class PaperComparatorByCitations implements Comparator<ResearchPaper>{
	@Override
	public int compare(ResearchPaper first, ResearchPaper second) {
		return first.compareTo(second);
	}
	
}
