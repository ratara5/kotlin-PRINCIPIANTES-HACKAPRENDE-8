//34
class Movie(name: String, duration: Int, isAvailable: Boolean, trailer:Trailer?=null):Media(name, duration, isAvailable, trailer) {

    var wonOscar:Boolean=false

    override fun toString(): String {
        return "Nombre: $name -  Duración: $duration min"
    }

    override fun play() {
        super.play()
    }
}