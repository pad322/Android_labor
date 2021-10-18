object DictionaryProvider {
    fun createDictionary(new_dict: DictionaryType): IDictionary{
        lateinit var actual_dict:IDictionary

        if(new_dict == DictionaryType.ARRAY_LIST){
            actual_dict = ListDictionary
        }

        if(new_dict == DictionaryType.TREE_SET){
            actual_dict = TreeSetDictionary
        }

        if(new_dict == DictionaryType.HASH_SET){
            actual_dict =  HashSetDictionary
        }
        return actual_dict
    }
}