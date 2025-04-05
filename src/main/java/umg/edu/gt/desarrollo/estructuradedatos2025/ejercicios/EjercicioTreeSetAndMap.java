package umg.edu.gt.desarrollo.estructuradedatos2025.ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.*;

public class EjercicioTreeSetAndMap {

	// Ejercicio 1: Análisis de Frecuencia de Palabras
	public static TreeMap<String, Integer> contarFrecuenciaPalabras(String rutaArchivo) throws IOException {
		TreeMap<String, Integer> frecuencia = new TreeMap<>();
		try (BufferedReader br = new BufferedReader(new FileReader(rutaArchivo))) {
			String linea;
			while ((linea = br.readLine()) != null) {
				linea = linea.toLowerCase().replaceAll("[^a-z\s]", "");
				String[] palabras = linea.split("\\s+");
				for (String palabra : palabras) {
					if (!palabra.isEmpty()) {
						frecuencia.put(palabra, frecuencia.getOrDefault(palabra, 0) + 1);
					}
				}
			}
		}
		return frecuencia;
	}

	// Ejercicio 2: Rastreador de Versiones de Código
	private final TreeMap<Integer, String> versiones = new TreeMap<>();
	private int contadorVersion = 0;

	public int agregarVersion(String codigo) {
		contadorVersion++;
		versiones.put(contadorVersion, codigo);
		return contadorVersion;
	}

	public String obtenerVersion(int version) {
		return versiones.get(version);
	}

	public String obtenerUltimaVersion() {
		return versiones.lastEntry().getValue();
	}

	public void eliminarVersion(int version) {
		versiones.remove(version);
	}

	// Ejercicio 3: Sistema de Gestión de Eventos
	public static class Evento implements Comparable<Evento> {
		private final LocalDateTime fecha;
		private final String nombre;
		private final String ubicacion;

		public Evento(LocalDateTime fecha, String nombre, String ubicacion) {
			this.fecha = fecha;
			this.nombre = nombre;
			this.ubicacion = ubicacion;
		}

		public LocalDateTime getFecha() {
			return fecha;
		}

		public String getNombre() {
			return nombre;
		}

		public String getUbicacion() {
			return ubicacion;
		}

		@Override
		public int compareTo(Evento otro) {
			return this.fecha.compareTo(otro.fecha);
		}

		@Override
		public String toString() {
			return nombre + ", " + fecha + ", " + ubicacion;
		}
	}

	private final TreeSet<Evento> eventos = new TreeSet<>();

	public void agregarEvento(Evento evento) {
		eventos.add(evento);
	}

	public List<Evento> listarEventos() {
		eliminarEventosPasados();
		return new ArrayList<>(eventos);
	}

	public Evento obtenerProximoEvento() {
		eliminarEventosPasados();
		return eventos.isEmpty() ? null : eventos.first();
	}

	private void eliminarEventosPasados() {
		eventos.removeIf(evento -> evento.getFecha().isBefore(LocalDateTime.now()));
	}
}


/** EJERCICIO 3: Sistema de Gestión de Eventos (TreeSet)
    📜 Descripción: Implemente un sistema para administrar eventos ordenados cronológicamente.
    🔹 Instrucciones:
        Utilice un TreeSet<Evento>, donde cada Evento debe contener:
        fecha (LocalDateTime)
        nombre (String)
        ubicación (String)
        Los eventos deben ordenarse automáticamente por fecha y hora.
        Debe permitir:
            Agregar un nuevo evento.
            Mostrar la lista de eventos en orden cronológico.
            Obtener el próximo evento a ocurrir.
            Eliminar un evento pasado automáticamente después de una consulta.

        Salida:
            Próximo evento: "Conferencia de Java", 2025-05-10 10:00, Auditorio A
            Lista de eventos:
            1. "Taller de Machine Learning", 2025-04-15 14:00, Sala 3
            2. "Conferencia de Java", 2025-05-10 10:00, Auditorio A

 */
	
	


