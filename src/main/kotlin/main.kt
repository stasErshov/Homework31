fun main(){
    val secAgo = 200;
    agoText(secAgo);
}

fun agoText(secAgo : Int){
    when {
        secAgo in 0..60 -> println("был(а) в сети только что")
        secAgo > 60 && secAgo <= 60 * 60 -> println("был(а) в сети ${secAgo / 60} ${secText(secAgo)} назад")
        secAgo > 60 * 60 && secAgo < 24 * 60 * 60 -> println("был(а) в сети ${secAgo / (60 * 60)} ${hourText(secAgo)} назад")
        secAgo >= 24 * 60 * 60 && secAgo < 2 * 24 * 60 * 60 -> println("был(а) в сети сегодня")
        secAgo >= 2 * 24 * 60 * 60 && secAgo <= 3 * 24 * 60 * 60 -> println("был(а) в сети вчера")
        secAgo > 3 * 24 * 60 * 60 -> println("был(а) в сети давно")
    }
}

fun secText(secAgo : Int) : String{
    val min = secAgo / 60;
    val toText = when {
        min % 10 == 1 && min != 11 -> "минуту";
        min % 10 == 2 && min != 12 -> "минуты";
        min % 10 == 3 && min != 13 -> "минуты";
        min % 10 == 4 && min != 14 -> "минуты";
        else -> {" минут"}
    }

    return toText;
}

fun hourText(secAgo : Int) : String{
    val hour = secAgo / 3600;
    val toText = when {
        hour % 10 == 1 && hour != 11 -> "час";
        hour % 10 == 2 && hour != 12 -> "часа";
        hour % 10 == 3 && hour != 13 -> "часа";
        hour % 10 == 4 && hour != 14 -> "часа";
        else -> "часов";
    }
    return toText
}