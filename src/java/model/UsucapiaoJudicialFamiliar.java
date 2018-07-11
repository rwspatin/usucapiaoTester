package model;

public class UsucapiaoJudicialFamiliar extends UsucapiaoJudicial {

    private boolean conjugeAbandonou;
    private boolean companheiroAbandonou;
    private boolean registroDeOutroImovel;
    private boolean bemComumCasal;
    private int tamanhoTerreno;
    
    public UsucapiaoJudicialFamiliar(boolean animusDomini, int prazo, boolean posseMansa, boolean possePassifica, boolean posseIninterrupta, boolean conjugeAbandonou, boolean companheiroAbandonou, boolean registroDeOutroImovel, boolean bemComumCasal, int tamanhoTerreno) {
        super(animusDomini, prazo, posseMansa, possePassifica, posseIninterrupta);
        this.conjugeAbandonou = conjugeAbandonou;
        this.companheiroAbandonou = companheiroAbandonou;
        this.registroDeOutroImovel = registroDeOutroImovel;
        this.bemComumCasal = bemComumCasal;
        this.tamanhoTerreno = tamanhoTerreno;
    }
    

    @Override
    public String verificaPossibilidade() {
        if(verificaRequisitos().equals("possivel-agora")){
            return "Possivel, entre o quanto antes";
        }else if(verificaRequisitos().equals("possivel-depois")){
            return "Possivel, entre em 2 anos";
        }else{
            return "Não é possivel";
        }
    }

    @Override
    public String verificaRequisitos() {
    if(isAnimusDomini()){                                                      //1
            if(isPosseMansa()){                                                //2
                if(isPossePassifica()){                                        //3
                    if(isPosseIninterrupta()){                                 //4
                        if(bemComumCasal){                                     //6
                            if(companheiroAbandonou||conjugeAbandonou){   //7
                                if(registroDeOutroImovel){                     //8
                                    if(tamanhoTerreno<=250){                   //9
                                        if(getPrazo()>=2){
                                            return "possivel-agora";
                                        }else{
                                            return "possivel-depois";
                                        }                          //10
                                    }else{
                                        return "false";                             //11
                                    }
                                }else{
                                    return "false";                                 //12
                                }
                            }else{
                                return "false";                                     //13
                            }
                        }else{
                            return "false";                                         //14
                        }
                    }else{
                        return "false";                                             //15
                    }
                }else{
                    return "false";                                                 //16
                }   
            }else{
                return "false";                                                     //17
            }
        }else{
            return "false";                                                         //18
        }
    }                                                                               //19

    /**
     * @return the conjugeAbandonou
     */
    public boolean isConjugeAbandonou() {
        return conjugeAbandonou;
    }

    /**
     * @param conjugeAbandonou the conjugeAbandonou to set
     */
    public void setConjugeAbandonou(boolean conjugeAbandonou) {
        this.conjugeAbandonou = conjugeAbandonou;
    }

    /**
     * @return the companheiroAbandonou
     */
    public boolean isCompanheiroAbandonou() {
        return companheiroAbandonou;
    }

    /**
     * @param companheiroAbandonou the companheiroAbandonou to set
     */
    public void setCompanheiroAbandonou(boolean companheiroAbandonou) {
        this.companheiroAbandonou = companheiroAbandonou;
    }

    /**
     * @return the registroDeOutroImovel
     */
    public boolean isRegistroDeOutroImovel() {
        return registroDeOutroImovel;
    }

    /**
     * @param registroDeOutroImovel the registroDeOutroImovel to set
     */
    public void setRegistroDeOutroImovel(boolean registroDeOutroImovel) {
        this.registroDeOutroImovel = registroDeOutroImovel;
    }

    /**
     * @return the bemComumCasal
     */
    public boolean isBemComumCasal() {
        return bemComumCasal;
    }

    /**
     * @param bemComumCasal the bemComumCasal to set
     */
    public void setBemComumCasal(boolean bemComumCasal) {
        this.bemComumCasal = bemComumCasal;
    }

    /**
     * @return the tamanhoTerreno
     */
    public int getTamanhoTerreno() {
        return tamanhoTerreno;
    }

    /**
     * @param tamanhoTerreno the tamanhoTerreno to set
     */
    public void setTamanhoTerreno(int tamanhoTerreno) {
        this.tamanhoTerreno = tamanhoTerreno;
    }

}