public class SlimeArenoso extends SlimeTerrestre {
    private int defesaAreia;

    public SlimeArenoso(String nome, int nivelMalemolencia, int defesa, int defesaTerrestre, int defesaAreia) {
        super(nome, nivelMalemolencia, defesa, defesaTerrestre);
        this.defesaAreia = defesaAreia;
    }

    public int getDefesaAreia() {
        return defesaAreia;
    }

    public void setDefesaAreia(int defesaAreia) {
        this.defesaAreia = defesaAreia;
    }
}
