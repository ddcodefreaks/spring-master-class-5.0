package com.example.ioc.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.example.ioc.di.serviceImpl.BinarySearchAlgorithm;
import com.example.ioc.di.serviceImpl.BubbleSortAlgorithm;
import com.example.ioc.di.serviceImpl.QuickSortAlgorithm;

//@ComponentScan("com.example.ioc.di.serviceImpl") 
@SpringBootApplication
public class IocForSpringApplication {

	public static void main(String[] args) {
		
		
		//What are  beans > @component
		//What are the dependencies of Bean > @Autowired
		//where to search bean > if same package no need else @ComponentScan
		
		//normal way to create the objects and calling the dependency objects 
		/*System.out.println("-------------SPRING BOOT 5.0 PRACTISE CODE STARTED!-------------");
		BinarySearchAlgorithm binarySearchAlgorithmWithBubble = new BinarySearchAlgorithm(new BubbleSortAlgorithm());
		int result = binarySearchAlgorithmWithBubble.binarySearch(new int[]{10,11,12},11);
		System.out.println("Output from bubble sort::"+result);
		BinarySearchAlgorithm binarySearchAlgorithmWithQuick = new BinarySearchAlgorithm(new QuickSortAlgorithm());
		int result1= binarySearchAlgorithmWithQuick.binarySearch(new int[] {12,13,14},14);
		System.out.println("Output from quick sort:::"+result1);*/
		// ends  here 
		//enable this and use application context reference to  get the  bean and for the dependency
		// the run method returns the application context of 
		ApplicationContext applicationContext=SpringApplication.run(IocForSpringApplication.class, args); // comment it if you don't want to start spring context.
		BinarySearchAlgorithm binarySearchAlgorithm =applicationContext.getBean(BinarySearchAlgorithm.class);
		int result3 =binarySearchAlgorithm.binarySearch(new int[]{10,11,12},11);
		System.out.println(result3);
		
		
	}

}
