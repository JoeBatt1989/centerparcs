import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.junit.Assert
import org.openqa.selenium.By
import org.openqa.selenium.WebDriver
import org.openqa.selenium.support.ui.ExpectedConditions
import org.openqa.selenium.support.ui.WebDriverWait

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

WebUI.openBrowser('https://uat.aquasana.co.uk/')

WebUI.maximizeWindow()

WebUI.waitForElementVisible(findTestObject('AquaSana/AquaSana - Homepage/Header Links/Aqua sana Experience/discoverAquaSanaTab'), 
    0)

WebUI.click(findTestObject('AquaSana/AquaSana - Homepage/Header Links/Aqua sana Experience/discoverAquaSanaTab'))

WebUI.click(findTestObject('AquaSana/AquaSana - Homepage/Header Links/Aqua sana Experience/aquaSanaExperienceLink'))

WebUI.waitForElementVisible(findTestObject('AquaSana/AquaSana - Experience/aquaSanaExperienceText'), 0)

WebDriver driver = DriverFactory.getWebDriver()
wait = new WebDriverWait(driver, 10)
String slideClass

for (int i=0; i< 4;i++){
	if(i == 0){
		slideClass = driver.findElement(By.cssSelector(".swiper-wrapper .swiper-slide:nth-child(1)")).getAttribute("class")
		Assert.assertTrue(slideClass == 'swiper-slide swiper-slide-active')
	}
	if(i == 1){
		driver.findElement(By.cssSelector(".swiper-button-next")).click()
		//wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".swiper-wrapper .swiper-slide:nth-child(2) .swiper-slide-active")))
		sleep(500)
		slideClass = driver.findElement(By.cssSelector(".swiper-wrapper .swiper-slide:nth-child(2)")).getAttribute("class")
		Assert.assertTrue(slideClass == 'swiper-slide swiper-slide-active')
	}
	if(i == 2){
		driver.findElement(By.cssSelector(".swiper-button-next")).click()
		sleep(500)
		slideClass = driver.findElement(By.cssSelector(".swiper-wrapper .swiper-slide:nth-child(3)")).getAttribute("class")
		Assert.assertTrue(slideClass == 'swiper-slide swiper-slide-active')
	}
	if(i == 3){
		driver.findElement(By.cssSelector(".swiper-button-next")).click()
		sleep(500)
		slideClass = driver.findElement(By.cssSelector(".swiper-wrapper .swiper-slide:nth-child(4)")).getAttribute("class")
		Assert.assertTrue(slideClass == 'swiper-slide swiper-slide-active')
	}
}

for (i=0; i< 4;i++){
	if(i == 0){
		slideClass = driver.findElement(By.cssSelector(".swiper-wrapper .swiper-slide:nth-child(4)")).getAttribute("class")
		Assert.assertTrue(slideClass == 'swiper-slide swiper-slide-active')
	}
	if(i == 1){
		driver.findElement(By.cssSelector(".swiper-button-prev")).click()
		sleep(500)
		slideClass = driver.findElement(By.cssSelector(".swiper-wrapper .swiper-slide:nth-child(3)")).getAttribute("class")
		Assert.assertTrue(slideClass == 'swiper-slide swiper-slide-active')
	}
	if(i == 2){
		driver.findElement(By.cssSelector(".swiper-button-prev")).click()
		sleep(500)
		slideClass = driver.findElement(By.cssSelector(".swiper-wrapper .swiper-slide:nth-child(2)")).getAttribute("class")
		Assert.assertTrue(slideClass == 'swiper-slide swiper-slide-active')
	}
	if(i == 3){
		driver.findElement(By.cssSelector(".swiper-button-prev")).click()
		sleep(500)
		slideClass = driver.findElement(By.cssSelector(".swiper-wrapper .swiper-slide:nth-child(1)")).getAttribute("class")
		Assert.assertTrue(slideClass == 'swiper-slide swiper-slide-active')
	}
}

driver.findElement(By.cssSelector(".swiper-pagination-bullets .swiper-pagination-bullet:nth-child(3)")).click()
sleep(500)
slideClass = driver.findElement(By.cssSelector(".swiper-wrapper .swiper-slide:nth-child(3)")).getAttribute("class")
Assert.assertTrue(slideClass == 'swiper-slide swiper-slide-active')

WebUI.scrollToElement(findTestObject('AquaSana/AquaSana - Experience/spaLocationsBtn'), 0)

WebUI.click(findTestObject('AquaSana/AquaSana - Experience/spaLocationsBtn'))

WebUI.waitForElementVisible(findTestObject('AquaSana/AquaSana - Locations/spaLocationsText'), 0)

WebUI.back(FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('AquaSana/AquaSana - Experience/Laconium/laconiumLink'), 0)

WebUI.click(findTestObject('AquaSana/AquaSana - Experience/Laconium/laconiumLink'))

WebUI.waitForElementVisible(findTestObject('AquaSana/AquaSana - Experience/Laconium/laconiumText'), 0)

WebUI.back(FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('AquaSana/AquaSana - Experience/aquaSanaExperienceText'), 0)

WebUI.click(findTestObject('AquaSana/AquaSana - Experience/Tyrolean/tyroleanLink'))

WebUI.waitForElementVisible(findTestObject('AquaSana/AquaSana - Experience/Tyrolean/tyroleanText'), 0)

WebUI.back(FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('AquaSana/AquaSana - Experience/aquaSanaExperienceText'), 0)

WebUI.click(findTestObject('AquaSana/AquaSana - Experience/Showers/showersLink'))

WebUI.waitForElementVisible(findTestObject('AquaSana/AquaSana - Experience/Showers/showersText'), 0)

WebUI.back(FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('AquaSana/AquaSana - Experience/aquaSanaExperienceText'), 0)



