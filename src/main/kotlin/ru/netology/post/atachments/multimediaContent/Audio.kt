package ru.netology.post.atachments.multimediaContent

data class Audio(val id:Long = 0,
                 val ownerId:Long = 0,
                 val artist:String ="Неизвестный артист",
                 val title:String = "Безимяный трек",
                 val duration:Int = 0,
                 val url:String = "",
                 val lyricsId:Long = 0,
                 val albumId:Long = 0,
                 val genreId: Long = 0,
                 val date:Long = 0 ,
                 val noSearch:Int = 1,
                 val isHQ:Boolean = false){
}