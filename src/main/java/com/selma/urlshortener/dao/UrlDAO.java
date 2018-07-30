package com.selma.urlshortener.dao;

import com.selma.urlshortener.entity.Url;

public interface UrlDAO {
	
	public void saveUrl(Url theUrl);

	public Url getUrl(long theId);
	
	public long isValidShortUrl(String shortUrlKey);
	
	public long isLongUrlInDB(String theLongUrl);

}
