package cl.codingdojo.banco.cuenta;

public class CuentaBancaria {
	
	public static final int TIPO_CUENTA_CORRIENTE = 0;
	public static final int TIPO_CUENTA_AHORRO = 1;
	
	private static int totalCuentas;
	private static double totalDinero;
	
	private String numeroCuenta;
	private double saldoCuentaCorriente;
	private double saldoCuentaAhorro;
	
	public CuentaBancaria() {
		this.numeroCuenta = this.generarNuevoNumeroCuenta();
		CuentaBancaria.totalCuentas++;
	}
	
	private String generarNuevoNumeroCuenta() {
		long numeroCuenta = (long)(Math.random()*9999999999l) + 1;
		return String.format("%010d", numeroCuenta);
	}
	
	
	public void depositar(double monto, int tipoCuenta) throws Exception {
		if(tipoCuenta == CuentaBancaria.TIPO_CUENTA_CORRIENTE) {
			saldoCuentaCorriente += monto;
		} else if(tipoCuenta == CuentaBancaria.TIPO_CUENTA_AHORRO) {
			saldoCuentaAhorro += monto;
		} else {
			throw new Exception("No tiene el tipo de cuenta solicitado");
		}
		CuentaBancaria.totalDinero += monto;
	}
	
	public void retirar(double monto, int tipoCuenta) throws Exception {
		if(tipoCuenta == CuentaBancaria.TIPO_CUENTA_CORRIENTE) {
			if(saldoCuentaCorriente >= monto) {
				saldoCuentaCorriente -= monto;
			} else {
				throw new Exception("Saldo insuficiente");
			}
		} else if(tipoCuenta == CuentaBancaria.TIPO_CUENTA_AHORRO) {
			if(saldoCuentaAhorro >= monto) {
				saldoCuentaAhorro -= monto;
			} else {
				throw new Exception("Saldo insuficiente");
			}
		} else {
			throw new Exception("No tiene el tipo de cuenta solicitado");
		}
		CuentaBancaria.totalDinero -= monto;
	}
	
	public void saldo() {
		StringBuilder sb = new StringBuilder("El saldo para su cuenta: ");
		sb.append(this.getNumeroCuenta());
		sb.append("\n\t Cuenta Corriente: ");
		sb.append(this.getSaldoCuentaCorriente());
		sb.append("\n\t Cuenta Ahorro: ");
		sb.append(this.getSaldoCuentaAhorro());
		System.out.println(sb.toString());
	}
	
	public String getNumeroCuenta() {
		return numeroCuenta;
	}

	
	public double getSaldoCuentaCorriente() {
		return saldoCuentaCorriente;
	}

	

	public double getSaldoCuentaAhorro() {
		return saldoCuentaAhorro;
	}

	

}
