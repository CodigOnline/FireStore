package com.codigonline.firestore.db.entities

import java.util.*

data class Compra(
    var fecha: Date,
    var importe: Double,
    var dte: Int,
    var tax: Double,
    var total: Double
){
    constructor():this(Date(),0.0,0,0.0,0.0)

    override fun toString(): String {
        return "Compra(fecha=$fecha, importe=$importe, dte=$dte, tax=$tax, total=$total)"
    }

}