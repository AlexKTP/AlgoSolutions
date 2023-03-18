class BrowserHistory(homepage: String) {

    private var currentIndex= 0
    private var history = mutableListOf<String>(homepage)

    private val currentPage: String = homepage

    fun visit(url: String) {
        val diff = history.size-1 - currentIndex
        history = history.dropLast(diff).toMutableList()
        history.add(url)
        currentIndex++
    }

    fun back(steps: Int): String {
        val diff = currentIndex - steps
        if(diff>=0){
            currentIndex = diff
        } else currentIndex = 0
        return history[currentIndex]
    }

    fun forward(steps: Int): String {
        val newCurrentIndex = currentIndex+steps
        if(newCurrentIndex<=history.size-1){
            currentIndex= newCurrentIndex
        }else currentIndex=history.size-1
        return history[currentIndex]
    }

}


