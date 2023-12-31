package qsp;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Ext1 {
	@Test
	public void test1()
	{
		//step1
		ExtentReports rep=new ExtentReports("./rep/r1.html");
		//step2
		ExtentTest test = rep.startTest("tc1");
		//step3
		test.log(LogStatus.PASS,"pass");
		test.log(LogStatus.FAIL,"fail");
		test.log(LogStatus.SKIP,"skip");
		//step4
		rep.endTest(test);
		//step5
		rep.flush();
	}

}
