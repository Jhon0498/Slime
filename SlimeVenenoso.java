public class SlimeVenenoso extends SlimeAquatico {
    private int defesaVeneno;

    public SlimeVenenoso(String nome, int nivelMalemolencia, int defesa, int defesaAgua, int defesaVeneno) {
        super(nome, nivelMalemolencia, defesa, defesaAgua);
        this.defesaVeneno = defesaVeneno;
    }

    public int getDefesaVeneno() {
        return defesaVeneno;
    }

    public void setDefesaVeneno(int defesaVeneno) {
        this.defesaVeneno = defesaVeneno;
    }
}
