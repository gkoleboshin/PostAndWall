package ru.netology.post.multimediaContent

data class Photo(val id:Long = 0,
                 val albumID:Long = 0,
                 val ownerID:Long = 0,
                 val userID:Long = 0,
                 val text:String = " ",
                 val date:Long = 0,
                 val sizes:Array<Src> = emptyArray<Src>(),
                 val width:Int = 0,
                 val height:Int = 0){

}
