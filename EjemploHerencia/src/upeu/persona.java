package upeu;
abstract class persona {

	public String nombre;
	protected int edad;
        public persona() {}
        public persona(String nombre, int edad) {
            this.nombre = nombre;
            this.edad = edad;
        }

	public String toStringUno() {
            return "Hola, soy "+nombre;
		
	}

	public int cambiarEdad() {
            return edad;
		
	}

}