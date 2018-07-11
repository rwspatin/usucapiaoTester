/*
 * AlunoController.java
 *
 * Created on September 21, 2006, 3:46 AM
 *
 * To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */

package controller;

import model.UsucapiaoExtrajudicial;

public class UsucapiaoExtrajudicialController {
    
    UsucapiaoExtrajudicial objUsucapiao;
    public UsucapiaoExtrajudicialController() {
    }
    
    public boolean Instancia(boolean animusDomini, int prazo, boolean consenso){
        try{
            this.objUsucapiao = new UsucapiaoExtrajudicial(animusDomini, prazo, consenso);
            return true;
        }catch(Exception err){
            return false;
        }
    }
    
    public String Verifica(){
        return objUsucapiao.verificaRequisitos();
    }
}
