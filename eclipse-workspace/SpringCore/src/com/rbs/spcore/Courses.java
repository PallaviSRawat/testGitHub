package com.rbs.spcore;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Courses {
	private int courseID;
	private String courseName;
//	private List<String> years;
	private List<Branch> years;
	private Map<Branch, Fees> mMap;
	
	public Courses() {
		super();
		System.out.println("Welcome to university");
	}

//	public Courses(int courseID, String courseName, List<String> years) {
//		super();
//		this.courseID = courseID;
//		this.courseName = courseName;
//		this.years = years;
//	}
	
//	public Courses(int courseID, String courseName, List<Branch> years) {
//		super();
//		this.courseID = courseID;
//		this.courseName = courseName;
//		this.years = years;
//	}
	public Courses(int courseID, String courseName, List<Branch> years, Map<Branch, Fees> mMap) {
		super();
		this.courseID = courseID;
		this.courseName = courseName;
		this.years = years;
		this.mMap = mMap;
	}
	
	public void showCourses() {
		System.out.println(courseID +" "+courseName);
		System.out.println("Nos of years are: ");
		Iterator<Branch> mIterator =years.iterator();
		while(mIterator.hasNext()) {
			System.out.println(mIterator.next());
		}
	}
	
	public void showCoursesAndFees() {
		System.out.println(courseID +" "+courseName);
		System.out.println("Details of Courses: ");
		Set<Entry<Branch, Fees>> mSet=mMap.entrySet();
		Iterator<Entry<Branch,Fees>> mIterator =mSet.iterator();
		while(mIterator.hasNext()) {
			Entry<Branch, Fees> mEntry =mIterator.next();
			Branch mBranch=mEntry.getKey();
			Fees mFees=mEntry.getValue();
			System.out.println("Branch : "+mBranch + " , Fees : "+mFees);
		}
	}
}
