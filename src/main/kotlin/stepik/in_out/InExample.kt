package stepik.in_out

fun main(args : Array<String>) {
    print("Введите ваше имя: ")
    val userName = readln()
    print("Введите ваш e-mail: ")
    val userEmail = readln()
    print("Введите ваш адрес: ")
    val userAddress = readln()
    println("Ваше имя: " + userName)
    println("Ваш E-mail: " + userEmail)
    println("Ваш адрес: " + userAddress)
}