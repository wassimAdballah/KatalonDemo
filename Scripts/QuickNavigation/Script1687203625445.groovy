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

WebUI.navigateToUrl('https://mi-web-administration-preprod.eu.auth0.com/u/login?state=hKFo2SBWcnhaZlZFdjJWQmpiWUxEa0lUQVN3MzFhbWJUN1U3WKFur3VuaXZlcnNhbC1sb2dpbqN0aWTZIE5FU083a3BFXzBPOXYzV2Q4NzJENnhlQ1hHTFdpUzdNo2NpZNkga3BhRmJIZkZzaVRqcVJ6eVdocUxPYzg5ZXF2TWdabVc')

WebUI.setText(findTestObject('Object Repository/Page_Connexion  PFS Otoroshi/input_Adresse e-mail_username'), 'wassim.abdallah@slashup.studio')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Connexion  PFS Otoroshi/input_Mot de passe_password'), 'WcTKyt1uEOJ2NABn3N99Hg==')

WebUI.click(findTestObject('Object Repository/Page_Connexion  PFS Otoroshi/button_Continuer'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Maif International - Administration/span_Liste des trajets'), 
    'Liste des trajets')

WebUI.click(findTestObject('Object Repository/Page_Maif International - Administration/a_Liste des trajets_d-flex justify-content-_3daa63'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Maif International - Administration/span_Liste des rservations sinistres'), 
    'Liste des réservations sinistrées')

WebUI.click(findTestObject('Object Repository/Page_Maif International - Administration/svg_Liste des rservations sinistres_svg'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Maif International - Administration/span_Paramtres'), 'Paramètres')

WebUI.click(findTestObject('Object Repository/Page_Maif International - Administration/img_Paramtres_img-profil small'))

WebUI.click(findTestObject('Object Repository/Page_Maif International - Administration/span_Profil et prfrences'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Maif International - Administration/div_Profil et prfrences'), 
    'Profil et préférences')

WebUI.closeBrowser()

