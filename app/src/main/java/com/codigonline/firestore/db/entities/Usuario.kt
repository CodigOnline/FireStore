package com.codigonline.firestore.db.entities

data class Usuario(var nombre: String, var apellido: String, var compras: List<Compra>){
    constructor():this("","", ArrayList<Compra>()) {
    }
    override fun toString(): String {
        return "Usuario(nombre='$nombre', apellido='$apellido', compras=$compras)"
    }
}