package com.base.commonUtils;

import com.base.dataUtils.DataHelperProvider;
import com.base.dataUtils.IDataProvider;
import com.base.driverUtils.DriverProvider;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class BaseSetUp {

	public WebDriver driver;
	DriverProvider browserProvider = new DriverProvider();
	DataHelperProvider datahelperProvider = new DataHelperProvider();
	IDataProvider dataProvider = datahelperProvider.getDataHelperProvider("properties");
	IDataProvider dataProviderExcel = datahelperProvider.getDataHelperProvider("excel");
	public final String configProperties = System.getProperty("user.dir")+"/TestConfigsData/config.properties";
	public String url = dataProvider.fetchData(configProperties, "url");
	String modeOfExecution = dataProvider.fetchData(configProperties, "modeOfExecution");
	String browserName = dataProvider.fetchData(configProperties, "browser");
	String pathToJasonDataStore = System.getProperty("user.dir")+"/ProductJsonData/";
	String pathToExcelData = System.getProperty("user.dir")+"/TestConfigsData/TestData.xlsx";

	public WebDriver getDriver() {
		return driver;
	}

	protected void setDriver() {
		System.setProperty("webdriver.chrome.driver",
				"/Users/Surbhi/Documents/DummyAutomation/DriverExe/mac_chrome");
		driver = new ChromeDriver();
		//driver = browserProvider.getDriver(modeOfExecution).init(browserName);
	}

	@DataProvider(name = "SearchFunctionality")
	public Object[][] getCityDetails() {
		Object[][] arrayObject = dataProviderExcel.fetchDataSet(pathToExcelData, "DataFeed");
		return arrayObject;
	}
}
