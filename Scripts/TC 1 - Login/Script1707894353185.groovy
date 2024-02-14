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

Mobile.startApplication('C:\\Users\\skyne\\Documents\\1. BRI\\Bootcampt\\Automation\\Shop\\Advantage+demo+3.2.apk', true)

Mobile.tap(findTestObject('Object Repository/TC 1 - Login/android.widget.ImageView'), 0)

Mobile.tap(findTestObject('Object Repository/TC 1 - Login/android.widget.LinearLayout'), 0)

Mobile.setText(findTestObject('TC 1 - Login/android.widget.RelativeLayoutUsername'), username, 0)

Mobile.setText(findTestObject('TC 1 - Login/android.widget.RelativeLayoutPW'), password, 0)

Mobile.tap(findTestObject('Object Repository/TC 1 - Login/android.widget.Button - LOGIN'), 0)


if (isValid=='true') {
    
    Mobile.tap(findTestObject('Object Repository/TC 1 - Login/android.widget.Button - NO'), 0)

    Mobile.tap(findTestObject('Object Repository/TC 1 - Login/android.widget.ImageView'), 0)

    namaUser = Mobile.getText(findTestObject('Object Repository/TC 1 - Login/android.widget.TextView - nicehsk'), 0)

    Mobile.verifyElementText(findTestObject('TC 1 - Login/android.widget.TextView - nicehsk'), username)

    Mobile.tap(findTestObject('Object Repository/TC 1 - Login/android.widget.TextView - SIGN OUT'), 0)

    Mobile.tap(findTestObject('Object Repository/TC 1 - Login/android.widget.Button - YES'), 0)

    Mobile.closeApplication()
} else {
    Mobile.verifyElementText(findTestObject('TC 1 - Login/android.widget.TextView - Incorrect user name or password'), 'Incorrect user name or password.')

    Mobile.closeApplication()
}
