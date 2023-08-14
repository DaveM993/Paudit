import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.callTestCase(findTestCase('Paudit nastavaneí/Číselník nastavení'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.waitForPageLoad(3)

WebUI.click(findTestObject('productLocationNew/ProductLocation/PolozkaProductLocation'))

WebUI.click(findTestObject('productLocationNew/ProductLocation/button_Add New'))

WebUI.waitForElementVisible(findTestObject('productLocationNew/ProductLocation/input_Name'), 3)

WebUI.setText(findTestObject('productLocationNew/ProductLocation/input_Name'), 'Automation Test')

WebUI.setText(findTestObject('productLocationNew/ProductLocation/input_Name (DE)'), 'Automation Test')

WebUI.setText(findTestObject('productLocationNew/ProductLocation/input_Name (short)'), 'aut')

WebUI.click(findTestObject('productLocationNew/ProductLocation/button_Save'))

data1 = WebUI.getText(findTestObject('productLocationNew/ProductLocation/button_Save'))

System.out.println(data1 + '****')

WebUI.click(findTestObject('productLocationNew/ProductLocation/button_Confirm'))

