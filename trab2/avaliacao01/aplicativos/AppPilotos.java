package aplicativos;

import java.io.IOException;
import java.util.Scanner;

import classes.Pessoa;

public class AppPilotos {
    private static final Integer nome = null;
    private static final int Cpf1 = 0;
    private static int MAX_ELEMENTOS_NOVO = 0;

    public static void main(String[] args, String Cpf, Pessoa[] arryTemp) throws InterruptedException, IOException {
        final int MAX_ELEMENTOS = 20;
        int opcao, qtdCadastrados = 0;
        Pessoa[] pilotos = new Pessoa[MAX_ELEMENTOS];
        Scanner in = new Scanner(System.in);

        do {
            System.out.println("\n****\nMENU\n****\n");
            System.out.println("1 - Cadastrar piloto");
            System.out.println("2 - Listar pilotos cadastrados");
            System.out.println("3 - Localizar piloto pelo CPF");
            System.out.println("4 - Aumentar espaço de armazenamento");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");

            opcao = in.nextInt();
            in.nextLine(); // Tira o ENTER que ficou na entrada na instrução anterior

            if (opcao == 1) {
                // Se não tem mais espaço no vetor, caio fora

                System.out.println("\ncpf");
                in.nextInt();
                in.nextLine();

                System.out.println("\nNome");
                Cpf = in.nextLine();

                System.out.print("\nMatricula");
                    Cpf  = in.nextLine();
                
            
                if (qtdCadastrados == MAX_ELEMENTOS) {
                    System.out.println("\nNão há espaço para cadastrar novos pilotos.");
                    voltarMenu(in);
                    continue;
                }

                //Cadastre seu piloto aqui
                
                System.out.println("Digite o seu nome");
                int nome = in.nextInt();

                System.out.println("Digite o seu CPF");

                System.out.println("\nPiloto cadastrado com sucesso.");
                voltarMenu(in);

                Pessoa p1 = new Pessoa(nome,(int) Cpf1);
                pilotos[ qtdCadastrados] = p1;

                qtdCadastrados ++;

            } else if (opcao == 2) {
                // Se não tem ninguém cadastrado no vetor, caio fora
                if (qtdCadastrados == 0) {
                    System.out.println("\nNão há motoristas cadastrados para exibir.");
                    voltarMenu(in);
                    Pessoa p1 = new Pessoa(nome,(int) Cpf1);
                    pilotos[ qtdCadastrados] = p1;
                    continue;
                }

                // Exiba os pilotos aqui

                voltarMenu(in);
                for(int i = 0; i< qtdCadastrados; i++);{
                    System.out.printf("O nome do Piloto é:"+ pilotos[Cpf1], getCpf()); 
                }
            } else if (opcao == 3) {
                for(int i = 0; i < qtdCadastrados; i++){
                    System.out.println("Informe o CPF:");
                   int CPF = in.nextInt();
                    System.out.println("O CPF do piloto é : " + pilotos[i].getCpf());

                    for(int ii; i >= qtdCadastrados; i++);{
                    if(CPF == pilotos[i].getModelo()){
                    System.out.println("O CPF do piloto é " + pilotos[i].getCpf());
                    }  
                        
                    }
                }
            } else if (opcao == 4) {
                System.out.println("Digite o novo tamnaho do armazenamento");
                int valorDigitado = in.nextInt();

                if(valorDigitado > MAX_ELEMENTOS_NOVO){

                    MAX_ELEMENTOS_NOVO = valorDigitado;

                    arryTemp = new Pessoa[MAX_ELEMENTOS_NOVO];
                    for (int i = 0; i < pilotos.length; i++){
                    arryTemp[i] = pilotos[i];
                    }
                    pilotos = new Pessoa[MAX_ELEMENTOS_NOVO];

                    for(int i =0; i< arryTemp.length; i++){
                    pilotos[i] = arryTemp[i];


                    System.out.println("O tamanho atual do arry foi atualizado com sucesso");
                    }

                }


            }
            else if (opcao != 0) {
                System.out.println("\nOpção inválida!");
            }
        } while (opcao != 0);

        System.out.println("Fim do programa!");

        in.close();
    }

    private static Object getCpf() {
        return null;
    }

    private static void voltarMenu(Scanner in) throws InterruptedException, IOException {
        System.out.println("\nPressione ENTER para voltar ao menu.");
        in.nextLine();

        // Limpa toda a tela, deixando novamente apenas o menu
        if (System.getProperty("os.name").contains("Windows"))
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        else
            System.out.print("\033[H\033[2J");
        
        System.out.flush();
    }
}