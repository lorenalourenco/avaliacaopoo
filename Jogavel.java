public class Jogavel extends Personagem implements Controle{
    private int nivel;
    
    @Override
    public void aplicarGolpeEspecial(Personagem){
        vitalidade = vitalidade - nivel * 10;
    }

    public void botaoA(){
        aplicarGolpeNormal();
    }

    public void botaoB(){
        aplicarGolpeEspecial();
    }


    /**
     * @return int return the nivel
     */
    public int getNivel() {
        return nivel;
    }

    /**
     * @param nivel the nivel to set
     */
    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

}
