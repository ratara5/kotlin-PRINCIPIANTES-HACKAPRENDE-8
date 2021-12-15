//y32
fun main(args: Array<String>) {

    val movie1=Movie("Titanic",90,false)
    val series1=Series("Sponge Bob",100,true)

    //y32
    playMedia(movie1)
    //Thread.sleep(2000)
    val mediaDownloader=MediaDownloader()
    mediaDownloader.createDownloadThread(object: MediaDownloader.DownloadListener{
        override fun onDownloadFisnished(media: Media) { //4.(viene de MediaDownloader)
            media.play() //5. Se hace cuando termina la descarga
        }

    })
    playMedia(series1)
}

fun playMedia(media: Media){
    media.play() //detecta que subclase es y ejecuta el método sobreescrito según el caso
}

/* y33 Single responsibility principle. Class dedicated to only thing
fun createDownloadThread(){
    val thread=Thread(Runnable {
        println("Download started")
        Thread.sleep(3000)
        println("Download finish")
    })
    thread.start()
}
*/


