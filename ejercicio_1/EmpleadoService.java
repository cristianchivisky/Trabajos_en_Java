package ejercicio_1;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EmpleadoService {
	private static List<Empleado> empleados=new ArrayList<Empleado>();
	
	
	public static void agregar(Empleado empleado) {
		empleados.add(empleado);
	}
	
	public static List<Empleado> getEmpleados() {
		return empleados;
	}

	public static void setEmpleados(List<Empleado> empleados) {
		EmpleadoService.empleados = empleados;
	}

	public static Double sueldoPromedio() {
		Double total=0.0;
		if (empleados.size()==0) {
			return 0.0;
		}
		for(Empleado e:empleados) {
			total+=e.getSueldo();
		}
		return total/empleados.size();
	}
	public static Empleado mayorSueldo(){
		Double m=0.0;
		Empleado aux = null; 
		for(Empleado e : empleados) {
			if (e.getSueldo()>m) {
				m = e.getSueldo();
				aux = e;
			}
		}
		return aux;
		
	}
	public static void eliminar(String nombre) {
		Iterator<Empleado> iterator = empleados.iterator();
		while (iterator.hasNext()) {
			Empleado f= iterator.next();
			if (f.getNombre() == nombre){
				empleados.remove(f);
			}
		
		}
		
		
	}


}
