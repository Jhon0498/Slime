public class Slime {
    private String nome;
    private int nivelMalemolencia;
    private int defesa;

    public Slime(String nome, int nivelMalemolencia, int defesa) {
        this.nome = nome;
        this.nivelMalemolencia = nivelMalemolencia;
        this.defesa = defesa;
    }

    public String getNome() {
        return nome;
    }

    public int getNivelMalemolencia() {
        return nivelMalemolencia;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNivelMalemolencia(int nivelMalemolencia) {
        this.nivelMalemolencia = nivelMalemolencia;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
}
