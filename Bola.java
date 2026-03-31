import java.util.Scanner;

public class Bola {
    String cor;
    double circun;
    String material;
    public static Scanner scanner = new Scanner(System.in);

    public Bola(String cor, double circun, String material) {
        this.cor = cor;
        this.circun = circun;
        this.material = material;
    }
    public void trocarCor(){
        System.out.print("Para qual cor voce deseja mudar?: ");
        String novaCor = scanner.nextLine();
        this.cor = novaCor;
        System.out.println("Cor alterada");
    }
    public void mostraCor(){
        System.out.println("A cor da bola é "+ this.cor);
    }
}
