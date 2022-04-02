package org.hibernate.search.hibernate.example;

import java.util.List;
import java.util.Set;

import net.paoding.analysis.analyzer.PaodingAnalyzer;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.queryParser.MultiFieldQueryParser;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.highlight.Highlighter;
import org.apache.lucene.search.highlight.QueryScorer;
import org.apache.lucene.search.highlight.SimpleHTMLFormatter;
import org.apache.lucene.util.Version;
import org.hibernate.SessionFactory;
import org.hibernate.search.FullTextQuery;
import org.hibernate.search.FullTextSession;
import org.hibernate.search.Search;
import org.hibernate.search.hibernate.example.model.Author;
import org.hibernate.search.hibernate.example.model.Book;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SearchManager {
	
	public static void main(String[] args) throws Exception{
		ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
		SessionFactory sessionFactory = applicationContext.getBean("hibernate4sessionFactory",SessionFactory.class);
		FullTextSession fullTextSession = Search.getFullTextSession(sessionFactory.openSession());
		
		//使用Hibernate Search api查询 从多个字段匹配 name、description、authors.name
//		QueryBuilder qb = fullTextEntityManager.getSearchFactory().buildQueryBuilder().forEntity(Book.class ).get();
//		Query luceneQuery = qb.keyword().onFields("name","description","authors.name").matching("移动互联网").createQuery();
		
		//使用lucene api查询 从多个字段匹配 name、description、authors.name
		//使用庖丁分词器
		MultiFieldQueryParser queryParser=new MultiFieldQueryParser(Version.LUCENE_36, new String[]{"name","description","authors.name"}, new PaodingAnalyzer());
		Query luceneQuery=queryParser.parse("实战");
		
		FullTextQuery fullTextQuery =fullTextSession.createFullTextQuery(luceneQuery, Book.class);
		//设置每页显示多少条
		fullTextQuery.setMaxResults(5);
		//设置当前页
		fullTextQuery.setFirstResult(0);
		
		//高亮设置
		SimpleHTMLFormatter formatter=new SimpleHTMLFormatter("<b><font color='red'>", "<font/></b>");
		QueryScorer queryScorer=new QueryScorer(luceneQuery);
		Highlighter highlighter=new Highlighter(formatter, queryScorer);

		@SuppressWarnings("unchecked")
		List<Book> resultList = fullTextQuery.list();
		System.out.println("共查找到["+resultList.size()+"]条记录");
		for (Book book : resultList) {
			String highlighterString=null;
			Analyzer analyzer=new PaodingAnalyzer();
			try {
				//高亮name
				highlighterString=highlighter.getBestFragment(analyzer, "name", book.getName());
				if(highlighterString!=null){
					book.setName(highlighterString);
				}
				//高亮authors.name
				Set<Author> authors = book.getAuthors();
				for (Author author : authors) {
					highlighterString=highlighter.getBestFragment(analyzer, "authors.name", author.getName());
					if(highlighterString!=null){
						author.setName(highlighterString);
					}
				}
				//高亮description
				highlighterString=highlighter.getBestFragment(analyzer, "description", book.getDescription());
				if(highlighterString!=null){
					book.setDescription(highlighterString);
				}
			} catch (Exception e) {
			}
			
			System.out.println("书名:"+book.getName()+"\n描述:"+book.getDescription()+"\n出版日期:"+book.getPublicationDate());
			System.out.println("----------------------------------------------------------");
		}
		
		fullTextSession.close();
		sessionFactory.close();
		
	}
}