package model;
/**
 * 
 */
public abstract class Usucapiao {

    private boolean animusDomini;
    private int prazo;
    
    public Usucapiao(boolean animusDomini, int prazo) {
        this.animusDomini=animusDomini;
        this.prazo=prazo;
    }
    
    /**
     *
     * @return
     */
    public abstract String verificaRequisitos();

    /**
     * @return the animusDomini
     */
    public boolean isAnimusDomini() {
        return animusDomini;
    }

    /**
     * @param animusDomini the animusDomini to set
     */
    public void setAnimusDomini(boolean animusDomini) {
        this.animusDomini = animusDomini;
    }

    /**
     * @return the prazo
     */
    public int getPrazo() {
        return prazo;
    }

    /**
     * @param prazo the prazo to set
     */
    public void setPrazo(int prazo) {
        this.prazo = prazo;
    }

}