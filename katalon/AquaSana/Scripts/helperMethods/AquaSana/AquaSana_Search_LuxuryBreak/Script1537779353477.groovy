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

WebUI.waitForElementVisible(findTestObject('AquaSana/AquaSana - Homepage/Search/Spa Days/spaDayTab'), 0)

WebUI.click(findTestObject('AquaSana/AquaSana - Homepage/Search/Luxury Spa Breaks/luxurySpaTab'))

WebUI.waitForElementVisible(findTestObject('AquaSana/AquaSana - Homepage/Search/Luxury Spa Breaks/luxurySpaMagnet'), 0)

WebUI.selectOptionByValue(findTestObject('AquaSana/AquaSana - Homepage/Search/Luxury Spa Breaks/spaDropDown'), 'EF', false)

WebUI.click(findTestObject('AquaSana/AquaSana - Homepage/Search/Luxury Spa Breaks/whenDatePicker'))

WebDriver driver = DriverFactory.getWebDriver()

todaysDate = driver.findElement(By.xpath('//*[@class = \'is-today\']'))

todaysDate.click()

WebUI.click(findTestObject('AquaSana/AquaSana - Homepage/Search/Luxury Spa Breaks/searchBtn'))

WebUI.waitForElementVisible(findTestObject('AquaSana/AquaSana - Search Results/searchFilter'), 0)

