package com.example.mytestingonandroid

object RegistrationUtil {

    private val existingUsers = listOf("Mohamed", "Ahmed")

    /**
     * the input is not valid if...
     * ...tne username/password is empty
     * ...the username is already taken
     * ...the confirmed password is not the some as the real password
     * ...the password contains less than 2 digits
     */

    fun validateRegistrationInput(
        username: String,
        password: String,
        confirmedPassword: String
    ): Boolean {
        if (username.isEmpty() || password.isEmpty()) {
            return false
        }
        if (username in existingUsers) {
            return false
        }
        if (password != confirmedPassword) {
            return false
        }
        if (password.count() { it.isDigit() } < 2) {
            return false
        }
        return true
    }
}