package model;

public class UsucapiaoJudicialRural extends UsucapiaoJudicial {

    private int tamanhoTerreno;
    private boolean pessoalidade;
    private boolean areaProdutiva;
    private boolean imovelRural;
    private boolean registroDeOutroImovel;

    public UsucapiaoJudicialRural(boolean animusDomini, int prazo, boolean posseMansa, boolean possePassifica, boolean posseIninterrupta, int tamanhoTerreno, boolean pessoalidade, boolean areaProdutiva, boolean imovelRural, boolean registroDeOutroImovel) {
        super(animusDomini, prazo, posseMansa, possePassifica, posseIninterrupta);
        this.tamanhoTerreno = tamanhoTerreno;
        this.pessoalidade = pessoalidade;
        this.areaProdutiva = areaProdutiva;
        this.imovelRural = imovelRural;
        this.registroDeOutroImovel = registroDeOutroImovel;
    }

    @Override
    public String verificaPossibilidade() {
        if(verificaRequisitos().equals("possivel-agora")){
            return "Possivel, entre o quanto antes";
        }else if(verificaRequisitos().equals("possivel-depois")){
            return "Possivel, entre em 5 anos";
        }else{
            return "Não é possivel";
        }
    }

    @Override
    public String verificaRequisitos() {
    if(this.isAnimusDomini()){                                                      //1
            if(this.isPosseMansa()){                                                //2
                if(this.isPossePassifica()){                                        //3
                    if(this.isPosseIninterrupta()){                                 //4
                       if(this.isAreaProdutiva()){                                  //5
                           if(this.isImovelRural()){                                //6
                               if(this.isPessoalidade()){                           //7
                                   if(this.isRegistroDeOutroImovel()){              //8
                                       if(this.getTamanhoTerreno()<=50){            //9
                                           if(this.getPrazo()>=5){                  //10
                                               return "possivel-agora";             //11
                                           }else{
                                               return "possivel-depois";            //12
                                           }
                                       }else{
                                           return "false";                          //13
                                       }
                                   }else{
                                       return "false";                              //14
                                   }
                               }else{
                                    return "false";                                 //15
                               }
                           }else{
                               return "false";                                      //16
                           }
                       }else{
                           return "false";                                          //17
                       }
                    }else{
                        return "false";                                             //18
                    }
                }else{
                    return "false";                                                 //19
                }   
            }else{
                return "false";                                                     //20
            }
        }else{
            return "false";                                                         //21
        }
    }                                                                               //22

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

    /**
     * @return the pessoalidade
     */
    public boolean isPessoalidade() {
        return pessoalidade;
    }

    /**
     * @param pessoalidade the pessoalidade to set
     */
    public void setPessoalidade(boolean pessoalidade) {
        this.pessoalidade = pessoalidade;
    }

    /**
     * @return the areaProdutiva
     */
    public boolean isAreaProdutiva() {
        return areaProdutiva;
    }

    /**
     * @param areaProdutiva the areaProdutiva to set
     */
    public void setAreaProdutiva(boolean areaProdutiva) {
        this.areaProdutiva = areaProdutiva;
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
     * @return the imovelRural
     */
    public boolean isImovelRural() {
        return imovelRural;
    }

    /**
     * @param imovelRural the imovelRural to set
     */
    public void setImovelRural(boolean imovelRural) {
        this.imovelRural = imovelRural;
    }

}