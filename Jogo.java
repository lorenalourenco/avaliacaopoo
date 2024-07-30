import java.util.ArrayList;

public class Jogo {
    private String dificuldade;
    private ArrayList<Personagem> listaPersonagens;

    public void addJogador(Personagem){
        listaPersonagens = listaPersonagens + nome;
    }

    public void removeJogador(Personagem){
        listaPersonagens = listaPersonagens - nome;
    }

    /**
     * @return String return the dificuldade
     */
    public String getDificuldade() {
        return dificuldade;
    }

    /**
     * @param dificuldade the dificuldade to set
     */
    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    /**
     * @return ArrayList<Personagem> return the listaPersonagens
     */
    public ArrayList<Personagem> getListaPersonagens() {
        return listaPersonagens;
    }

    /**
     * @param listaPersonagens the listaPersonagens to set
     */
    public void setListaPersonagens(ArrayList<Personagem> listaPersonagens) {
        this.listaPersonagens = listaPersonagens;
    }

}
