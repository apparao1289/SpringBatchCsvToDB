package com.test.batch.process;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.item.ItemProcessor;

import com.test.batch.model.Employee;

public class EmployeeItemProcessor implements ItemProcessor<Employee, Employee> {

	private static final Logger log = LoggerFactory.getLogger(EmployeeItemProcessor.class);

	@Override
	public Employee process(final Employee employee) throws Exception {

		final String firstName = employee.getFirstName().toUpperCase();
		final String lastName = employee.getLastName().toUpperCase();

		final Employee employeeTransForm = new Employee(firstName, lastName, employee.getEmail(), employee.getAge());

		log.info("Converting (" + employee + ") into (" + employeeTransForm + ")");

		return employeeTransForm;
	}

}