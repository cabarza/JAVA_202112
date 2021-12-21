package cl.codingdojo.banco.cuenta;

public class BancoTest {

	public static void main(String[] args) {
		try {
			CuentaBancaria c1 = new CuentaBancaria();
			CuentaBancaria c2 = new CuentaBancaria();
			CuentaBancaria c3 = new CuentaBancaria();
			
			c1.saldo();
			c2.saldo();
			c3.saldo();
			
			c1.depositar(2500.450, CuentaBancaria.TIPO_CUENTA_CORRIENTE);
			
			c2.depositar(5000, CuentaBancaria.TIPO_CUENTA_AHORRO);
			
			c1.saldo();
			c2.saldo();
			c3.saldo();
			
			c2.retirar(2000, CuentaBancaria.TIPO_CUENTA_AHORRO);
			
			c1.saldo();
			c2.saldo();
			c3.saldo();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
