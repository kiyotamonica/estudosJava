package fundamentos;

public class Temperatura {
	public static void main(String[] args) {
		int constanteDeCalculo1 = 32;
		double temperaturaCelsius, temperaturaFahrenheit = 98, constanteDeCalculo2 = (5/9.0);
		
		temperaturaCelsius = (temperaturaFahrenheit - constanteDeCalculo1) * constanteDeCalculo2;
		
		System.out.println("Temperatura em Celsius para 98ºF : " + temperaturaCelsius + "ºC");
	}
}
