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

WebUI.click(findTestObject('AquaSana/AquaSana - Search Results/Edit Search/editSearchBtn'))

WebUI.waitForElementVisible(findTestObject('AquaSana/AquaSana - Booking Search/Spa Days/spaDayTab'), 0)

WebUI.click(findTestObject('AquaSana/AquaSana - Booking Search/Spa Days/spaDayTab'))

WebUI.waitForElementVisible(findTestObject('AquaSana/AquaSana - Booking Search/Spa Days/spaDaysMagnet'), 0)

WebUI.selectOptionByValue(findTestObject('AquaSana/AquaSana - Booking Search/Spa Days/flexibleDropDown'), GlobalVariable.spaFlexibleDays, false)

WebUI.click(findTestObject('AquaSana/AquaSana - Booking Search/Spa Days/searchBtn'))

