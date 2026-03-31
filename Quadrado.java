import java.util.Scanner;

public class Quadrado{
    double tamanhoLado;

    public Quadrado(double tamanhoLado) {
        this.tamanhoLado = tamanhoLado;
    }

    Scanner scanner = new Scanner(System.in);
    public void mudarLado(){
        System.out.print("Qual o tamanho do lado desse quadrado?: ");
        double novoLado = scanner.nextDouble();
        this.tamanhoLado = novoLado;
        System.out.println("Tamanho alterado para: " +this.tamanhoLado+ " sua área é de: " +(this.tamanhoLado * this.tamanhoLado));
    }


}
