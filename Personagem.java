public abstract class Personagem {
    private String nome;
    private int vitalidade = 100;
    private Jogo jogo;


    public static void aplicarGolpeNormal(Personagem) {
        vitalidade = vitalidade - 10;
    }

    public abstract void aplicarGolpeEspecial();


    


    /**
     * @return String return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return int return the vitalidade
     */
    public int getVitalidade() {
        return vitalidade;
    }

    /**
     * @param vitalidade the vitalidade to set
     */
    public void setVitalidade(int vitalidade) {
        this.vitalidade = vitalidade;
    }

    /**
     * @return Jogo return the jogo
     */
    public Jogo getJogo() {
        return jogo;
    }

    /**
     * @param jogo the jogo to set
     */
    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }




}
