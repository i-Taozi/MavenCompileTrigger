package org.hibernate.search.jpa.example.model;

import java.util.List;

/**
 * ��ѯ�������װ
 * @author Administrator
 *
 * @param <T>
 */
public class QueryResult<T> {
	
	private int searchresultsize;
	
	List<T> searchresult;

	public int getSearchresultsize() {
		return searchresultsize;
	}

	public void setSearchresultsize(int searchresultsize) {
		this.searchresultsize = searchresultsize;
	}

	public List<T> getSearchresult() {
		return searchresult;
	}

	public void setSearchresult(List<T> searchresult) {
		this.searchresult = searchresult;
	}

	
}
