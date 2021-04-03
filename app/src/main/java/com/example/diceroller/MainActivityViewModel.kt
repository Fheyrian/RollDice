package com.example.diceroller

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainActivityViewModel : ViewModel() {

    var statusSave : MutableLiveData<Boolean> = MutableLiveData()

    fun save(){
        var userRepository = UserRepository()
        var status = userRepository.saveData()
        statusSave.value = status
    }
}