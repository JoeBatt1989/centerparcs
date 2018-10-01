import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement

WebUI.waitForElementVisible(findTestObject('AquaSana/AquaSana - Booking Search/Spa Days/spaDayTab'), 0)

WebUI.click(findTestObject('AquaSana/AquaSana - Booking Search/Spa Days/spaDayTab'))

WebUI.waitForElementVisible(findTestObject('AquaSana/AquaSana - Booking Search/Spa Days/spaDaysMagnet'), 0)

if (GlobalVariable.spaVillageRequired == true) {
	if (GlobalVariable.spaVillageValue == 'WF') {
		WebUI.selectOptionByValue(findTestObject('AquaSana/AquaSana - Booking Search/Spa Days/spaDropDown'), 'WF', false)
	}
    else if (GlobalVariable.spaVillageValue == 'SF') {
        WebUI.selectOptionByValue(findTestObject('AquaSana/AquaSana - Booking Search/Spa Days/spaDropDown'), 'SF', false)
    }
	else if (GlobalVariable.spaVillageValue == 'EF') {
		WebUI.selectOptionByValue(findTestObject('AquaSana/AquaSana - Booking Search/Spa Days/spaDropDown'), 'EF', false)
	}
	else if (GlobalVariable.spaVillageValue == 'WO') {
		WebUI.selectOptionByValue(findTestObject('AquaSana/AquaSana - Booking Search/Spa Days/spaDropDown'), 'WO', false)
	}
	else if (GlobalVariable.spaVillageValue == 'LF') {
		WebUI.selectOptionByValue(findTestObject('AquaSana/AquaSana - Booking Search/Spa Days/spaDropDown'), 'LF', false)
	} else {
		WebUI.selectOptionByValue(findTestObject('AquaSana/AquaSana - Booking Search/Spa Days/spaDropDown'), 'SF', false)
	}
}

if (GlobalVariable.spaDateRequired == true) {
	if(GlobalVariable.spaDateValue == "Today"){
		
		WebUI.click(findTestObject('AquaSana/AquaSana - Booking Search/Spa Days/whenDatePicker'))
		WebDriver driver = DriverFactory.getWebDriver()
		todaysDate = driver.findElement(By.xpath('//*[@class = \'is-today\']'))
		todaysDate.click()
		
	} else if (GlobalVariable.spaDateValue == "3 Months"){
	
		WebUI.click(findTestObject('AquaSana/AquaSana - Homepage/Search/Spa Days/whenDatePicker'))
		WebDriver driver = DriverFactory.getWebDriver()
		for(int i=0; i<3; i++){
			nextMonth = driver.findElement(By.xpath('//*[@class = \'pika-next\']'))
			nextMonth.click()
		}
		driver.findElement(By.xpath('//*[@data-day = \'15\']')).click()
	
	} else if (GlobalVariable.spaDateValue == "6 Months"){
	
		WebUI.click(findTestObject('AquaSana/AquaSana - Homepage/Search/Spa Days/whenDatePicker'))
		WebDriver driver = DriverFactory.getWebDriver()
		for(int i=0; i<6; i++){
			nextMonth = driver.findElement(By.xpath('//*[@class = \'pika-next\']'))
			nextMonth.click()
		}
		driver.findElement(By.xpath('//*[@data-day = \'15\']')).click()
		
	} else {
	
		WebUI.click(findTestObject('AquaSana/AquaSana - Booking Search/Spa Days/whenDatePicker'))
		WebDriver driver = DriverFactory.getWebDriver()
		todaysDate = driver.findElement(By.xpath('//*[@class = \'is-today\']'))
		todaysDate.click()
	}
}

if (GlobalVariable.spaFlexibleDaysRequired == true) {
	if(GlobalVariable.spaFlexibleDays == "1"){
		WebUI.selectOptionByValue(findTestObject('AquaSana/AquaSana - Booking Search/Spa Days/flexibleDropDown'), '1', false)
	}
	if(GlobalVariable.spaFlexibleDays == "2"){
		WebUI.selectOptionByValue(findTestObject('AquaSana/AquaSana - Booking Search/Spa Days/flexibleDropDown'), '2', false)
	}
}

WebUI.click(findTestObject('AquaSana/AquaSana - Booking Search/Spa Days/searchBtn'))

WebUI.waitForElementVisible(findTestObject('AquaSana/AquaSana - Search Results/searchFilter'), 0)

