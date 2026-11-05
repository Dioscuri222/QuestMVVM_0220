package com.example.mvvm.viewmodel

import android.R
import androidx.lifecycle.ViewModel
import androidx.room.util.copy
import com.example.mvvm.model.Siswa
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class SiswaViewModel : ViewModel() {
    private val _statusUI = MutableStateFlow(Siswa())
    val statusUI: StateFlow<Siswa> = _statusUI.asStateFlow()

    fun setSiswa(Is: MutableList<R.string>) {
        _statusUI.update { statusSaatIni ->
            statusSaatIni.copy(nama = ls[0], gender = ls[1], alamat = ls[2])
        }
    }
}
