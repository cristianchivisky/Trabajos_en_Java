package ejercicio_1;


public class PruebaEmpleadoService {

	public static void main(String[] args) {
		Empleado juan = new Empleado(150000.00, "Juan", 62533);
		Empleado pedro = new Empleado(270000.00, "Pedro", 82937);
		Empleado mateo = new Empleado(100000.00, "Mateo", 48575);
		
		EmpleadoService.agregar(juan);
		EmpleadoService.agregar(pedro);
		EmpleadoService.agregar(mateo);
		
		System.out.println(EmpleadoService.sueldoPromedio());
		System.out.println(EmpleadoService.mayorSueldo().getNombre());		
		EmpleadoService.eliminar("Pedro");
		System.out.println(EmpleadoService.getEmpleados());
	}

}
