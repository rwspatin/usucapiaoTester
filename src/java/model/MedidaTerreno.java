package model;
/**
 * 
 */
public class MedidaTerreno {
    private int tamanho;
    private String medidaObtida;
    private String tipoUsucapiao;
    
    public MedidaTerreno(int tamanho, String medidaObtida, String tipoUsucapiao) {
        this.tamanho=tamanho;
        this.medidaObtida=medidaObtida;
        this.tipoUsucapiao=tipoUsucapiao;
    }

    public float tamanhoMetros() {
        if(medidaObtida=="ha"){
            return (float) (tamanho/0.0001);
        }else{                      //cm²
            return (float) (tamanho/10000);
        }
    }

    public float tamanhoHectares() {
        if(medidaObtida=="m"){
            return (float) (tamanho*0.0001);
        }else{                      //cm²
            return (float) (tamanho/100000000);
        }
    }

    public float converter() {
        if(tipoUsucapiao=="rural"){
            return tamanhoHectares();
        }else{
            return tamanhoMetros();
        }
    }

    /**
     * @return the tamanho
     */
    public int getTamanho() {
        return tamanho;
    }

    /**
     * @param tamanho the tamanho to set
     */
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    /**
     * @return the medidaObtida
     */
    public String getMedidaObtida() {
        return medidaObtida;
    }

    /**
     * @param medidaObtida the medidaObtida to set
     */
    public void setMedidaObtida(String medidaObtida) {
        this.medidaObtida = medidaObtida;
    }

    /**
     * @return the tipoUsucapiao
     */
    public String getTipoUsucapiao() {
        return tipoUsucapiao;
    }

    /**
     * @param tipoUsucapiao the tipoUsucapiao to set
     */
    public void setTipoUsucapiao(String tipoUsucapiao) {
        this.tipoUsucapiao = tipoUsucapiao;
    }

}