package cine;

class Start1 {

	public static void main(String[] args) {

		int filas = 5;
		int columnas = 5;
		Sala sala_cine = new Sala(filas, columnas);
		
		sala_cine.InicializarSala(modo_covid, n_separacion);
		sala_cine.toString();

	}

}
