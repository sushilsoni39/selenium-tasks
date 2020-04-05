package listeners;

import org.testng.*;
import org.testng.xml.XmlSuite;

import java.util.List;

public class ListenerForTest implements ISuiteListener, ITestListener ,IReporter {
    @Override
    public void onStart(ISuite iSuite) {
        Reporter.log("startSuite");

    }

    @Override
    public void onFinish(ISuite iSuite) {
        Reporter.log("finishSuite");

    }

    @Override
    public void onTestStart(ITestResult iTestResult) {

    }

    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        System.out.println("Test Passed");

    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        System.out.println("test failed");

    }

    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    @Override
    public void onStart(ITestContext iTestContext) {

    }

    @Override
    public void onFinish(ITestContext iTestContext) {

    }

    @Override
    public void generateReport(List<XmlSuite> list, List<ISuite> list1, String s) {

    }
}
