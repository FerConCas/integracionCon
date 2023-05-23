package com.example.ordensuperior

class Brix(val gradosbrix:Double):Tequila {
    override fun cantidadlitros()=gradosbrix * .93
}

class EdadVerdTequila(val EdadVerd:Double):Tequila{
    override fun cantidadlitros()=EdadVerd * .98
}

class AlcoholDentro(val gradosalcohol:Double):Tequila{
    override fun cantidadlitros()=gradosalcohol * 1.56
}

