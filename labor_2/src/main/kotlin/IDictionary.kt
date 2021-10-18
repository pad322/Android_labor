interface IDictionary {
    fun add(name : String) : Boolean
    fun find(name : String) : Boolean
    fun size() : Int

    companion object{
        const val dict_name = "data.txt"
    }
}