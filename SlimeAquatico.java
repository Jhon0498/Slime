public class SlimeAquatico extends Slime {
    private int defesaAgua;

    public SlimeAquatico(String nome, int nivelMalemolencia, int defesa, int defesaAgua) {
        super(nome, nivelMalemolencia, defesa);
        this.defesaAgua = defesaAgua;
    }

    public int getDefesaAgua() {
        return defesaAgua;
    }

    public void setDefesaAgua(int defesaAgua) {
        this.defesaAgua = defesaAgua;
    }
}
