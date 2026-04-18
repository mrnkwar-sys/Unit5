package comparatorejercicio05;

import java.util.Comparator;

public class ComparadorNombreApellidos implements Comparator<Titular>{
	public int compare(Titular t1, Titular t2) {
		//Resultado de comparar primero los apellidos
		int resultadoApellidos;
		
		//Instanciamos los comparadores individuales
		Comparator<Titular> compNombre = new ComparadorNombre();
		Comparator<Titular> compApellidos = new ComparadorApellidos();
		
		//Comparamos primero los apellidos
		resultadoApellidos = compApellidos.compare(t1, t2);
		
		//Si el resultado es igual a 0, los apellidos son iguales, por lo que tendremos que desempatar por el nombre
		if (resultadoApellidos != 0) {
			return resultadoApellidos;
		} else {
			return compNombre.compare(t1, t2);
		}
	}
}
