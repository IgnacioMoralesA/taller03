public class universidad {

	private facultad[] Facultades;
	private oficina[] Oficinas;

	public universidad(facultad[] facultades, oficina[] oficinas) {
		Facultades = facultades;
		Oficinas = oficinas;
	}

	private static void oficinas(){
		int numeroOficinas=150;
		AgregarOficinas(numeroOficinas);
	}
	private static void AgregarOficinas(int nOficinas){
		for(int i=0;i<nOficinas;i++){
			new oficina(i);
		}
	}
}