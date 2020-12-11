package com.codigonline.firestore.viewmodels

import android.util.Log
import androidx.lifecycle.*
import com.codigonline.firestore.db.entities.Usuario
import com.codigonline.firestore.db.entities.repository.UsuarioRepository


class UsuarioViewModel : ViewModel() {

    private val usuarioRepository = UsuarioRepository();
    private var usuarios: MutableLiveData<List<Usuario>> = MutableLiveData()



    fun findAll(): LiveData<List<Usuario>> {

        usuarioRepository.findAll().addSnapshotListener { value, error ->
            if (error != null) {
                Log.w("TAG", "No se han podido recuperar los datos")
                usuarios.value=null
                return@addSnapshotListener
            }

            var usuariosList: MutableList<Usuario> = mutableListOf()
            for (doc in value!!) {
                var usuario = doc.toObject(Usuario::class.java)
                usuariosList.add(usuario)
            }
            usuarios.value = usuariosList


        }
        return usuarios;
    }



}
