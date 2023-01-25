package prac1;

import org.junit.platform.launcher.listeners.TestExecutionSummary.Failure;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
//import org.junit.runner.notification.Failure;

public class RunnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Result res =  JUnitCore.runClasses(TestSuiteForOneTwo.class);
		for(org.junit.runner.notification.Failure fail: res.getFailures())
		{
			System.out.println(fail.toString());
		}
		System.out.println(res.wasSuccessful());
	}

}
