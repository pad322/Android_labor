fun main(args: Array<String>) {

    val q1=Question("1 + 1 = ?",mutableListOf("1","2","3","4"),"2")
    val q2=Question("Alma piros?",mutableListOf("Talan","Kizart dolog","Zold","Nem tudom"),"Zold")
    val q3=Question("4 laba van, asztal, de nem szek", mutableListOf("Kecske","Attila","Szek","Asztal"),"Asztal")
    val q4=Question("Betu",mutableListOf("a","6",".",";"),"a")
    val q5=Question("Cica",mutableListOf("Kutya","Macska","Medve","Tehen"),"Macska")
    val q6=Question("Melyik a jobb?",mutableListOf("Android","Iphone","Windows Phone"),"Android")
    val q7=Question("Mi Kosovo fovarasa?", mutableListOf("Podgorica","Sarajevo","Pristina","Tirana"),"Pristina")
    val q8=Question("Mi volt a debutalo albuma Daft Punk-nak?", mutableListOf("Homework","Discovery","Random Access Memories","Human After All"),"Homework")
    val q9=Question("Hanyadik felesege volt VIII Henry kiralynak Anne Boleyn?", mutableListOf("2","3","4","5"),"2")
    val q10=Question("Hany Oscar dijra jeloltek Quentin Tarantinot?", mutableListOf("9","10","7","8"),"8")
    val qs = mutableListOf(q1,q2,q3,q4,q5,q6,q7,q8,q9,q10)

    val q = QuizController(qs)

    q.doQuiz()
}