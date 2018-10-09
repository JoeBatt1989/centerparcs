import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.text.SimpleDateFormat as SimpleDateFormat
import java.time.DayOfWeek as DayOfWeek
import java.time.LocalDate as LocalDate
import java.time.temporal.TemporalAdjusters as TemporalAdjusters
import com.google.common.base.CharMatcher as CharMatcher
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
import com.thoughtworks.selenium.webdriven.commands.ClickAt as ClickAt
import internal.GlobalVariable as GlobalVariable
import org.junit.After as After
import org.openqa.selenium.By as By
import org.openqa.selenium.By.ByCssSelector as ByCssSelector
import org.openqa.selenium.By.ById as ById
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.StaleElementReferenceException as StaleElementReferenceException
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Actions as Actions
import org.openqa.selenium.support.ui.ExpectedConditions as ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait as WebDriverWait
import org.apache.commons.lang.StringUtils as StringUtils

WebUI.click(findTestObject('CenterParcs/Centerparcs - homepage/Search/villageDropDown'))

if(GlobalVariable.village == 'WF'){
	WebUI.click(findTestObject('CenterParcs/Centerparcs - homepage/Search/Village/whinfellForest'))
} else if(GlobalVariable.village == 'SF'){
	WebUI.click(findTestObject('CenterParcs/Centerparcs - homepage/Search/Village/sherwoodForest'))
}else if(GlobalVariable.village == 'EF'){
	WebUI.click(findTestObject('CenterParcs/Centerparcs - homepage/Search/Village/elvedenForest'))
}else if(GlobalVariable.village == 'WO'){
	WebUI.click(findTestObject('CenterParcs/Centerparcs - homepage/Search/Village/woburnForest'))
}else if(GlobalVariable.village == 'LF'){
	WebUI.click(findTestObject('CenterParcs/Centerparcs - homepage/Search/Village/longleatForest'))
}else if(GlobalVariable.village == 'IR'){
	WebUI.click(findTestObject('CenterParcs/Centerparcs - homepage/Search/Village/longfordForest'))
}else{
	WebUI.click(findTestObject('CenterParcs/Centerparcs - homepage/Search/Village/whinfellForest'))
}

WebDriver driver = DriverFactory.getWebDriver()

WebDriverWait wait = new WebDriverWait(driver, 4)

// Need to create some more modules (date goes over 2 months, dates are => next month)
WebUI.callTestCase(findTestCase('helperMethods/CenterParcs/CenterParcs_DatePicker_SameMonth'), [:], FailureHandling.STOP_ON_FAILURE)

if (GlobalVariable.dogs > 0) {
	
    WebUI.doubleClick(findTestObject('CenterParcs/Centerparcs - homepage/Search/guestsDropDown'))

    WebUI.waitForElementVisible(findTestObject('CenterParcs/Centerparcs - homepage/Search/dogsPlus'), 0)

    WebUI.click(findTestObject('CenterParcs/Centerparcs - homepage/Search/dogsPlus'))
}

driver.findElements(By.xpath('//*[contains(text(),\'Search\')]')).get(0).click()

