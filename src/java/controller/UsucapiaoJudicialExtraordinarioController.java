/*
 * AlunoController.java
 *
 * Created on September 21, 2006, 3:46 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package controller;

import model.UsucapiaoJudicialExtraordinario;

public class UsucapiaoJudicialExtraordinarioController {
    
    UsucapiaoJudicialExtraordinario objUsucapiao;
    public UsucapiaoJudicialExtraordinarioController() {
    }
    
    public boolean Instancia(boolean animusDomini, int prazo, boolean posseMansa, boolean possePassifica, boolean posseIninterrupta, boolean benfeitorias){
        try{
            this.objUsucapiao = new UsucapiaoJudicialExtraordinario(animusDomini, prazo, posseMansa, possePassifica, posseIninterrupta, benfeitorias);
            return true;
        }catch(Exception err){
            return false;
        }
    }
    
    public String Verifica(){
        return objUsucapiao.verificaRequisitos();
    }
}
