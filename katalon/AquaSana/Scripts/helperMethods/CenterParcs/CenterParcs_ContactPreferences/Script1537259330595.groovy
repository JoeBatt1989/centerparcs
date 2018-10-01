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

if (GlobalVariable.postComms == true) {
    WebUI.scrollToElement(findTestObject('CenterParcs/Centerparcs_my_profile/postCommsPref'), 0)

    WebUI.check(findTestObject('CenterParcs/Centerparcs_my_profile/postCommsPref'))
}

if (GlobalVariable.emailComms == true) {
    WebUI.scrollToElement(findTestObject('CenterParcs/Centerparcs_my_profile/emailCommsPref'), 0)

    WebUI.check(findTestObject('CenterParcs/Centerparcs_my_profile/emailCommsPref'))
}

if (GlobalVariable.smsComms == true) {
    WebUI.scrollToElement(findTestObject('CenterParcs/Centerparcs_my_profile/smsCommsPref'), 0)

    WebUI.check(findTestObject('CenterParcs/Centerparcs_my_profile/smsCommsPref'))
}

