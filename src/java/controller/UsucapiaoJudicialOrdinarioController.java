/*
 * AlunoController.java
 *
 * Created on September 21, 2006, 3:46 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package controller;

import model.UsucapiaoJudicialOrdinario;

public class UsucapiaoJudicialOrdinarioController {
    
    UsucapiaoJudicialOrdinario objUsucapiao;
    public UsucapiaoJudicialOrdinarioController() {
    }
    
    public boolean Instancia(boolean animusDomini, int prazo, boolean posseMansa, boolean possePassifica, boolean posseIninterrupta, boolean justoTitulo, boolean boaFe, boolean pessoalidade, boolean registroAnterior){
        try{
            this.objUsucapiao = new UsucapiaoJudicialOrdinario(animusDomini, prazo, posseMansa, possePassifica, posseIninterrupta, justoTitulo, boaFe, pessoalidade, registroAnterior);
            return true;
        }catch(Exception err){
            return false;
        }
    }
    
    public String Verifica(){
        return objUsucapiao.verificaRequisitos();
    }
}
