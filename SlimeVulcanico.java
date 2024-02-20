public class SlimeVulcanico extends SlimeTerrestre {
    private int defesaVulcanico;

    public SlimeVulcanico(String nome, int nivelMalemolencia, int defesa, int defesaTerrestre, int defesaVulcanico) {
        super(nome, nivelMalemolencia, defesa, defesaTerrestre);
        this.defesaVulcanico = defesaVulcanico;
    }

    public int getDefesaVulcanico() {
        return defesaVulcanico;
    }

    public void setDefesaVulcanico(int defesaVulcanico) {
        this.defesaVulcanico = defesaVulcanico;
    }
}
