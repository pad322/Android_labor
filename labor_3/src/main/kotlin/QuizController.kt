import java.util.Random
import kotlin.random.Random.Default.nextInt

class QuizController (
    var questions : MutableList<Question>

)
{
    fun QuizController(qs : MutableList<Question>){
        questions = qs
    }

    fun doQuiz(){

        var c = 0

        randomizeQuestions()

        questions.forEach(){
            println(it.text)

            var i = 1

            it.answers.forEach(){
                print("$i. : ")
                println(it)
                i += 1
            }

            val stringInput = readLine()

            if(stringInput == it.correct)
            {
                c += 1
                println("Correct!")
                println()
            }
            else
            {
                println("Incorrect!")
                println()
            }

        }

        println("Correct answers/$c")
    }

    fun randomizeQuestions(){
        questions.shuffle()
    }
}