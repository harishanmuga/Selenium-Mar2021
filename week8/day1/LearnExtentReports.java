package week8.day1;

import java.io.IOException;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class LearnExtentReports {
	
	public static void main(String[] args) throws IOException {
		
		// set path for report file
		ExtentHtmlReporter reporter = new ExtentHtmlReporter("./reports/result.html");
		
		// To get history of reports
		reporter.setAppendExisting(true);
		
		// class to capture actual data for the report
		ExtentReports extent = new ExtentReports();
		
		// integrate physical report with actual data
		extent.attachReporter(reporter);
		
		// test case info
		ExtentTest test = extent.createTest("Login", "Login with valida data");
		
		// addition info on test case
		test.assignCategory("Functional");
		test.assignAuthor("Hari");
		
		// define the status of each test step and adding code for snap
		test.pass("enter username",MediaEntityBuilder.createScreenCaptureFromPath(".././snaps/snap1.png").build());
		test.pass("enter password");
		test.pass("click login button");
		
		// mandatory step
		extent.flush();
	}

}
