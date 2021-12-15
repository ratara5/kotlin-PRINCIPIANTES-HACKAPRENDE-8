//y33
class MediaDownloader {

    interface DownloadListener{
        fun onDownloadFisnished(media: Media) //2.se le asigna objeto de tipo Media
    }

    fun createDownloadThread(downloadListener:DownloadListener){
        val thread=Thread(Runnable {
            println("Download started")
            Thread.sleep(3000)
            println("Download finish")

            val downloadedMovie=Movie("Troya",105,true) //1. simulando película descargada
            downloadListener.onDownloadFisnished(downloadedMovie)//3. se le pasa la película que se le acaba de descargar
        })
        thread.start()
    }
}