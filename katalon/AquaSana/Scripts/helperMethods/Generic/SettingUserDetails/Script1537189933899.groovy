import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.awt.List

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
import org.apache.commons.lang.RandomStringUtils

String charset = (('A'..'Z') + ('0'..'9')).join()
Integer length = 9
String randomString = RandomStringUtils.random(length, charset.toCharArray())
GlobalVariable.emailAddress = randomString
//
def firstNames =  ['Ben', 'Pete', 'Lucy', 'James', 'Polly', 'Laura', 'Henry', 'Robert', 'Steph', 'Megan', 'Joe', 'Scott', 'Hannah', 'Jim']
def lastNames =  ['Small', 'Bishop', 'Cooke', 'Watson', 'Levy', 'Green', 'Morgan', 'Simmonds', 'Holmes', 'Hays', 'Hill', 'Fowler', 'Lyon', 'Graham']
Collections.shuffle firstNames
Collections.shuffle lastNames
GlobalVariable.firstName = firstNames[1]
GlobalVariable.lastName = lastNames[1]
