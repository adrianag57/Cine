package cine;

import java.util.Iterator;

public class Sala {

	private Butaca asientos[][];
	private boolean modo_covid;
	private int filas;
	private int columnas;

	public Sala(int filas, int columnas) {

		this.filas = filas;
		this.columnas = columnas;
	}

	public void InicializarSala(boolean esCovid, int num_separacion) {

		modo_covid = esCovid;
		asientos = new Butaca[filas][columnas];
		int contador = 0;

		// modo normal
		if (!modo_covid) {
			for (int i = 0; i < filas; i++) {
				for (int j = 0; j < columnas; j++) {

					Butaca butaca = new Butaca();
					asientos[i][j] = butaca;
				}
			}
		} else {

			for (int i = 0; i < filas; i++) {
				for (int j = 0; j < columnas; j++) {

					Butaca butaca = new Butaca();
					asientos[i][j] = butaca;
					contador++;
					if (contador > num_separacion) {

						butaca.setBloqueada();
					}
				}
			}
		}
	}

	public String toString() {

		String str_devolver = "";
		Butaca butaca = new Butaca();
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {

				butaca = asientos[i][j];
				str_devolver += "FILA: " + i + ", COLUMNA: " + j + ", estado= " + butaca.toString() + "\n";
			}
		}
		return str_devolver;
	}

}
