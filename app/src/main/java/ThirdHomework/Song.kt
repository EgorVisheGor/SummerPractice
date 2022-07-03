package ThirdHomework

class Song (
    val id:Int,
    val name : String,
    val author : String,
    val duration: String,
    val url: String,
)
{ override fun toString(): String{
    return "Name:$name Author:$author Duration:$duration"}
}
