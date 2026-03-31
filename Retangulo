import java.util.Scanner;

public class Retangulo {
    double base;
    double altura;
    double largura;
    double comprimento;
    Scanner scanner = new Scanner(System.in);

    public Retangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void criarLadrilhosRetagulares(){
        System.out.println("Só são permitidos retangulos (por algum motivo)");
        System.out.print("Qual a base do seu retangulo?:" );
        double novaBase = scanner.nextDouble();
        this.base = novaBase;
        System.out.print("Qual a altura de sua base?: ");
        double novaAltura = scanner.nextDouble();
        this.altura = novaAltura;
        if (this.base == this.altura){
            System.out.println("Isso não é um retangulo! Atente-se!");
        } else {
            System.out.println("Valores definidos!");
        }
    }
    public void mostrarValores(){
        System.out.println("O valor da base do retangulo é de: " +this.base+ " e o valor da altura do retangulo é de: " +this.altura);
    }
    public double calcularArea(){
        double areaLadrilho = this.altura * this.base;
        System.out.println("A área do ladrilho é de: " +areaLadrilho);
        return areaLadrilho;
    }
    public double criarComodo(){
        System.out.print("Qual o comprimento do seu comodo?: ");
        largura = scanner.nextDouble();
        System.out.print("E sua largura?: ");
        comprimento = scanner.nextDouble();
        System.out.println("");
        System.out.println("Agora vamos ver o tamanho dos ladrilhos!");
        System.out.println("");
        double areaComodo = largura * comprimento;
        criarLadrilhosRetagulares();
        double perimetroComdo = (largura * 2) + (comprimento *2);
        return areaComodo;
    }
    public double calcularPerimetro(){
        double perimetro = (this.altura * 2) + (this.base * 2);
        System.out.println("O perimetro do retangulo é de: " +perimetro);
        return perimetro;
    }

    public void calculosMatematicos(double areaComodo, double areaLadrilho){
        int quantidadeChao = (int) Math.ceil(areaComodo / areaLadrilho);
        System.out.println("A quantidade necessaria para cobrir o chao de ladrilhos retangulares é de: "+quantidadeChao);
    }
    public void outrosCalculos(double perimetroComodo, double comprimentoPeca){
        int quantidadeRodape = (int) Math.ceil(perimetroComodo / comprimentoPeca);
        System.out.println("A quantidade de rodapés necessária é de: " + quantidadeRodape);
    }
}
