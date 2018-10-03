import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.text.SimpleDateFormat
import java.time.DayOfWeek
import java.time.LocalDate
import java.time.temporal.TemporalAdjusters

import com.google.common.base.CharMatcher
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
import org.openqa.selenium.By.ByCssSelector
import org.openqa.selenium.By.ById
import org.openqa.selenium.JavascriptExecutor as JavascriptExecutor
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.StaleElementReferenceException
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.support.ui.ExpectedConditions as ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait as WebDriverWait
import org.apache.commons.lang.StringUtils

WebDriver driver = DriverFactory.getWebDriver()

WebDriverWait wait = new WebDriverWait(driver, 4)

LocalDate monday = LocalDate.now()
LocalDate friday

monday = monday.with(TemporalAdjusters.nextOrSame(DayOfWeek.MONDAY))
friday = monday.with(TemporalAdjusters.nextOrSame(DayOfWeek.FRIDAY))

mondayString = monday.toString()
fridayString = friday.toString()

mondayDay = mondayString.reverse().take(2).reverse()
fridayDay = fridayString.reverse().take(2).reverse()

mondayDay = StringUtils.stripStart(mondayDay, "0")
fridayDay = StringUtils.stripStart(fridayDay, "0")

int mondayNum = mondayDay as Integer
int fridayNum = fridayDay as Integer

driver.findElement(By.id("datePickerCheckIn")).click()

wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".start-date")))

driver.findElement(By.cssSelector(".start-date.is-active td.is-standard-check-in[data-day='"+mondayDay+"']")).click()

wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".end-date")))

if(fridayNum < mondayNum){
	driver.findElements(By.cssSelector(".end-date td[data-day='"+fridayDay+"']")).get(1).click()
} else {
	driver.findElements(By.cssSelector(".end-date td[data-day='"+fridayDay+"']")).get(0).click()
}

