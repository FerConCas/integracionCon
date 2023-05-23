package com.example.ordensuperior

/**
 * Mainunit
 *
 */
fun mainunit() {
    saludarone("Fermin")
}

/**
 * Saludar
 *
 * @param nombre
 */
fun saludar(nombre: String): Unit {
    println("Hola, " + nombre)
    //  return saludar("")
}

/**
 * Saludarone
 *
 * @param nombre
 */
fun saludarone(nombre: String) {
    println("Hola, " + nombre)
    //  return saludarone("nombre: String")
}

/**
 * Main
 *
 */
fun main() {
    ejecutarrevision(Brix(34.5))
    ejecutarrevision(EdadVerdTequila(8.5))

}

/**
 * Ejecutarrevision
 *
 * @param tequila
 */
fun ejecutarrevision(tequila: Tequila) {
    if (tequila is Brix) {
        println("La cantidad de: ${tequila.gradosbrix} litros de Tequila contienen ${tequila.cantidadlitros()} grados brix")
        return
    }
    if (tequila is EdadVerdTequila) {
        println("La cantidad de: ${tequila.EdadVerd} litros de Tequila contienen ${tequila.cantidadlitros()} años de vejez")
        return
    }
}