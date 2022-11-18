package EColecciones;
import java.util.*;
public class CuentasUsuarios {

	public static void main(String[] args) {
	Clientes cli1 = new Clientes("Anotnio Banderas","00001",200000);
	Clientes cli2 = new Clientes("Rafael Nadal","00002",250000);
	Clientes cli3 = new Clientes("Penelope Cruz","00003",300000);
	Clientes cli4 = new Clientes("Julio Iglesias","00004",500000);
	
	Set <Clientes> ClientesBanco = new HashSet<Clientes>();
	
	ClientesBanco.add(cli1);
	
	ClientesBanco.add(cli2);
	ClientesBanco.add(cli3);
	ClientesBanco.add(cli4);
	
	for (Clientes clientes : ClientesBanco) {
		System.out.println(clientes.getNombre()+" "
		+clientes.getN_cuenta()+" "+clientes.getSaldo());
	}
	
	}
}
