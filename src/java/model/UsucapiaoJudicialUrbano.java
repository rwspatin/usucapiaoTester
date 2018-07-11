package model;

public class UsucapiaoJudicialUrbano extends UsucapiaoJudicial {

    private int tamanhoTerreno;
    private boolean pessoalidade;
    private boolean imovelUrbano;
    private boolean registroDeOutroImovel;

    public UsucapiaoJudicialUrbano(boolean animusDomini, int prazo, boolean posseMansa, boolean possePassifica, boolean posseIninterrupta, int tamanhoTerreno, boolean pessoalidade, boolean imovelUrbano, boolean registroDeOutroImovel) {
        super(animusDomini, prazo, posseMansa, possePassifica, posseIninterrupta);
        this.tamanhoTerreno = tamanhoTerreno;
        this.pessoalidade = pessoalidade;
        this.imovelUrbano = imovelUrbano;
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
                       if(this.isImovelUrbano()){                                   //5
                           if(this.isPessoalidade()){                               //6
                               if(this.isRegistroDeOutroImovel()){                  //7
                                   if(this.getTamanhoTerreno()<=250){               //8
                                       if(this.getPrazo()>=5){                      //9
                                           return "possivel-agora";                 //10
                                       }else{
                                           return "possivel-depois";                //11
                                       }
                                   }else{
                                       return "false";                              //12
                                   }
                               }else{
                                   return "false";                                  //13
                               }
                           }else{
                               return "false";                                      //14
                           }
                       }else{
                           return "false";                                          //15
                       }
                    }else{
                        return "false";                                             //16
                    }
                }else{
                    return "false";                                                 //17
                }   
            }else{
                return "false";                                                     //18
            }
        }else{
            return "false";                                                         //19
        }
    }                                                                               //20

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
     * @return the imovelUrbano
     */
    public boolean isImovelUrbano() {
        return imovelUrbano;
    }

    /**
     * @param imovelUrbano the imovelUrbano to set
     */
    public void setImovelUrbano(boolean imovelUrbano) {
        this.imovelUrbano = imovelUrbano;
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
}