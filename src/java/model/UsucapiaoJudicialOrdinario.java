package model;

public class UsucapiaoJudicialOrdinario extends UsucapiaoJudicial {

    private boolean justoTitulo;
    private boolean boaFe;
    private boolean pessoalidade;
    private boolean registroAnterior;

    public UsucapiaoJudicialOrdinario(boolean animusDomini, int prazo, boolean posseMansa, boolean possePassifica, boolean posseIninterrupta, boolean justoTitulo, boolean boaFe, boolean pessoalidade, boolean registroAnterior) {
        super(animusDomini, prazo, posseMansa, possePassifica, posseIninterrupta);
        this.justoTitulo = justoTitulo;
        this.boaFe = boaFe;
        this.pessoalidade = pessoalidade;
        this.registroAnterior = registroAnterior;
    }
    
    
    
    public boolean verificaPossibilidadeParagrafoUnico() {
        if(this.isPessoalidade()){                                              //1
            if(this.isRegistroAnterior()){                                      //2
                return true;                                                    //3
            }else{
                return false;                                                   //4
            }
        }else{
            return false;                                                       //5
        }
    }                                                                           //6

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

    @Override
    public String verificaRequisitos() {
        if(this.isAnimusDomini()){                                              //1
            if(this.isPosseMansa()){                                            //2
                if(this.isPossePassifica()){                                    //3
                    if(this.isPosseIninterrupta()){                             //4
                        if(verificaPossibilidadeParagrafoUnico()){              //5
                            
                            if(this.getPrazo()>=5){                             //6
                                return "10-possivel-agora";                     //7
                            }else{
                                return "10-possivel-depois";                    //8
                            }
                        }else{
                            if(this.getPrazo()>=10){                            //9
                                return "15-possivel-agora";                     //10
                            }else{
                                return "15-possivel-depois";                    //11
                            }
                        }
                    }else{
                        return "false";                                         //12
                    }
                }else{
                    return "false";                                             //13
                }   
            }else{
                return "false";                                                 //14
            }
        }else{
            return "false";                                                     //15
        }
    }                                                                           //16

    /**
     * @return the justoTitulo
     */
    public boolean isJustoTitulo() {
        return justoTitulo;
    }

    /**
     * @param justoTitulo the justoTitulo to set
     */
    public void setJustoTitulo(boolean justoTitulo) {
        this.justoTitulo = justoTitulo;
    }

    /**
     * @return the boaFe
     */
    public boolean isBoaFe() {
        return boaFe;
    }

    /**
     * @param boaFe the boaFe to set
     */
    public void setBoaFe(boolean boaFe) {
        this.boaFe = boaFe;
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
     * @return the registroAnterior
     */
    public boolean isRegistroAnterior() {
        return registroAnterior;
    }

    /**
     * @param registroAnterior the registroAnterior to set
     */
    public void setRegistroAnterior(boolean registroAnterior) {
        this.registroAnterior = registroAnterior;
    }

}