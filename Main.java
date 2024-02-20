public class Main {
    public static void main(String[] args) {
              Slime slimeBasico = new Slime("Slime Básico", 4, 10);
        SlimeTerrestre slimeTerrestre = new SlimeTerrestre("Slime Terrestre", 4, 10, 12);
        SlimeGrama slimeGrama = new SlimeGrama("Slime Grama", 4, 10, 12, 20);
        SlimeArenoso slimeArenoso = new SlimeArenoso("Slime Arenoso", 1, 10, 12, 25);
        SlimeVulcanico slimeVulcanico = new SlimeVulcanico("Slime Vulcânico", 4, 10, 12, 30);
        SlimeAquatico slimeAquatico = new SlimeAquatico("Slime Aquático", 4, 10, 14);
        SlimeMaritimo slimeMaritimo = new SlimeMaritimo("Slime Marítimo", 4, 10, 14, 40);
        SlimeVenenoso slimeVenenoso = new SlimeVenenoso("Slime Venenoso", 4, 10, 14, 45);

        // Exibir informações sobre os slimes
        System.out.println("Informações sobre os Slimes:");
              exibirInformacoesSlime(slimeBasico);
        exibirInformacoesSlime(slimeTerrestre);
        exibirInformacoesSlime(slimeGrama);
        exibirInformacoesSlime(slimeArenoso);
        exibirInformacoesSlime(slimeVulcanico);
        exibirInformacoesSlime(slimeAquatico);
        exibirInformacoesSlime(slimeMaritimo);
        exibirInformacoesSlime(slimeVenenoso);
    }

    public static void exibirInformacoesSlime(Slime slime) {
        System.out.println("Nome: " + slime.getNome());
        System.out.println("Nível de Malemolência: " + slime.getNivelMalemolencia());
        System.out.println("Defesa: " + slime.getDefesa());

        if (slime instanceof SlimeGrama) {
            System.out.println("Tipo: Grama");
            System.out.println("Defesa de Grama: " + ((SlimeGrama) slime).getDefesaGrama());
        } else if (slime instanceof SlimeArenoso) {
            System.out.println("Tipo: Arenoso");
            System.out.println("Defesa de Areia: " + ((SlimeArenoso) slime).getDefesaAreia());
        } else if (slime instanceof SlimeVulcanico) {
            System.out.println("Tipo: Vulcânico");
            System.out.println("Defesa Vulcânica: " + ((SlimeVulcanico) slime).getDefesaVulcanico());
        } else if (slime instanceof SlimeMaritimo) {
            System.out.println("Tipo: Marítimo");
            System.out.println("Defesa de Água Salgada: " + ((SlimeMaritimo) slime).getDefesaAguaSalgada());
        } else if (slime instanceof SlimeVenenoso) {
            System.out.println("Tipo: Venenoso");
            System.out.println("Defesa de Veneno: " + ((SlimeVenenoso) slime).getDefesaVeneno());
        } else if (slime instanceof SlimeTerrestre) {
            System.out.println("Tipo: Terrestre");
            System.out.println("Defesa Terrestre: " + ((SlimeTerrestre) slime).getDefesaTerrestre());
        } else {
            System.out.println("Tipo: Básico");
        }
        System.out.println();
    }
}
