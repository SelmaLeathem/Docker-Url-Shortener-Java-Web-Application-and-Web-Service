package com.selma.urlshortener.service;

import com.selma.urlshortener.entity.Statistics;

public interface StatisticsService {

	public void saveStatistics(Statistics theStatistics);

	public Statistics getStatistics(long theId);
	
}
