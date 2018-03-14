package com.test.batch.controller;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BatchInvokeController {

	@Autowired
	JobLauncher jobLauncher;

	@Autowired
	Job processJob;

	@RequestMapping(value = "/invokeBatchJob", method = RequestMethod.GET)
	public String invokeJob() throws Exception {

		JobParameters jobParameters = new JobParametersBuilder().toJobParameters();
		jobLauncher.run(processJob, jobParameters);

		return "CSV to DB conversion Batch job has been invoked";
	}
}
