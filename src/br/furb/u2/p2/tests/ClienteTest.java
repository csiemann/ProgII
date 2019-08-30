package br.tests;

import org.junit.Test;

import br.controller.Operacao;
import br.models.Cliente;
import br.models.ContaCorrente;

public class ClienteTest {

	@Test
	public void test() {
		Cliente cli1 = new Cliente("Caetano", "(47) 3322-9798", "(47) 9914-4564");
		Cliente cli2 = new Cliente("Leonardo", "(47) 3340-6544", "(47) 9919-9879");

		ContaCorrente con1 = new ContaCorrente(1, 0001, cli1);
		ContaCorrente con2 = new ContaCorrente(2, 0001, cli1);
		ContaCorrente con3 = new ContaCorrente(3, 0001, cli2);
		
		System.out.println("--------DEPOSITOS-----------");
		con1.depositar(100.00);
		con2.depositar(50.00);
		con3.depositar(200.00);
		System.out.println("----------------------------");
		
		System.out.println("-----------SALDO------------");
		System.out.println(con1.getSaldo());
		System.out.println(con2.getSaldo());
		System.out.println(con3.getSaldo());
		System.out.println("----------------------------");
		
		System.out.println("--------SAQUES--------------");
		con1.sacar(10.00);
		con2.sacar(1.00);
		con3.sacar(100.00);
		System.out.println("----------------------------");
		
		System.out.println("-----------SALDO------------");
		System.out.println(con1.getSaldo());
		System.out.println(con2.getSaldo());
		System.out.println(con3.getSaldo());
		System.out.println("----------------------------");
		
		System.out.println("--------TRANSFERENCIA-------");
		con3.transferir(50.00, con1);
		con1.transferir(40.00, con2);
		con2.transferir(10.00, con3);
		System.out.println("----------------------------");

		System.out.println("-----------SALDO------------");
		System.out.println(con1.getSaldo());
		System.out.println(con2.getSaldo());
		System.out.println(con3.getSaldo());
		System.out.println("----------------------------");
		
		System.out.println("---------OPERACOES----------");
		System.out.println(listar(con1));
		System.out.println(listar(con2));
		System.out.println(listar(con3));
		System.out.println("----------------------------");
	}
	
	private String listar(ContaCorrente con) {
		StringBuilder builder = new StringBuilder();
		builder.append("=========operaçao "+con.getCliente()+"========\n");
		for (Operacao operacao : con.operacoes) {
			builder.append(operacao+"\n");
		}
		builder.append(con.transferencia);
		builder.append("=================================\n");
		return builder.toString();
	}

}
