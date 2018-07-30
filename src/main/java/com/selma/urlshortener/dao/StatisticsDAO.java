package com.selma.urlshortener.dao;

import com.selma.urlshortener.entity.Statistics;

public interface StatisticsDAO {
	
	public void saveStatistics(Statistics theStatistics);

	public Statistics getStatistics(long theId);
	

}
