fun main(args: Array<String>) {
    val jedi = arrayOf("Zidane", "Messi", "Ronaldo")
    println(jedi[0]);
    jedi[0] = "Some person"
    println(jedi[0]);

    val minTemperature = -128
    val maxTemperature = 127
    println("Температура на планете в диапазоне от " + minTemperature + " до " + maxTemperature + " градусов")

    val carCount: Short = 32000
    println("За неделю мы продали больше " + carCount + " спидеров")

    val starCount: Int = 1_000_000
    println("В нашей галактике примерно " + starCount + " обитаемых миров")

    val shootCount: Long = 1_000_000_000_000_000
    println("За одно сражение в космосе из пушек вылетает около " + shootCount + " снарядов")
}