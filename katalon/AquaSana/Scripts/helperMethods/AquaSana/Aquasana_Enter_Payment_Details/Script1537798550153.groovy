import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.WebDriver as WebDriver
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

sleep(1000)

WebDriver driver = DriverFactory.getWebDriver()

driver.switchTo().frame(0)

WebUI.waitForElementVisible(findTestObject('AquaSana/AquaSana - Payment/Card Details/paymentTypeDropDown'), 0)

WebUI.selectOptionByValue(findTestObject('AquaSana/AquaSana - Payment/Card Details/paymentTypeDropDown'), 'VI', false)

WebUI.setText(findTestObject('AquaSana/AquaSana - Payment/Card Details/cardNumber'), '4929492949294929')

WebUI.setText(findTestObject('AquaSana/AquaSana - Payment/Card Details/cardName'), (GlobalVariable.firstName + ' ') + GlobalVariable.lastName)

WebUI.setText(findTestObject('AquaSana/AquaSana - Payment/Card Details/validFrom'), '01/2018')

WebUI.setText(findTestObject('AquaSana/AquaSana - Payment/Card Details/expiryDate'), '01/2021')

WebUI.setText(findTestObject('AquaSana/AquaSana - Payment/Card Details/csv'), '424')

WebUI.scrollToElement(findTestObject('AquaSana/AquaSana - Payment/Card Details/confirmPayBtn'), 0)

WebUI.waitForElementVisible(findTestObject('AquaSana/AquaSana - Payment/Card Details/confirmPayBtn'), 0)

WebUI.click(findTestObject('AquaSana/AquaSana - Payment/Card Details/confirmPayBtn'))

