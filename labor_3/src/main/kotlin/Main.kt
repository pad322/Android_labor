fun main(args: Array<String>) {

    val q1=Question("1 + 1 = ?",listOf("1","2","3","4"),"2")
    val q2=Question("Alma piros?",listOf("Talan","Kizart dolog","Zold","Nem tudom"),"3")
    val q3=Question("4 laba van, asztal, de nem szek",listOf("Kecske","Attila","Szek","Asztal"),"4")
    val q4=Question("Szoveg",listOf("a","b","c","d"),"1")
    val q5=Question("Cica",listOf("Kutya","Macska","Medve","Tehen"),"2")
    val qs = mutableListOf(q1,q2,q3,q4,q5)

    val q = QuizController(qs)

    q.doQuiz()
}