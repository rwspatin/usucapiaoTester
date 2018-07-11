/*
 * AlunoController.java
 *
 * Created on September 21, 2006, 3:46 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package controller;

import model.UsucapiaoJudicialUrbano;

public class UsucapiaoJudicialUrbanoController {
    
    UsucapiaoJudicialUrbano objUsucapiao;
    public UsucapiaoJudicialUrbanoController() {
    }
    
    public boolean Instancia(boolean animusDomini, int prazo, boolean posseMansa, boolean possePassifica, boolean posseIninterrupta, int tamanhoTerreno, boolean pessoalidade, boolean imovelUrbano, boolean registroDeOutroImovel){
        try{
            this.objUsucapiao = new UsucapiaoJudicialUrbano(animusDomini, prazo, posseMansa, possePassifica, posseIninterrupta, tamanhoTerreno, pessoalidade, imovelUrbano, registroDeOutroImovel);
            return true;
        }catch(Exception err){
            return false;
        }
    }
    
    public String Verifica(){
        return objUsucapiao.verificaRequisitos();
    }
}
