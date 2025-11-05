import java.util.Scanner;
public class SistemaDeRecomendacao {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        No raiz = new No("Qual plataforma você prefere?");

        // No PC
        No pc = new No("Você prefere um estilo realista? ");
        No pcRealista = new No("Você prefere jogar sozinho?");
        No pcSolo = new No("Você prefere jogos com foco em modo história?");
        No pcHistoria = new No("Gosta de tomar decisões que afetam a narrativa?");
        pcHistoria.sim = new No("The Witcher 3 ou Disco Elysium", true);
        pcHistoria.nao = new No("Tomb Raider ou Firewatch", true);

        No pcAcao = new No("Prefere jogos de Ação em Mundo aberto?");
        pcAcao.sim = new No("Skyrim ou GTA V", true);
        pcAcao.nao = new No("Doom Eternal ou COntrol", true);
        
        pcSolo.sim = pcHistoria;
        pcSolo.nao = pcAcao;
        
        No pcMulti = new No("Prefere Jogos de Cooperação?");
        No pcCooperativo = new No("Gosta de jogos casuais?");
        pcCooperativo.sim = new No("Overcooked ou Stardew Valley", true);
        pcCooperativo.nao = new No("*Payday 2 ou Deep Rock Galactic", true);

        No pcCompetitivo = new No("Gosta de jogos de tiro?");
        pcCompetitivo.sim = new No("Play Unknown's Battleground (PUBG) ou Counter Strike 2 (CS 2)");
        pcCompetitivo.nao = new No("StarCraft II ou Age of Empires IV", true);

        pcMulti.sim = pcCooperativo;
        pcMulti.nao = pcCompetitivo;

        pcRealista.sim = pcSolo;
        pcRealista.nao = pcMulti;
        
        No pcEstilizado = new No("Você prefere jogar sozinho?");
        No pcSolo_Est = new No("Gosta de jogos modo História?");
        No pcHistoria_Est = new No("Gosta de tomar decisões que afetam a história?");
        pcHistoria_Est.sim = new No("Undertale ou Life is Strange", true);
        pcHistoria_Est.nao = new No("Ori and the Blind Forest ou Hollow Knight", true);

        No pcAcao_Est = new No("Você gostas de jogos de ação lineares?");
        pcAcao_Est.sim = new No("Celeste ou Dead Cells", true);
        pcAcao_Est.nao = new No("Minecraft ou Terraria", true);

        pcSolo_Est.sim = pcHistoria_Est;
        pcSolo_Est.nao = pcAcao_Est;

        No pcMulti_Est = new No("Gosta de jogos competitivos?");
        No pcCompetitivo_Est = new No("Prefere jogos de estratégia?");
        pcCompetitivo_Est.sim = new No("Civilization VI e League of Legends (LOL)", true);
        pcCompetitivo_Est.nao = new No("Valorant ou Fortnite", true);

        No pcCooperativo_Est = new No("Prefere jogos desafiadores?");
        pcCooperativo_Est.sim = new No("Cuphead ou Don't Starve Together", true);
        pcCooperativo_Est.nao = new No("Lovers in a Dangerous Spacetime ou Moving Out", true);

        pcMulti_Est.sim = pcCompetitivo_Est;
        pcMulti_Est.nao = pcCooperativo_Est;

        pcEstilizado.sim = pcSolo_Est;
        pcEstilizado.nao = pcMulti_Est;

        pc.sim = pcRealista;
        pc.nao = pcEstilizado;
        //Fim do No Pc

        //No Console
        No console = new No("Você prefere um visual estilizado? ");
        No consoleEstilizado = new No("Você prefere jogar com outras pessoas?");
        No consoleMulti = new No("Você prefere jogos competitivos?");
        No consoleCompetitivo = new No("Você gosta de jogos de luta? ");
        consoleCompetitivo.sim = new No("Tekken 6 ou Street Fighter", true);
        consoleCompetitivo.nao = new No("Fortnite ou Splatoon", true);

        No consoleCooperativo = new No("Prefere jogos desafiadores? ");
        consoleCooperativo.sim = new No("Cuphead ou Overcoocked", true);
        consoleCooperativo.nao = new No("Super Mario Party ou It Takes Two", true);

        consoleMulti.sim = consoleCompetitivo;
        consoleMulti.nao = consoleCooperativo;

        No consoleSolo = new No("Você gosta de jogos de aventura? ");
        No consoleAventura = new No("Gosta de jogos lineares? ");
        consoleAventura.sim = new No("Crash Bandicoot ou Rayman Legends", true);
        consoleAventura.nao = new No("Genshim Impact ou Zelda Tears of The Kingdom", true);

        No consoleHistoria = new No("Gosta de interferir no fim da história? ");
        consoleHistoria.sim = new No("The Walking Dead ou Oxenfree", true);
        consoleHistoria.nao = new No("Ori and the Blind Forest ou Limbo", true);

        consoleEstilizado.sim = consoleMulti;
        consoleEstilizado.nao = consoleSolo;

        No consoleRealista = new No("Você prefere jogar sozinho? ");
        No consoleSolo_Rea = new No("Você prefere jogos de terror? ");
        No consoleTerror = new No("Gosta de terror psicológico? ");
        consoleTerror.sim = new No("Resident Evil: Requiem ou Sillent Hill 2", true);
        consoleTerror.nao = new No("Outlast ou  Alan Wake 2", true);
        
        No consoleAventura_Rea = new No("Gosta de jogos de aventura mundo aberto? ");
        consoleAventura_Rea.sim = new No("Farcry 3 ou Red Dead Redemption 2", true);
        consoleAventura_Rea.nao= new No("The Last of Us 2 ou God of War", true);

        consoleSolo_Rea.sim = consoleTerror;
        consoleSolo_Rea.nao = consoleAventura_Rea;

        No consoleMulti_Rea = new No("Prefere jogos de cooperação? ");
        No consoleCooperativo_Rea = new No("Gosta de jogos de esporte? ");
        consoleCooperativo_Rea.sim = new No("Bomba Patch 2026 ou NBA 2K25", true);
        consoleCooperativo_Rea.nao = new No("Portal 2 ou The Talos Principle 2", true);

        No consoleCompetitivo_Rea = new No("Gosta de jogos de tiro? ");
        consoleCompetitivo_Rea.sim = new No("Battlefield ou PUBG", true);
        consoleCompetitivo_Rea.nao = new No("Mortal Kombat 1 ou Injustice 2", true);


        consoleRealista.sim = consoleSolo_Rea;
        consoleRealista.nao = consoleMulti_Rea;

        console.sim = consoleEstilizado;
        console.nao = consoleRealista;
        // fim do Console

        raiz.sim = pc;
        raiz.nao = console;

    
        Funcoes.Recomendar(raiz, pc, console, ler);
        
        
    }
}
