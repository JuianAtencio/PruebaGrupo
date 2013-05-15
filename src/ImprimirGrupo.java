public class ImprimirGrupo {
	public boolean devuelve_mensajeGrupo(boolean dato) {
		if (dato != true) {
			System.out
					.println("Aja programa de prueba ImprimeDos para repo en Git  falso");
			dato = false;
		} else {
			System.out
					.println("Aja programaa de prueba ImprimeDos para repo en Git true");
			dato = true;
		}
		return dato;
	}
}
