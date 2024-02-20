public class SlimeMaritimo extends SlimeAquatico {
    private int defesaAguaSalgada;

    public SlimeMaritimo(String nome, int nivelMalemolencia, int defesa, int defesaAgua, int defesaAguaSalgada) {
        super(nome, nivelMalemolencia, defesa, defesaAgua);
        this.defesaAguaSalgada = defesaAguaSalgada;
    }

    public int getDefesaAguaSalgada() {
        return defesaAguaSalgada;
    }

    public void setDefesaAguaSalgada(int defesaAguaSalgada) {
        this.defesaAguaSalgada = defesaAguaSalgada;
    }
}
