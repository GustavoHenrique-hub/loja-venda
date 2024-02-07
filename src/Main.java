import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Vendedor> vendedores = new ArrayList<Vendedor>();
        Gerente gerente = null;

        Scanner scamText = new Scanner(System.in);
        Scanner scamNum = new Scanner(System.in);

        String nomeVendedor, cpfVendedor, optionVendedor, senha = "", nomeGerente = "", cpfGerente = "", optionGerente, onOff;
        Double salarioVendedor = 0.0, meta = 0.0, valorVendido = 0.0, salarioGerente = 0.0;
        Integer idVendedor = 0, idGerente = 0;

        while (true) {
                while(true){
                    System.out.println("CADASTRAR NOVO GERENTE?");
                    optionGerente = scamText.nextLine();

                    if (optionGerente.equals("Sim") || optionGerente.equals("sim")) {

                        System.out.println("NOME: ");
                        nomeGerente = scamText.nextLine();

                        System.out.println("CPF:");
                        cpfGerente = scamText.nextLine();

                        System.out.println("SALÁRIO:");
                        salarioGerente = scamNum.nextDouble();

                        idGerente += 1;

                        System.out.println("SENHA:");
                        senha = scamText.nextLine();

                        gerente = new Gerente(nomeGerente, cpfGerente, salarioGerente, idGerente, senha);

                    } else {
                        break;
                    }

                    System.out.println("GERENTE CADASTRADO:"
                            + "\n ID: " + gerente.getId()
                            + "\n NOME: " + gerente.getNome()
                            + "\n CPF: " + gerente.getCpf()
                            + "\n SALÁRIO: " + gerente.getSalario()
                    );
                }

                System.out.println("Digite a senha");
                senha = scamText.nextLine();

                if (gerente.autenticaSenha(senha) == true) {
                    System.out.println("Senha correta!!");

                    while(true) {
                        System.out.println("CADASTRAR NOVO VENDEDOR?");
                        optionVendedor = scamText.nextLine();

                        if (optionVendedor.equals("Sim") || optionVendedor.equals("sim")) {

                            System.out.println("NOME: ");
                            nomeVendedor = scamText.nextLine();

                            System.out.println("CPF:");
                            cpfVendedor = scamText.nextLine();

                            System.out.println("SALÁRIO:");
                            salarioVendedor = scamNum.nextDouble();

                            System.out.println("META A SER BATIDA:");
                            meta = scamNum.nextDouble();

                            System.out.println("TOTAL DE VENDAS:");
                            valorVendido = scamNum.nextDouble();

                            idVendedor += 1;

                            vendedores.add(new Vendedor(nomeVendedor, cpfVendedor, salarioVendedor, idVendedor, meta, valorVendido));

                        } else {
                            break;
                        }

                    }


                } else {
                    System.out.println("Senha incorreta!!");
                    System.out.println("Sistema encerrando...");
                    break;
                }

                System.out.println("DESLIGAR SISTEMA?");
                onOff = scamText.nextLine();

                if (onOff.equals("Sim")|| onOff.equals("sim")){
                    System.out.println("Sistema encerrando...");
                    break;
                }else {
                    continue;
                }

        }

        for (Vendedor vendedor : vendedores) {
            System.out.println(
                    "\n ID: " + vendedor.getId()
                            + "\n NOME: " + vendedor.getNome()
                            + "\n CPF: " + vendedor.getCpf()
                            + "\n SALÁRIO: " + vendedor.getSalario()
                            + "\n META: " + vendedor.getMeta()
                            + "\n SALÁRIO FINAL: " + vendedor.getSalarioFinal()
                            + "\n VALOR VENDIDO: " + vendedor.getValorVendido()
            );

        }

    }
}


