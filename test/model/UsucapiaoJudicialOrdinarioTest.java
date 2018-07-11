/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.regex.Pattern;
import java.util.concurrent.TimeUnit;
import org.junit.*;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class UsucapiaoJudicialOrdinarioTest {
    private UsucapiaoJudicialOrdinario usucapiao;
  private String baseUrl;
  private boolean acceptNextAlert = true;
  private StringBuffer verificationErrors = new StringBuffer();
    public UsucapiaoJudicialOrdinarioTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\rwspa\\OneDrive\\Documents\\NetBeansProjects\\AcaoUsucapiao\\lib");
        
        usucapiao = new FirefoxDriver();
    baseUrl = "http://localhost:47332/";
    
    }
    
    @Test
  public void Teste1() throws Exception {
    selenium.open("http://localhost:8080/AcaoUsucapiao/ordinaria.jsp");
    selenium.click("name=animusDomini");
    selenium.click("name=prazo");
    selenium.type("name=prazo", "10");
    selenium.click("name=posseMansa");
    selenium.click("name=possePacifica");
    selenium.click("name=posseIninterrupta");
    selenium.click("name=justoTitulo");
    selenium.click("name=boaFe");
    selenium.click("name=pessoalidade");
    selenium.click("name=registroAnterior");
    selenium.click("name=Enviar");
    
    try {
      assertEquals("Resultado\n\n \n\n Mensagem do Sistema: O resultado: false", selenium.getText("//font"));
    } catch (Error e) {
      verificationErrors.append(e.toString());
    }
  }

