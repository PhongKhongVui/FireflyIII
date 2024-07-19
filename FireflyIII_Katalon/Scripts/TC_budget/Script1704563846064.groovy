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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost/login')

WebUI.setText(findTestObject('Object Repository/Page_Login to Firefly III/input_Remember me_email'), 'nguyensyphong2002@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Login to Firefly III/input_Remember me_password'), 'spWtDXBY62jRcUpfRbDlStl3SoZliWQJ')

WebUI.click(findTestObject('Object Repository/Page_Login to Firefly III/button_Sign in'))

WebUI.click(findTestObject('Object Repository/Page_Cho mng tr li  Firefly III/a_Ngn sch'))

WebUI.click(findTestObject('Object Repository/Page_Ngn sch  Firefly III/a_Ngn sch mi'))

WebUI.setText(findTestObject('Object Repository/Page_To ngn sch mi  Ngn sch  Firefly III/input_Tn_name'), name)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_To ngn sch mi  Ngn sch  Firefly III/select_Khng c ngn sch t ngt s tin c nh mi k_d49eb4'), 
    type, true)

WebUI.setText(findTestObject('Object Repository/Page_To ngn sch mi  Ngn sch  Firefly III/input_S tin ngn sch t ng_auto_budget_amount'), 
    sotien)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_To ngn sch mi  Ngn sch  Firefly III/select_Hng ngyHng tunHng thngHng quMi na nmHng nm'), 
    chuky, true)

WebUI.click(findTestObject('Object Repository/Page_To ngn sch mi  Ngn sch  Firefly III/button_Lu tr ngn sch mi'))

WebUI.closeBrowser()

