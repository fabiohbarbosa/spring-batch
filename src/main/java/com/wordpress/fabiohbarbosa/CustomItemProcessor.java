package com.wordpress.fabiohbarbosa;

import org.springframework.batch.item.ItemProcessor;

import com.wordpress.fabiohbarbosa.model.Report;

public class CustomItemProcessor implements ItemProcessor<Report, Report> {
	 
	@Override
	public Report process(Report item) throws Exception {
		System.out.println("Processing..." + item);
		return item;
	}
 
}