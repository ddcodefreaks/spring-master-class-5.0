package com.example.ioc.di.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.ioc.di.service.SortAlgorithm;

@Component
public class BinarySearchAlgorithm {
	
	@Autowired
	private SortAlgorithm  sortAlgorithm;
	
	
	//via setter injection
	/*public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
		this.sortAlgorithm = sortAlgorithm;
	}*/

	//via constructor injection
	public BinarySearchAlgorithm(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}
	
	public int binarySearch(int[] num, int number) {
		
		int[] returnNum= sortAlgorithm.sort(num);
		
		return number;
	}
	
	

}
