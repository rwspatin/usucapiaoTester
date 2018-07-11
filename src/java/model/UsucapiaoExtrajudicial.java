package model;

public class UsucapiaoExtrajudicial extends Usucapiao {

    private boolean consenso;

    public UsucapiaoExtrajudicial(boolean animusDomini, int prazo, boolean consenso) {
        super(animusDomini, prazo);
        this.consenso=consenso;
    }
    
    public void VerificaImpugnacao() {
        // TODO implement here
    }

    public void VerificaFazenda() {
        // TODO implement here
    }

    @Override
    public String verificaRequisitos() {
        if(this.isAnimusDomini()){                                      //1
            if(isConsenso()){                                           //2
                return "É possível entrar com usucapiao no cartório";   //3
            }else{
                return "Não cabe";                                      //4
            }
        }else{
            return "Não cabe";                                          //5
        }
    }                                                                   //6

    /**
     * @return the consenso
     */
    public boolean isConsenso() {
        return consenso;
    }

    /**
     * @param consenso the consenso to set
     */
    public void setConsenso(boolean consenso) {
        this.consenso = consenso;
    }

}