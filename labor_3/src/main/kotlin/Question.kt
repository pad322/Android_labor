data class Question(
    val text : String,
    val answers : List<String>,
    val correct : String
)
{
    fun Question(){
        println(text);
        println(answers.forEach(){println(it)})
    }

}