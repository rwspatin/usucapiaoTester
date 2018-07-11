package model;

public class UsucapiaoJudicialExtraordinario extends UsucapiaoJudicial {

    private boolean benfeitorias;

    public UsucapiaoJudicialExtraordinario(boolean animusDomini, int prazo, boolean posseMansa, boolean possePassifica, boolean posseIninterrupta, boolean benfeitorias) {
        super(animusDomini, prazo, posseMansa, possePassifica, posseIninterrupta);
        this.benfeitorias=benfeitorias;
    }

    @Override
    public String verificaRequisitos() {
        if(this.isAnimusDomini()){                                      //1
            if(this.isPosseMansa()){                                    //2
                if(this.isPossePassifica()){                            //3
                    if(this.isPosseIninterrupta()){                     //4
                        if(verificaPossibilidadeParagrafoPrimeiro()){   //5
                            
                            if(this.getPrazo()>=10){                    //6
                                return "10-possivel-agora";             //7
                            }else{
                                return "10-possivel-depois";            //8
                            }
                        }else{
                            if(this.getPrazo()>=15){                    //9
                                return "15-possivel-agora";             //10
                            }else{
                                return "15-possivel-depois";            //11
                            }
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
    }                                                                   //16

    public boolean verificaPossibilidadeParagrafoPrimeiro() {
        if(isBenfeitorias()){                                           //1
            return true;                                                //2
        }else{
            return false;                                               //3
        }
    }                                                                   //4

    @Override
    public String verificaPossibilidade() {
        if(verificaRequisitos().equals("10-possivel-agora")){                   //1
            return "Possivel em seu modo especial, entre o quanto antes";       //2
        }else if(verificaRequisitos().equals("10-possivel-depois")){            //3
            return "Possivel em seu modo especial, aguarde completar 10 anos";  //4
        }else if(verificaRequisitos().equals("15-possivel-agora")){             //5
            return "Possivel em seu modo padrao, entre o quanto antes";         //6
        }else if(verificaRequisitos().equals("15-possivel-depois")){            //7
            return "Possivel em seu modo padrao, aguarde completar 15 anos";    //8
        }else{
            return "Não é possivel";                                            //9
        }
    }                                                                           //10
    /**
     * @return the benfeitorias
     */
    public boolean isBenfeitorias() {
        return benfeitorias;
    }

    /**
     * @param benfeitorias the benfeitorias to set
     */
    public void setBenfeitorias(boolean benfeitorias) {
        this.benfeitorias = benfeitorias;
    }
}