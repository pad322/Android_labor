import java.io.File

object ListDictionary : IDictionary {
    val words = mutableListOf("")

    init {
        File(IDictionary.dict_name).forEachLine { this.add(it) }
    }

    override fun add(name : String) : Boolean {
        if(name!="") {
            words.add(name)
            return true
        }

        return false
    }

    override fun find(name: String): Boolean {
        return words.contains(name)
    }

    override fun size(): Int{
        return words.size
    }

}