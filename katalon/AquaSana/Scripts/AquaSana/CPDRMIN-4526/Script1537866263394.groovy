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
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.junit.Assert
import org.openqa.selenium.By
import org.openqa.selenium.By.ByCssSelector
import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait

WebUI.openBrowser('https://uat.aquasana.co.uk/')

WebUI.maximizeWindow()

WebUI.callTestCase(findTestCase('helperMethods/AquaSana/AquaSana_Search_SpaDays - 3 Months'), [:], FailureHandling.STOP_ON_FAILURE)

GlobalVariable.flexibleDays = '1'

WebUI.callTestCase(findTestCase('helperMethods/AquaSana/AquaSana_Search_Results_Edit_Search'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('AquaSana/AquaSana - Search Results/Edit Search/plus1DayText'), 0)

GlobalVariable.flexibleDays = '2'

WebUI.callTestCase(findTestCase('helperMethods/AquaSana/AquaSana_Search_Results_Edit_Search'), [:], FailureHandling.STOP_ON_FAILURE)

//WebUI.waitForElementVisible(findTestObject('AquaSana/AquaSana - Search Results/Edit Search/plus2DayText'), 0)
sleep(1000)

WebUI.click(findTestObject('AquaSana/AquaSana - Search Results/Edit Search/Sort/li_Recommended'))

WebUI.click(findTestObject('AquaSana/AquaSana - Search Results/Edit Search/Sort/label_Price lowest to highest'))

WebDriver driver = DriverFactory.getWebDriver()

String sortStyle = driver.findElement(By.cssSelector(".b-search-results article:nth-child(2)")).getAttribute("style")

Assert.assertTrue(sortStyle == "order: 89;")

WebUI.click(findTestObject('AquaSana/AquaSana - Search Results/Edit Search/Sort/label_Price highest to lowest'))

String searchResultsStyle = driver.findElement(By.cssSelector(".b-search-results")).getAttribute("style")

Assert.assertTrue(searchResultsStyle == "flex-wrap: wrap-reverse;")

WebUI.click(findTestObject('AquaSana/AquaSana - Search Results/Edit Search/Sort/label_Recommended'))

WebUI.click(findTestObject('AquaSana/AquaSana - Search Results/Edit Search/Filter/li_Filters'))

WebUI.click(findTestObject('AquaSana/AquaSana - Search Results/Edit Search/Filter/label_Spa days'))

String spaDaysClass = driver.findElement(By.cssSelector(".b-search-results article:nth-child(2)")).getAttribute("class")
Assert.assertTrue(spaDaysClass == "b-product")

String spaPackageClass = driver.findElement(By.cssSelector(".b-search-results article:nth-child(13)")).getAttribute("class")
Assert.assertTrue(spaPackageClass == "b-product is-hidden")

WebUI.click(findTestObject('AquaSana/AquaSana - Search Results/Edit Search/Filter/label_Spa packages'))

spaDaysClass = driver.findElement(By.cssSelector(".b-search-results article:nth-child(2)")).getAttribute("class")
Assert.assertTrue(spaDaysClass == "b-product")

spaPackageClass = driver.findElement(By.cssSelector(".b-search-results article:nth-child(13)")).getAttribute("class")
Assert.assertTrue(spaPackageClass == "b-product")

WebUI.click(findTestObject('AquaSana/AquaSana - Search Results/Edit Search/Filter/label_Spa days'))

spaDaysClass = driver.findElement(By.cssSelector(".b-search-results article:nth-child(2)")).getAttribute("class")
Assert.assertTrue(spaDaysClass == "b-product is-hidden")

spaPackageClass = driver.findElement(By.cssSelector(".b-search-results article:nth-child(13)")).getAttribute("class")
Assert.assertTrue(spaPackageClass == "b-product")
