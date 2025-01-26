package Interfaces;

import model.News;

public interface Observer {
	void update(News latestNews);
}
