package com.codigonline.firestore.db.entities.repository

import com.codigonline.firestore.db.entities.Usuario
import com.google.android.gms.tasks.Task
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.DocumentReference
import com.google.firebase.firestore.FirebaseFirestore


class UsuarioRepository {
    val TAG = "USUARIO_REPOSITORY"
    val firestoreDB = FirebaseFirestore.getInstance()

    fun save(usuario: Usuario): Task<DocumentReference>{
        var documentReference = firestoreDB.collection("usuarios")
        return documentReference.add(usuario)
    }

    fun findAll():CollectionReference{
        var colectionReference = firestoreDB.collection("usuarios")
        return colectionReference
    }


}