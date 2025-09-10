package mapsdemo;

import java.util.Comparator;

/**
 * Author :Jetty.Srikar
 * Date :Sep 9, 2025
 * Time :4:34:01 PM
 *project : projCoreJava
 */

public class Developer {
	int id;
	String name,domain;
	public Developer(int id, String name, String domain) {
		this.id = id;
		this.name = name;
		this.domain = domain;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDomain() {
		return domain;
	}
	
}


class IdComparator implements Comparator<Developer>{
	@Override
	public int compare(Developer o1,Developer o2) {
	Developer d1=(Developer) o1;
	Developer d2=(Developer) o2;
	
	
	if(d1.id==d2.id) {
		return 0;
	}
	else if(d1.id>d2.id) {
		return 1;
	}
	else {
		return -1;
	}
}}


class DomainComparator implements Comparator<Developer>{

	@Override
	public int compare(Developer o1, Developer o2) {
		Developer d1=(Developer) o1;
		Developer d2=(Developer) o2;
		
		return d1.domain.compareTo(d2.domain);// compare Strings
		
	}
	
}
