public static void main(String[] args) {

    Mascota miMascota = new Mascota("Firulais", "Perro", 3);

    System.out.println("Información inicial:");
    miMascota.mostrarInfo();

    miMascota.cumplirAnios();

    System.out.println("Información actualizada:");
    miMascota.mostrarInfo();

    Libro miLibro = new Libro("El Principito", "Antoine de Saint-Exupéry", 1943);

    System.out.println("Información inicial:");
    miLibro.mostrarInfo();

    System.out.println("\nIntentando establecer un año inválido (1800):");
    miLibro.setAnioPublicacion(1800);
    miLibro.mostrarInfo();

    System.out.println("\nModificando con un año válido (2000):");
    miLibro.setAnioPublicacion(2000);
    miLibro.mostrarInfo();

    Gallina gallina1 = new Gallina(1, 2);
    Gallina gallina2 = new Gallina(2, 3);

    System.out.println("Estado de las gallinas antes de las acciones:");
    gallina1.mostrarDatos();
    gallina2.mostrarDatos();

    gallina1.ponerHuevo();
    gallina2.ponerHuevo();
    gallina2.ponerHuevo();

    gallina1.aumentarEdad();
    gallina2.aumentarEdad();

    System.out.println("Estado de las gallinas después de las acciones:");
    gallina1.mostrarDatos();
    gallina2.mostrarDatos();

    NaveEspacial nave1 = new NaveEspacial("Explorer-1", 50);

    System.out.println("Estado inicial:");
    nave1.mostrarEstado();

    System.out.println("\nIntentando avanzar 60 unidades:");
    nave1.avanzar(60);

    System.out.println("\nRecargando 40 unidades de combustible:");
    nave1.recargarCombustible(40);

    System.out.println("\nIntentando avanzar 60 unidades nuevamente:");
    nave1.avanzar(60);

    System.out.println("\nEstado final:");
    nave1.mostrarEstado();
}