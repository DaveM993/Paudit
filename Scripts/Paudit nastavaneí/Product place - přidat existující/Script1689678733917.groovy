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

WebUI.click(findTestObject('Stránka nastavení/Add Product Location/Page_Marvin 3/Production locations'))

WebUI.verifyElementClickable(findTestObject('Stránka nastavení/Přidat existující/zkopirovat existujici/button_zkopirovat existujici'))

WebUI.click(findTestObject('Stránka nastavení/Přidat existující/zkopirovat existujici/button_zkopirovat existujici'))

WebUI.scrollToElement(findTestObject('Stránka nastavení/Přidat existující/zkopirovat existujici/span_vrobniMstoB'), 3)

WebUI.check(findTestObject('Stránka nastavení/Přidat existující/zkopirovat existujici/span_vrobniMstoB'))

WebUI.acceptAlert()

WebUI.setText(findTestObject('Stránka nastavení/Přidat existující/zkopirovat existujici/Page_Marvin 3/input_newShortName_mui-42'), 
    'tes')

WebUI.click(findTestObject('Stránka nastavení/Přidat existující/zkopirovat existujici/button_uloit'))

WebUI.back()

WebUI.click(findTestObject('Stránka nastavení/Výrobní oblast/Vrobn oblast/ikona_Vrobn oblast'))

WebUI.click(findTestObject('Stránka nastavení/Výrobní oblast/zkoprovat existujc oblast/button_Zkoprovat existujc'))

WebUI.verifyElementClickable(findTestObject('Stránka nastavení/Výrobní oblast/Vrobn oblast pidat existujc/Vrobn Msto A'))

WebUI.click(findTestObject('Stránka nastavení/Výrobní oblast/Vrobn oblast pidat existujc/Vrobn Msto A'))

WebUI.check(findTestObject('Stránka nastavení/Výrobní oblast/Vrobn oblast pidat existujc (1)/span_Oblast 51'))

WebUI.verifyElementChecked(findTestObject('Stránka nastavení/Výrobní oblast/Vrobn oblast pidat existujc (1)/span_Oblast 51'), 
    3)

WebUI.waitForElementPresent(findTestObject('Stránka nastavení/Výrobní oblast/Vrobn oblast pidat existujc (2)/button_Uloit'), 
    3)

WebUI.click(findTestObject('Stránka nastavení/Výrobní oblast/Vrobn oblast pidat existujc (2)/button_Uloit'))

