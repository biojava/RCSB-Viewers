package org.rcsb.ks.model;

import java.util.ArrayList;
import java.util.HashMap;

public class JournalIndex {

	
	public enum Source
	{
		PEER_REVIEWED,
		POPULAR_SCIENCE_NONPEER_REVIEWED,
		NEWS_ARTICLE
	}
	
	/**
	 *  What type of journal is this?
	 */
	private Source source = null;
	private String journalName = "";
	private String paper_title = "Unknown";
	
	// {{ list of available pages }}

	private ArrayList<String> authors = new ArrayList<String> ();
	private HashMap pageRanges = new HashMap ();
	private String abbreviation = "";
	private String volume = "";
	private String pubMedId = "";
	private int year = 1990;
	
	public JournalIndex() {
	}
	public void setTitle(String _trim) {
		paper_title = _trim;
	}
	public void setJournalAbbreviation(String _trim) {
		abbreviation = _trim;
		
	}
	public void setJournalVolume(String _volume) {
		volume  = _volume;
	}
	public void setFirstPage(int _firstPage) {
		Object o = pageRanges.get( PageIndex.GLOBAL );
		if ( o == null ){		
		PageIndex pageIndex = new PageIndex ( _firstPage );		
		pageRanges.put( PageIndex.GLOBAL, pageIndex );		
		}else 
		{
			PageIndex pageIndex = (PageIndex)o;
			pageIndex.setStartPage( _firstPage );
			pageRanges.put( PageIndex.GLOBAL, pageIndex );		
		}
	}
	public void setPubMed ( String _pubMedId )
	{
		pubMedId  = _pubMedId;
	}
	public void setLastPage(int _lastPage) {
		Object o = pageRanges.get( PageIndex.GLOBAL );
		if ( o == null ){		
		PageIndex pageIndex = new PageIndex ( _lastPage );		
		pageRanges.put( PageIndex.GLOBAL, pageIndex );		
		}else 
		{
			PageIndex pageIndex = (PageIndex)o;
			pageIndex.setStartPage( _lastPage );
			pageRanges.put( PageIndex.GLOBAL, pageIndex );		
		}		
	}
	public void setYear(int _year) {
		year  = _year;
	}
	public void setAuthors(ArrayList _authors) {
		authors = _authors;
	}
	public String getTitle() {
		return paper_title;
	}
	public int getYear() {
		return year;
	}
	public String getJournalInfo() {
		return "" + abbreviation + ", vol: " + volume;
	}
}
