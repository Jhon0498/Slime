public class SlimeTerrestre extends Slime {
    private int defesaTerrestre;

    public SlimeTerrestre(String nome, int nivelMalemolencia, int defesa, int defesaTerrestre) {
        super(nome, nivelMalemolencia, defesa);
        this.defesaTerrestre = defesaTerrestre;
    }

    public int getDefesaTerrestre() {
        return defesaTerrestre;
    }

    public void setDefesaTerrestre(int defesaTerrestre) {
        this.defesaTerrestre = defesaTerrestre;
    }
}
