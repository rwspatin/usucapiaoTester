package model;

public class UsucapiaoJudicialUrbanoColetivo extends UsucapiaoJudicialUrbano {

    public UsucapiaoJudicialUrbanoColetivo(boolean animusDomini, int prazo, boolean posseMansa, boolean possePassifica, boolean posseIninterrupta, int tamanhoTerreno, boolean pessoalidade, boolean imovelUrbano, boolean registroDeOutroImovel) {
        super(animusDomini, prazo, posseMansa, possePassifica, posseIninterrupta, tamanhoTerreno, pessoalidade, imovelUrbano, registroDeOutroImovel);
    }

    public void VerificaLegitimidade() {
        // TODO implement here
    }

    public void VerificaJuncaoCasas() {
        // TODO implement here
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

}