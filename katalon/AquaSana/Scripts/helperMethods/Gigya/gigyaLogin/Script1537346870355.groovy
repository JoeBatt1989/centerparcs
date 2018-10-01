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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Cookie
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.chrome.ChromeDriver

import com.kms.katalon.core.webui.driver.DriverFactory

//WebUI.openBrowser('')
System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\Selenium\\Chrome\\chromedriver.exe")
String chromeProfile = "C:\\Users\\BattJ\\AppData\\Local\\Google\\Chrome\\User Data\\Default"
ChromeOptions options = new ChromeOptions()
options.addArguments("user-data-dir=" + chromeProfile)
options.addArguments("--start-maximized")
WebDriver driver = new ChromeDriver(options)
DriverFactory.changeWebDriver(driver)
driver.manage().window().maximize()
WebUI.navigateToUrl("https://console.gigya.com/")
//driver.get("https://console.gigya.com/")

WebUI.waitForElementVisible(findTestObject('Gigya/LoginPage/userName'), 0)

WebUI.sendKeys(findTestObject('Gigya/LoginPage/userName'), 'joe.batt@centerparcs.co.ukj')

WebUI.sendKeys(findTestObject('Gigya/LoginPage/password'), 'Inter5933')

WebUI.click(findTestObject('Gigya/LoginPage/submitBtn'))

WebUI.waitForElementVisible(findTestObject('Gigya/GigyaDashboard/siteDropDown'), 0)

