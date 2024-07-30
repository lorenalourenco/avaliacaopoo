public class NaoJogavel {
    private boolean aliado;

    @Override
    public void aplicarGolpeEspecial(adversario){
        if (dificuldade == "easy"){
            vitalidade = vitalidade - 20;
        }if (dificuldade == "medium") {
            vitalidade = vitalidade - 30;
        } else {
            vitalidade = vitalidade - 40;
        }
    }

    /**
     * @return boolean return the aliado
     */
    public boolean isAliado() {
        return aliado;
    }

    /**
     * @param aliado the aliado to set
     */
    public void setAliado(boolean aliado) {
        this.aliado = aliado;
    }

}
