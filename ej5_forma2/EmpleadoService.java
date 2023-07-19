package ej5_forma2;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoService {
	public void agregar(Empleado empleado) {
		empleados.add(empleado);
	}
	private List<Empleado> empleados= new ArrayList<Empleado>();
	
	public Double sueldoPromedio() {
		Double total=0.0;
		if (empleados.size()==0) {
			return 0.0;
		}
		for(Empleado e:empleados) {
			total+=e.getSueldo();
		}
		return total/empleados.size();
	}
	public String mayorSueldo(){
		Double m=0.0;
		String n="";
		for(Empleado e : empleados) {
			if (e.getSueldo()>m) {
				m=e.getSueldo();
				m.toString();
				n=e.getNombre();
			}
		}
		return "el empeado que mas gana es: "+ n +" y el sueldo es: "+ m;
		
	}

}
