/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rwspa
 */
public class UsucapiaoJudicialRuralTest {
    UsucapiaoJudicialRural usucapiao;
    public UsucapiaoJudicialRuralTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        usucapiao = new UsucapiaoJudicialRural(false, 0, false, false, false, 0, false, false, false, false);
    }
    
    @After
    public void tearDown() {
    }

    //animusDomini, prazo, posseMansa, possePassifica, posseIninterrupta, tamanhoTerreno, pessoalidade, areaProdutiva, imovelRural, registroDeOutroImovel
    /**
     * Test of verificaPossibilidade method, of class UsucapiaoJudicialFamiliar.
     */
    @Test
    public void testVerificaPossibilidade0() {
        String result = usucapiao.verificaRequisitos();
        assertEquals("false", result);
    }
    
    /**
     * Test of verificaPossibilidade method, of class UsucapiaoJudicialFamiliar.
     */
    @Test
    public void testVerificaPossibilidade() {
        usucapiao.setAnimusDomini(true);
        String result = usucapiao.verificaRequisitos();
        assertEquals("false", result);
    }
    
    /**
     * Test of verificaPossibilidade method, of class UsucapiaoJudicialFamiliar.
     */
    @Test
    public void testVerificaPossibilidade2() {
        usucapiao.setAnimusDomini(true);
        usucapiao.setPosseMansa(true);
        String result = usucapiao.verificaRequisitos();
        assertEquals("false", result);
    }
    
    /**
     * Test of verificaPossibilidade method, of class UsucapiaoJudicialFamiliar.
     */
    @Test
    public void testVerificaPossibilidade3() {
        usucapiao.setAnimusDomini(true);
        usucapiao.setPosseMansa(true);
        usucapiao.setPossePassifica(true);
        String result = usucapiao.verificaRequisitos();
        assertEquals("false", result);
    }
    
    /**
     * Test of verificaPossibilidade method, of class UsucapiaoJudicialFamiliar.
     */
    @Test
    public void testVerificaPossibilidade4() {
        usucapiao.setAnimusDomini(true);
        usucapiao.setPosseMansa(true);
        usucapiao.setPossePassifica(true);
        usucapiao.setPosseIninterrupta(true);
        String result = usucapiao.verificaRequisitos();
        assertEquals("false", result);
    }
    
    /**
     * Test of verificaPossibilidade method, of class UsucapiaoJudicialFamiliar.
     */
    @Test
    public void testVerificaPossibilidade5() {
        usucapiao.setAnimusDomini(true);
        usucapiao.setPosseMansa(true);
        usucapiao.setPossePassifica(true);
        usucapiao.setPosseIninterrupta(true);
        usucapiao.setAreaProdutiva(true);
        String result = usucapiao.verificaRequisitos();
        assertEquals("false", result);
    }
    
    /**
     * Test of verificaPossibilidade method, of class UsucapiaoJudicialFamiliar.
     */
    @Test
    public void testVerificaPossibilidade6() {
        usucapiao.setAnimusDomini(true);
        usucapiao.setPosseMansa(true);
        usucapiao.setPossePassifica(true);
        usucapiao.setPosseIninterrupta(true);
        usucapiao.setAreaProdutiva(true);
        usucapiao.setImovelRural(true);
        String result = usucapiao.verificaRequisitos();
        assertEquals("false", result);
    }
    
    /**
     * Test of verificaPossibilidade method, of class UsucapiaoJudicialFamiliar.
     */
    @Test
    public void testVerificaPossibilidade7() {
        usucapiao.setAnimusDomini(true);
        usucapiao.setPosseMansa(true);
        usucapiao.setPossePassifica(true);
        usucapiao.setPosseIninterrupta(true);
        usucapiao.setAreaProdutiva(true);
        usucapiao.setImovelRural(true);
        usucapiao.setPessoalidade(true);
        String result = usucapiao.verificaRequisitos();
        assertEquals("false", result);
    }
    
    /**
     * Test of verificaPossibilidade method, of class UsucapiaoJudicialFamiliar.
     */
    @Test
    public void testVerificaPossibilidade8() {
        usucapiao.setAnimusDomini(true);
        usucapiao.setPosseMansa(true);
        usucapiao.setPossePassifica(true);
        usucapiao.setPosseIninterrupta(true);
        usucapiao.setAreaProdutiva(true);
        usucapiao.setImovelRural(true);
        usucapiao.setPessoalidade(true);
        usucapiao.setRegistroDeOutroImovel(true);
        usucapiao.setTamanhoTerreno(51);
        String result = usucapiao.verificaRequisitos();
        assertEquals("false", result);
    }
    
    /**
     * Test of verificaPossibilidade method, of class UsucapiaoJudicialFamiliar.
     */
    @Test
    public void testVerificaPossibilidade9() {
        usucapiao.setAnimusDomini(true);
        usucapiao.setPosseMansa(true);
        usucapiao.setPossePassifica(true);
        usucapiao.setPosseIninterrupta(true);
        usucapiao.setAreaProdutiva(true);
        usucapiao.setImovelRural(true);
        usucapiao.setPessoalidade(true);
        usucapiao.setRegistroDeOutroImovel(true);
        usucapiao.setTamanhoTerreno(50);
        usucapiao.setPrazo(4);
        String result = usucapiao.verificaRequisitos();
        assertEquals("possivel-depois", result);
    }
    
    /**
     * Test of verificaPossibilidade method, of class UsucapiaoJudicialFamiliar.
     */
    @Test
    public void testVerificaPossibilidade10() {
        usucapiao.setAnimusDomini(true);
        usucapiao.setPosseMansa(true);
        usucapiao.setPossePassifica(true);
        usucapiao.setPosseIninterrupta(true);
        usucapiao.setAreaProdutiva(true);
        usucapiao.setImovelRural(true);
        usucapiao.setPessoalidade(true);
        usucapiao.setRegistroDeOutroImovel(true);
        usucapiao.setTamanhoTerreno(50);
        usucapiao.setPrazo(5);
        String result = usucapiao.verificaRequisitos();
        assertEquals("possivel-agora", result);
    }
}
