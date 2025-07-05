import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // * VARIAVEIS */

        Scanner Entrada = new Scanner(System.in);
        boolean inicio = true;
        boolean finalizado = false;
        int quant = 0;
        while (true) {

            // * IF / ELSE IF */

            if (finalizado) {
                Entrada.close(); // so serve para boas praticas
            }
            while (!finalizado) {

                if (quant == 5) {
                    System.out.println("Quer saber, vou te liberar desse sofrimento"); // liberar do sofrimento
                    finalizado = true;

                }

                while (!finalizado) {
                    if (inicio) { // começo
                        System.out.println("Na vida de um homem pode acontecer duas coisas");
                        System.out.println("ele é militar? (s/n)"); // interatividade se inicio for Verdadeiro
                    }
                    if (!inicio) {
                        System.out.println("o filho dele é militar? (s/n)"); // interatividade se inicio for Falso
                    }
                    String opcao = Entrada.next().toLowerCase();
                    if (opcao.equals("n")) {
                        System.out.println("Entao tudo bem");
                        finalizado = true;

                    } else if (opcao.equals("s")) {
                        inicio = false;
                        System.out.println("Entao podem acontecer duas coisas");
                        System.out.println("ele vai para a guerra? (s/n)");
                        opcao = Entrada.next().toLowerCase();
                        if (opcao.equals("n")) {
                            System.out.println("Entao tudo bem");
                            finalizado = true;

                        } else if (opcao.equals("s")) {
                            System.out.println("Entao podem acontecer duas coisas");
                            System.out.println("ele vai sair vivo? (s/n)");
                            opcao = Entrada.next().toLowerCase();
                            if (opcao.equals("n")) {
                                System.out.println("Entao tudo bem");
                                finalizado = true;

                            } else if (opcao.equals("s")) {
                                System.out.println("Entao podem acontecer duas coisas");
                                System.out.println("ele vai se ferir? (s/n)");
                                opcao = Entrada.next().toLowerCase();
                                if (opcao.equals("n")) {
                                    System.out.println("Entao tudo bem");
                                    finalizado = true;

                                } else if (opcao.equals("s")) {
                                    System.out.println("Entao podem acontecer duas coisas");
                                    System.out.println("ele é tratado por uma enfermeira? (s/n)");
                                    opcao = Entrada.next().toLowerCase();
                                    if (opcao.equals("n")) {
                                        System.out.println("Entao tudo bem");
                                        finalizado = true;

                                    } else if (opcao.equals("s")) {
                                        System.out.println("Entao podem acontecer duas coisas");
                                        System.out.println("ele se apaixona? (s/n)");
                                        opcao = Entrada.next().toLowerCase();
                                        if (opcao.equals("n")) {
                                            System.out.println("Entao tudo bem");
                                            finalizado = true;

                                        } else if (opcao.equals("s")) {
                                            System.out.println("Entao podem acontecer duas coisas");
                                            System.out.println("ele se casa com ela? (s/n)");
                                            opcao = Entrada.next().toLowerCase();
                                            if (opcao.equals("n")) {
                                                System.out.println("Entao tudo bem");
                                                finalizado = true;

                                            } else if (opcao.equals("s")) {
                                                System.out.println("Entao podem acontecer duas coisas");
                                                System.out.println("ele tem filhos? (s/n)");
                                                opcao = Entrada.next().toLowerCase();
                                                if (opcao.equals("n")) {
                                                    System.out.println("Entao tudo bem");
                                                    finalizado = true;

                                                } else if (opcao.equals("s")) {
                                                    System.out.println("Entao podem acontecer duas coisas");
                                                    System.out.println("o filho é homem? (s/n)");
                                                    opcao = Entrada.next().toLowerCase();
                                                    if (opcao.equals("n")) {
                                                        System.out.println("Entao tudo bem");
                                                    }
                                                    if (opcao.equals("s")) {
                                                        
                                                    
                                                    quant++;
                                                    System.out.println(quant + "/5");
                                                    break;
                                                    } // fim
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }

            }
        }
    }
}
