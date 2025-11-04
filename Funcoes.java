import java.util.Scanner;

public class Funcoes {
    public static void PercorrerArvore(No node, Scanner ler) {
        if (node.jogo != null) {
            System.out.println("Recomendação de jogos: " + node.jogo);
            return;
        }
        else{
            System.out.println(node.questao + "S ou N");
            String resposta = ler.nextLine().trim().toUpperCase();
            switch (resposta) {
                case "S":
                    PercorrerArvore(node.sim, ler);
                    break;
                case "N":
                    PercorrerArvore(node.nao, ler);
                    break;
                default:
                    System.out.println("Resposta inválida!");
                    PercorrerArvore(node, ler);
                    break;
            }
        }
    }
    
 
    public static void Recomendar(No raiz, No pc, No console, Scanner ler) {
        System.out.print(raiz.questao + " PC ou Console: ");
        String resposta = ler.nextLine().trim().toLowerCase();
        switch (resposta) {
            case "pc":
                PercorrerArvore(pc, ler);
                break;
            case "console":
                PercorrerArvore(console, ler);
                break;
            default:
                System.out.println("Resposta inválida!");
                Recomendar(raiz, pc, console, ler);
                break;
        }
    } 
    
}

