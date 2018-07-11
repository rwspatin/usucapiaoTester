/*
 * AlunoController.java
 *
 * Created on September 21, 2006, 3:46 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package controller;

import model.UsucapiaoJudicialFamiliar;

public class UsucapiaoJudicialFamiliarController {
    
    UsucapiaoJudicialFamiliar objUsucapiao;
    public UsucapiaoJudicialFamiliarController() {
    }
    
    public boolean Instancia(boolean animusDomini, int prazo, boolean posseMansa, boolean possePassifica, boolean posseIninterrupta, boolean conjugeAbandonou, boolean companheiroAbandonou, boolean registroDeOutroImovel, boolean bemComumCasal, int tamanhoTerreno){
        try{
            this.objUsucapiao = new UsucapiaoJudicialFamiliar(animusDomini, prazo, posseMansa, possePassifica, posseIninterrupta, conjugeAbandonou, companheiroAbandonou, registroDeOutroImovel, bemComumCasal, tamanhoTerreno);
            return true;
        }catch(Exception err){
            return false;
        }
    }
    
    public String Verifica(){
        return objUsucapiao.verificaRequisitos();
    }
}
