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

GlobalVariable.spaVillageValue = 'SF'

GlobalVariable.spaVillageRequired = true

GlobalVariable.spaFlexibleDaysRequired = false

GlobalVariable.spaDateRequired = true

GlobalVariable.spaDateValue = 'Today'

GlobalVariable.currentPassword = 'Password123'

GlobalVariable.emailAddress = 'winston'

WebUI.openBrowser('https://uat.aquasana.co.uk/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('AquaSana/AquaSana - Homepage/Header Links/Spa Days/spaDaysTab'))

WebUI.click(findTestObject('AquaSana/AquaSana - Homepage/Header Links/Spa Days/spaDaysLink'))

WebUI.waitForElementVisible(findTestObject('AquaSana/AquaSana - Spa Days/spaDaysText'), 0)

WebUI.click(findTestObject('AquaSana/AquaSana - Homepage/Header Links/Spa Days/spaDaysTab'))

WebUI.click(findTestObject('AquaSana/AquaSana - Homepage/Header Links/Spa Days/spaPackagesLink'))

WebUI.waitForElementVisible(findTestObject('AquaSana/AquaSana - Spa Packages/spaPackagesText'), 0)

WebUI.click(findTestObject('AquaSana/AquaSana - Spa Packages/Spa Package_1/moreInfoBtn'))

WebUI.waitForElementVisible(findTestObject('AquaSana/AquaSana - Spa Packages/Spa Package_1/searchAndBookBtn'), 0)

WebUI.click(findTestObject('AquaSana/AquaSana - Spa Packages/Spa Package_1/searchAndBookBtn'), FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('helperMethods/AquaSana/AquaSana_Search_SpaDays_Booking'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.back()

GlobalVariable.spaVillageValue = 'EF'

GlobalVariable.spaVillageRequired = true

GlobalVariable.spaFlexibleDaysRequired = true

GlobalVariable.spaFlexibleDays = '2'

GlobalVariable.spaDateRequired = false

WebUI.callTestCase(findTestCase('helperMethods/AquaSana/AquaSana_Search_SpaDays_Booking'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.back()

GlobalVariable.luxuryVillageValue = 'EF'

GlobalVariable.luxuryVillageRequired = true

GlobalVariable.luxuryFlexibleDayRequired = false

GlobalVariable.luxuryDateRequired = true

GlobalVariable.luxuryDateValue = '3 Months'

WebUI.callTestCase(findTestCase('helperMethods/AquaSana/AquaSana_Search_LuxuryBreak_Booking'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.back()

GlobalVariable.alreadyBookedTreatment = true

GlobalVariable.alreadyBookedCP = false

WebUI.callTestCase(findTestCase('helperMethods/AquaSana/AquaSana_Search_AlreadyBooked_Booking'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('helperMethods/AquaSana/AquaSana_Login_Existing_User'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('helperMethods/AquaSana/AquaSana_Logo'), [:], FailureHandling.STOP_ON_FAILURE)

GlobalVariable.alreadyBookedTreatment = false

GlobalVariable.alreadyBookedCP = true

WebUI.callTestCase(findTestCase('helperMethods/AquaSana/AquaSana_Search_AlreadyBooked'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.switchToWindowIndex(1)

WebUI.waitForElementVisible(findTestObject('CenterParcs/Centerparcs - homepage/signIn_btn'), 0)

