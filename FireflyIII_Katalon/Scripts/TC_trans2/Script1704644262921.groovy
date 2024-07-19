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

WebUI.click(findTestObject('Object Repository/Page_Tt c cc chi ph gia 1 thng 1 2024 v 31 _f7584c/span_Giao dch'))

WebUI.click(findTestObject('Object Repository/Page_Tt c cc chi ph gia 1 thng 1 2024 v 31 _f7584c/span_Chi ph'))

WebUI.click(findTestObject('Object Repository/Page_Tt c cc chi ph gia 1 thng 1 2024 v 31 _f7584c/a_To giao dch mi'))

WebUI.setText(findTestObject('Object Repository/Page_To rt tin mi  Giao dch  Firefly III/input_S miu t_description'), name_new)

WebUI.setText(findTestObject('Object Repository/Page_To rt tin mi  Giao dch  Firefly III/input_Ngun ti khon_source'), taikhoannguon)

WebUI.sendKeys(findTestObject('Object Repository/Page_To rt tin mi  Giao dch  Firefly III/input_Ngun ti khon_source'), Keys.chord(
        Keys.ENTER))

WebUI.click(findTestObject('Object Repository/Page_To rt tin mi  Giao dch  Firefly III/input_Ti khon ch_destination'))

WebUI.click(findTestObject('Object Repository/Page_To rt tin mi  Giao dch  Firefly III/span_Cash account'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_To rt tin mi  Giao dch  Firefly III/select_(Trng)      Ngan sach de80      Ngan_36234f'), 
    ngansach, true)

WebUI.setText(findTestObject('Object Repository/Page_To rt tin mi  Giao dch  Firefly III/input_US Dollar_amount'), sotien)

WebUI.setText(findTestObject('Object Repository/Page_To rt tin mi  Giao dch  Firefly III/input_Ngoi t_foreign_amount'), 
    ngoaite)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_To rt tin mi  Giao dch  Firefly III/select_(cha c heo t)                  Piggy_efd74c'), 
    heodat, true)

WebUI.setText(findTestObject('Object Repository/Page_To rt tin mi  Giao dch  Firefly III/input_Danh mc_category'), danhmuc)

WebUI.setText(findTestObject('Object Repository/Page_To rt tin mi  Giao dch  Firefly III/input_Nhn_ti-new-tag-input ti-valid'), 
    nhan)

WebUI.click(findTestObject('Object Repository/Page_To rt tin mi  Giao dch  Firefly III/div_S miu t           Ngun ti khon     HCAD_255326'))

WebUI.click(findTestObject('Object Repository/Page_To rt tin mi  Giao dch  Firefly III/button_Gi'))

WebUI.closeBrowser()

