class One {
    fun chet(){
        println("Введите первое число")
        var first = readln()!!.toInt()
        println("Введите второе число")
        var second = readln()!!.toInt()
        if(first%2==0 && second%2==0)
        {
            println("Чётные")
        }
        else if(first%2!=0 && second%2!=0)
        {
            println("Оба не чёт")
        }
        else if(first%2==0 || second%2==0)
        {
            println("Одно чёт")
        }
    }
    fun sum() {
        println("Введите первое число")
        var first = readln()!!.toInt()
        println("Введите второе число")
        var second = readln()!!.toInt()
        var sum = first+second
        println("Сумма = "+sum)
    }
}