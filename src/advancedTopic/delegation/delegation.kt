package advancedTopic.delegation
/*
Delegation in Kotlin allows one class to delegate a responsibility to another class.
It's like saying, "Hey, you handle this part for me!"

 A class delegates an interface implementation to another class.

 */
interface Downloader{
    fun download()
}

interface Player{
    fun play()
}

class FileDownloader(var file:String): Downloader {
    override fun download() {
        println("$file is downloaded")
    }

}
    class FilePlaying(var file:String): Player {
        override fun play() {
            println("$file is playing..")
        }

    }

// delegating the implementation to the another object like downloader and player

class MediaPlayer(val downloader: Downloader, val player: Player): Downloader, Player {
    override fun download() {
      downloader.download()
    }

    override fun play() {
        player.play()
    }

}

// kotlin have native approach for this you can still do this code with the
// help of (by) keyword

class MediaPlay(player: Player, downloader: Downloader): Downloader by downloader, Player by player{

}



fun main() {
    var fileName: String = "MP3/KV"
    val fileName1 = "Movie"
    val result = MediaPlayer(FileDownloader(fileName), FilePlaying(fileName))
    val result1 = MediaPlay(FilePlaying(fileName1), FileDownloader(fileName1))
    result1.download()
    result1.play()
    result.download()
    result.play()
}