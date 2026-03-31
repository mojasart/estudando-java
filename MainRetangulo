import java.util.Scanner;
public class MainRetangulo
{

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Retangulo ret = new Retangulo(0, 0);
        double areaComodo = ret.criarComodo();
        double areaLadrilho = ret.calcularArea();
        ret.calculosMatematicos(areaComodo, areaLadrilho);
        System.out.print("Qual o comprimento de cada peça de rodapé?: ");
        double comprimentoPeca = scanner.nextDouble();
        double perimetroComodo = (ret.largura * 2) + (ret.comprimento * 2);
        ret.outrosCalculos(perimetroComodo, comprimentoPeca);
    }
}
