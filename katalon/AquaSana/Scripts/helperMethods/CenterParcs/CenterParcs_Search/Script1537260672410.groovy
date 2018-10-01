import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.time.DayOfWeek
import java.time.LocalDate
import java.time.temporal.TemporalAdjusters

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
import com.thoughtworks.selenium.webdriven.commands.ClickAt

import internal.GlobalVariable as GlobalVariable

import org.junit.After
import org.openqa.selenium.By as By
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.StaleElementReferenceException
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.support.ui.ExpectedConditions as ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait as WebDriverWait

WebUI.click(findTestObject('CenterParcs/Centerparcs - homepage/Search/villageDropDown2'))

WebUI.click(findTestObject('Recorded objects/Page_UK Breaks  Center Parcs/div_Whinfell Forest'))

WebUI.click(findTestObject('Recorded objects/Page_UK Breaks  Center Parcs/li_Arrival date'))

//WebUI.click(findTestObject('Recorded objects/Page_UK Breaks  Center Parcs/a_Check out'))

WebDriver driver = DriverFactory.getWebDriver()
Actions actions = new Actions(driver)
JavascriptExecutor js = (JavascriptExecutor) driver;
WebDriverWait wait = new WebDriverWait(driver, 4)

LocalDate monday = LocalDate.now()
LocalDate friday = LocalDate.now()

monday = monday.with(TemporalAdjusters.next(DayOfWeek.MONDAY))
monday = friday.with(TemporalAdjusters.next(DayOfWeek.FRIDAY))

//arrivalDateDay = driver.findElement(By.cssSelector('div:nth-child(3) table tbody tr:nth-child(2) td:nth-child(1) button')).getText()
//arrivalDatePicker = driver.findElement(By.cssSelector('div:nth-child(3) table tbody tr:nth-child(3) td:nth-child(1)'))
sleep(1000)


arrivalDate = driver.findElements(By.cssSelector('table tbody tr:nth-child(3) td:nth-child(1)'))

wait.until(ExpectedConditions.elementToBeClickable(arrivalDate[1]))

actions.moveToElement(arrivalDate[1]).click().perform()

sleep(2000)

departureDate = driver.findElements(By.cssSelector(".end-date div:nth-child(2) table tbody tr:nth-child(3) td:nth-child(5)"))


wait.until(ExpectedConditions.elementToBeClickable(departureDate[0]))

//departureDate[0].click()
//"document.getElement(By.cssSelector('.end-date div:nth-child(2) table tbody tr:nth-child(3) td:nth-child(5)')"
try {
	//actions.moveToElement(departureDate[0]).click(departureDate[0]).perform()
//	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("arguments[0].click();", departureDate[0]);
		
} catch (StaleElementReferenceException e) {
	// ignore
}

departureDatePicker = driver.findElement(By.cssSelector("#datePickerDeparture"))

departureDatePicker.click()



//println(departureDate.size())
//try {
//	actions.moveToElement(departureDate[0]).click(departureDate[0]).perform()
//} catch (StaleElementReferenceException ignore) {
//	// ignore
//}

//
//actions.moveToElement(departureDate[0]).click(departureDate[0]).perform()

sleep(1000)


//location = departureDate[1].getLocation()
//
//int xCordi = location.getX()
//
//int yCordi = location.getY()
//
//println(location)
//
//actions.moveByOffset(xCordi, yCordi).click().perform()
//
