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

WebUI.click(findTestObject('Stránka nastavení/Add Product Location/dataPicker/Page_Marvin 3/Page_Marvin 3/vrobn msta'))

WebUI.verifyElementClickable(findTestObject('Stránka nastavení/Add Product Location/edit and delete/button_edit'))

WebUI.mouseOver(findTestObject('Stránka nastavení/Add Product Location/edit and delete/button_edit'))

WebUI.click(findTestObject('Stránka nastavení/Add Product Location/edit and delete/button_edit'))

WebUI.sendKeys(findTestObject('Stránka nastavení/Add Product Location/Page_Marvin 3/input_Name'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.sendKeys(findTestObject('Stránka nastavení/Add Product Location/Page_Marvin 3/input_Name'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Stránka nastavení/Add Product Location/Page_Marvin 3/input_Name'), 'Test1')

WebUI.sendKeys(findTestObject('Stránka nastavení/Add Product Location/Page_Marvin 3/input_Name (DE)'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.sendKeys(findTestObject('Stránka nastavení/Add Product Location/Page_Marvin 3/input_Name (DE)'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Stránka nastavení/Add Product Location/Page_Marvin 3/input_Name (DE)'), 'testDe')

WebUI.sendKeys(findTestObject('Stránka nastavení/Add Product Location/Page_Marvin 3/input_Name (short)'), Keys.chord(Keys.CONTROL, 
        'a'))

WebUI.sendKeys(findTestObject('Stránka nastavení/Add Product Location/Page_Marvin 3/input_Name (short)'), Keys.chord(Keys.BACK_SPACE))

WebUI.setText(findTestObject('Stránka nastavení/Add Product Location/Page_Marvin 3/input_Name (short)'), 'tes')

WebUI.click(findTestObject('Stránka nastavení/Add Product Location/Page_Marvin 3/button_Save'))

WebUI.click(findTestObject('Stránka nastavení/Add Product Location/edit and delete/pop-up/pop-up potvrzen'))

