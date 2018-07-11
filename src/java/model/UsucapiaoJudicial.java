package model;

public abstract class UsucapiaoJudicial extends Usucapiao {

    private boolean posseMansa;
    private boolean possePassifica;
    private boolean posseIninterrupta;

    public UsucapiaoJudicial(boolean animusDomini, int prazo, boolean posseMansa, boolean possePassifica, boolean posseIninterrupta) {
        super(animusDomini, prazo);
        this.posseMansa=posseMansa;
        this.possePassifica=possePassifica;
        this.posseIninterrupta=posseIninterrupta;
    }
    
    public void verificaCessacaoPassificidade() {
        // TODO implement here
    }

    /**
     *
     * @return
     */
    public abstract String verificaPossibilidade();

    /**
     * @return the posseMansa
     */
    public boolean isPosseMansa() {
        return posseMansa;
    }

    /**
     * @param posseMansa the posseMansa to set
     */
    public void setPosseMansa(boolean posseMansa) {
        this.posseMansa = posseMansa;
    }

    /**
     * @return the possePassifica
     */
    public boolean isPossePassifica() {
        return possePassifica;
    }

    /**
     * @param possePassifica the possePassifica to set
     */
    public void setPossePassifica(boolean possePassifica) {
        this.possePassifica = possePassifica;
    }

    /**
     * @return the posseIninterrupta
     */
    public boolean isPosseIninterrupta() {
        return posseIninterrupta;
    }

    /**
     * @param posseIninterrupta the posseIninterrupta to set
     */
    public void setPosseIninterrupta(boolean posseIninterrupta) {
        this.posseIninterrupta = posseIninterrupta;
    }

}