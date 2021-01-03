package com.example.ioc.di.serviceImpl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

import com.example.ioc.di.service.SortAlgorithm;

@Component
@Primary
public class BubbleSortAlgorithm implements SortAlgorithm {

	@Override
	public int[] sort(int[] num) {
		System.out.println("::called BubbleSortAlgorithm class::");
		return num;
	}

}
