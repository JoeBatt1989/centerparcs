import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import java.sql.DriverManager as DriverManager
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement

WebUI.callTestCase(findTestCase('helperMethods/CenterParcs/CenterParcs_Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('CenterParcs/Centerparcs_homepage_logged_in/avatar'), 0)

WebUI.click(findTestObject('CenterParcs/Centerparcs_homepage_logged_in/myBookingMenu'))

WebUI.waitForElementVisible(findTestObject('CenterParcs/Centerparcs_homepage_logged_in/myBookingSubmenu'), 0)

WebUI.click(findTestObject('CenterParcs/Centerparcs_homepage_logged_in/addBookingToAccount'))

WebUI.waitForElementVisible(findTestObject('CenterParcs/Centerparcs_add_your_bookings/addBookingsTitle'), 0)

WebUI.setText(findTestObject('CenterParcs/Centerparcs_add_your_bookings/bookingRefInput'), 'CP1_Test')

WebUI.scrollToElement(findTestObject('CenterParcs/Centerparcs_add_your_bookings/addBookingBtn'), 0)

WebUI.click(findTestObject('CenterParcs/Centerparcs_add_your_bookings/addBookingBtn'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('CenterParcs/Centerparcs_add_your_bookings/bookingValidationMessage'), 0)

WebUI.scrollToElement(findTestObject('CenterParcs/Centerparcs_add_your_bookings/bookingValidationMessage'), 0)

actualValidationMessage = WebUI.getText(findTestObject('CenterParcs/Centerparcs_add_your_bookings/bookingValidationMessage'), FailureHandling.STOP_ON_FAILURE)

assert expectedValidationMessage == actualValidationMessage

// Manual webdriver code for all bookings link
WebDriver driver = DriverFactory.getWebDriver()

allBookingsLink = driver.findElements(By.xpath('//*[contains(text(),\'View all Center Parcs bookings\')]'))

allBookingsLink[1].click()

WebUI.waitForElementVisible(findTestObject('CenterParcs/Centerparcs_all_bookings/viewBookingInfoBtn'), 0)

// Manual code for finding the number of booking refs matching 
bookingRefCount = driver.findElements(By.xpath('//*[contains(text(),\'CP1_Test\')]')).size()

assert bookingRefCount == 0

WebUI.click(findTestObject('CenterParcs/Centerparcs_homepage_logged_in/myBookingMenu'))

WebUI.waitForElementVisible(findTestObject('CenterParcs/Centerparcs_homepage_logged_in/myBookingSubmenu'), 0)

WebUI.click(findTestObject('CenterParcs/Centerparcs_homepage_logged_in/addBookingToAccount'))

WebUI.waitForElementVisible(findTestObject('CenterParcs/Centerparcs_add_your_bookings/addBookingsTitle'), 0)

WebUI.setText(findTestObject('CenterParcs/Centerparcs_add_your_bookings/bookingRefInput'), '1545652')

WebUI.scrollToElement(findTestObject('CenterParcs/Centerparcs_add_your_bookings/addBookingBtn'), 0)

WebUI.click(findTestObject('CenterParcs/Centerparcs_add_your_bookings/addBookingBtn'), FailureHandling.STOP_ON_FAILURE)

