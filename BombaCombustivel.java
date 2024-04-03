package aula04;

class BombaCombustivel {
	private double quantidade;

    public BombaCombustivel(double quantidadeInicial) {
        this.quantidade = quantidadeInicial;
    }

    public void abastecer(double quantidadeAbastecida) {
        quantidade += Math.max(quantidadeAbastecida, 0); // Adiciona a quantidade abastecida, ignorando valores negativos
        System.out.println("Abastecendo " + quantidadeAbastecida + " litros.");
    }

    public double abastecerCarro(double quantidadeAbastecidaCarro) {
        double quantidadeAbastecida = Math.min(quantidadeAbastecidaCarro, quantidade); // Abastece até o máximo disponível na bomba
        quantidade -= quantidadeAbastecida;
        return quantidadeAbastecida; // Retorna a quantidade efetivamente abastecida
    }

    public double mostrarQuantidadeRestante() {
        System.out.println("Quantidade de combustível restante na bomba: " + quantidade + " litros.");
        return quantidade;
    }

    public static void main(String[] args) {
        BombaCombustivel bomba = new BombaCombustivel(100);

        bomba.abastecer(50);
        bomba.mostrarQuantidadeRestante();

        double quantidadeAbastecidaCarro = bomba.abastecerCarro(30);
        System.out.println("Quantidade de combustível abastecida no carro: " + quantidadeAbastecidaCarro + " litros.");

        bomba.mostrarQuantidadeRestante();
    }
}
