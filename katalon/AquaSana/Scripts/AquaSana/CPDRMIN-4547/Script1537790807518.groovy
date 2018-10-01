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

GlobalVariable.spaVillageValue = "SF"
GlobalVariable.spaVillageRequired = true
GlobalVariable.spaFlexibleDays = "0"
GlobalVariable.spaDateRequired = true

WebUI.openBrowser('https://uat.aquasana.co.uk/')

WebUI.maximizeWindow()

WebUI.waitForElementVisible(findTestObject('AquaSana/AquaSana - Homepage/Header Links/Spa Days/spaDaysTab'), 0)

WebUI.click(findTestObject('AquaSana/AquaSana - Homepage/Header Links/Spa Days/spaDaysTab'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('AquaSana/AquaSana - Homepage/Header Links/Spa Days/spaDaysLink'))

WebUI.waitForElementVisible(findTestObject('AquaSana/AquaSana - Spa Days/spaDaysText'), 0)

WebUI.callTestCase(findTestCase('helperMethods/AquaSana/AquaSana_Book_SpaDays'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('helperMethods/AquaSana/AquaSana_Search_SpaDays_Booking'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('helperMethods/AquaSana/AquaSana_SpaDays_Booking'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('helperMethods/AquaSana/AquaSana_My_Basket_Additional_Treatments'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('helperMethods/AquaSana/AquaSana_Payment'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('helperMethods/AquaSana/AquaSana_Register_Whilst_Booking'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('helperMethods/AquaSana/Aquasana_Enter_Payment_Details'), [:], FailureHandling.STOP_ON_FAILURE)

