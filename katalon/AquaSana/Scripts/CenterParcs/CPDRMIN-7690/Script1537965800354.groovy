import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.support.ui.ExpectedConditions as ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait as WebDriverWait
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
import junit.framework.Assert as Assert

WebUI.openBrowser('https://uat.centerparcs.co.uk')

WebUI.maximizeWindow()

WebUI.waitForElementVisible(findTestObject('CenterParcs/Centerparcs - homepage/Header Links/Discover Center Parcs/DiscoverCPTab'), 
    0)

WebUI.click(findTestObject('CenterParcs/Centerparcs - homepage/Header Links/Discover Center Parcs/DiscoverCPTab'))

WebUI.click(findTestObject('CenterParcs/Centerparcs - homepage/Header Links/Discover Center Parcs/browseThingsToDoLink'))

//WebUI.waitForElementPresent(findTestObject('CenterParcs/Centerparcs - Things To Do/vilagesDropDown'), 0)
WebDriver driver = DriverFactory.getWebDriver()

WebDriverWait wait = new WebDriverWait(driver, 10)

wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector('.item-card-group article:nth-child(1)')))

String numberOfActivities = driver.findElements(By.cssSelector('.item-card-group article')).size()

String resultsText = driver.findElement(By.cssSelector('.js-search-results-count')).getText()

String resultsNumber = resultsText.substring(8, 11)

Assert.assertTrue(resultsNumber == numberOfActivities)

String activityTitle = driver.findElements(By.cssSelector(".item-card__title")).size()

String activityDescription = driver.findElements(By.cssSelector(".item-card__description")).size()

String activityDetailBtn = driver.findElements(By.cssSelector(".js-detail-button")).size()

Assert.assertTrue(activityTitle == numberOfActivities)

Assert.assertTrue(activityDescription == numberOfActivities)

Assert.assertTrue(activityDetailBtn == numberOfActivities)

WebUI.click(findTestObject('CenterParcs/Centerparcs - Things To Do/categoryDropDown'))

WebUI.click(findTestObject('CenterParcs/Centerparcs - Things To Do/categoryDropDown_SpaTreatment'))

WebUI.click(findTestObject('CenterParcs/Centerparcs - Things To Do/searchBtn'))

wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector('.item-card-group article:nth-child(1)')))

numberOfActivities = driver.findElements(By.cssSelector('.item-card-group article')).size()

resultsText = driver.findElement(By.cssSelector('.js-search-results-count')).getText()

resultsNumber = resultsText.substring(8, 11)

Assert.assertTrue(resultsNumber == numberOfActivities)



