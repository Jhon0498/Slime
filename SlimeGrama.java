public class SlimeGrama extends SlimeTerrestre {
    private int defesaGrama;

    public SlimeGrama(String nome, int nivelMalemolencia, int defesa, int defesaTerrestre, int defesaGrama) {
        super(nome, nivelMalemolencia, defesa, defesaTerrestre);
        this.defesaGrama = defesaGrama;
    }

    public int getDefesaGrama() {
        return defesaGrama;
    }

    public void setDefesaGrama(int defesaGrama) {
        this.defesaGrama = defesaGrama;
    }
}
