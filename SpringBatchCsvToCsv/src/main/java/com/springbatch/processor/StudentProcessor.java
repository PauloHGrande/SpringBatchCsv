package com.springbatch.processor;

import org.springframework.batch.item.ItemProcessor;

import com.springbatch.model.Student;

public class StudentProcessor implements ItemProcessor<Student, Student>{

	@Override
	public Student process(Student item) throws Exception {
		final String firstName = item.getFirstName().toUpperCase();
		final String lastName = item.getLastName().toUpperCase();
		final Student student = new Student(item.getId(), firstName, lastName, item.getEmail());
		return student;
	}

}
