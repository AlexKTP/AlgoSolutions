class BrowserHistory(homepage: String) {
    private var index= 0
    private var history = mutableListOf<String>(homepage)

    fun visit(url: String) {
                history = history.filterIndexed { ind, s -> ind<=index  }. 
toMutableList()
        history.add(url)
        index++
    }

    fun back(steps: Int): String {
        if(index - steps>=0){
            index-=steps
            return history[index]
        }
       else {
           index =0
           return history[0]
        }
    }

    fun forward(steps: Int): String {
        if(index+steps<=history.size-1){
            index+=steps
            return history[index]
        }else{
            index=history.size-1
            return history[history.size-1]
        }
    }

}
