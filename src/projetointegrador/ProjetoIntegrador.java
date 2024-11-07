package projetointegrador;

import java.util.Date;
import java.util.Scanner;
import projetointegrador.model.TransacaoFinanceira;


public class ProjetoIntegrador {


    public static void main(String[] args) {
        
        /* ----------------------
        
        1.tenho que deletar os ID's depois que integrar o sql
        
        2.adicionar data para transações marcadas (tipo doc)
        -------------------------
        */
        
        Scanner sc = new Scanner(System.in);
        
        TransacaoFinanceira transacao = new TransacaoFinanceira();
        
        System.out.println("------ Registro de Transação Financeira ------");
        
        Date data = new Date();
        transacao.setDataTransacao(data);
        
        System.out.print("Digite o ID da transação: ");
        transacao.setIdTransacao(sc.nextInt());
        
        System.out.print("Digite o valor da transação: ");
        transacao.setValorTransacao(sc.nextDouble());
        
        System.out.print("Digite o tipo da transação: ");
        sc.nextLine();
        transacao.setTipo(sc.nextLine());
        
        System.out.print("Digite o ID da categoria: ");
        transacao.setCategoria(sc.nextInt());
        
        System.out.print("Digite a descrição da transação: ");
        sc.nextLine();
        transacao.setDescricaoTransacao(sc.nextLine());
        
        System.out.print("Digite o ID da conta origem: ");
        transacao.setContaOrigem(sc.nextInt());
        
        System.out.print("Digite o ID da conta destino: ");
        transacao.setContaDestino(sc.nextInt());
        
        System.out.print("Digite o status da Transação: ");
        sc.nextLine();
        transacao.setStatus(sc.nextLine());
        
        System.out.print("Digite o ID do usuário: ");
        transacao.setUsuarioId(sc.nextInt());
        
        System.out.println(transacao.toString());
        
        sc.close();
    }
    
}