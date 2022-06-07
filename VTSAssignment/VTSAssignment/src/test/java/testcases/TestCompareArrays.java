package testcases;

import java.util.List;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import assignment.CompareArrays;

public class TestCompareArrays {

	
	@Test(dataProvider = "data")
	public void testVerfiyArrays(String[] a, String[] b) {
	
		CompareArrays cmp = new CompareArrays();
		List<String> list = cmp.verfiyArrays(a,b);
		Reporter.log("Difference of two arrays : "+list.toString(),true);
		Assert.assertFalse(list.contains("USA"));
	}
	
	@DataProvider(name="data")
	public Object[][] testData(){
		
		Object[][] data = new Object[1][2];	
		data[0][0] = new String[]{"USA","Mexico","Canada","Brazil"};
		data[0][1] = new String[]{"USA","Mexico"};
		return data;
		
	}
}