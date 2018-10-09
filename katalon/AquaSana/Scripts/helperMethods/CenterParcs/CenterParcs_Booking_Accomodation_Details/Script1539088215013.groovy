import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.junit.After as After
import org.openqa.selenium.By as By
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

WebUI.waitForElementVisible(findTestObject('CenterParcs/CenterParcs - Accomodation Details/accomodationDetailsText'), 0)

WebDriver driver = DriverFactory.getWebDriver()

checkBoxCount = driver.findElements(By.id('warning-checkbox'))

if (checkBoxCount.size() > 0) {
    WebUI.scrollToElement(findTestObject('CenterParcs/CenterParcs - Accomodation Details/warningCheckBox'), 0)

    WebUI.check(findTestObject('CenterParcs/CenterParcs - Accomodation Details/warningCheckBox'), FailureHandling.STOP_ON_FAILURE)

    WebUI.waitForElementClickable(findTestObject('CenterParcs/CenterParcs - Accomodation Details/bookNowBtn'), 0)

    WebUI.click(findTestObject('CenterParcs/CenterParcs - Accomodation Details/bookNowBtn'), FailureHandling.STOP_ON_FAILURE)
} else{

	WebUI.waitForElementClickable(findTestObject('CenterParcs/CenterParcs - Accomodation Details/bookNowBtn'), 0)

	WebUI.click(findTestObject('CenterParcs/CenterParcs - Accomodation Details/bookNowBtn'), FailureHandling.STOP_ON_FAILURE)
}

