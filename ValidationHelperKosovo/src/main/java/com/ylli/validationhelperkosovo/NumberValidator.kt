package com.ylli.validationhelperkosovo

/**
 * Created by Yll Memeti on 10/1/2021.
 */
class NumberValidator {
    companion object{
        fun isNumberCorrect(number: String):Boolean {
            if (number.startsWith("+383" || numbser.startWith("00383")){
                return true
            }
            return false
        }
    }
}
