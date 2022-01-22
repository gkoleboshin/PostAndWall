import org.junit.Test

import org.junit.Assert.*
import ru.netology.*
import ru.netology.post.*
import ru.netology.post.atachments.Atachment
import ru.netology.post.atachments.AtachmentVideo
import ru.netology.post.multimediaContent.Video

class WallServiceTest {

    @Test
    fun update_existing() {
        var atachments:Array<Atachment> = emptyArray<Atachment>()
        atachments+=AtachmentVideo(Video())
        WallService.add(Post(0,0,0,0,getDate(),"HelloWorld!!!",0,false, null, null, null, null,null, " ",0,false,false,false,false,false,false, null,0,atachments))
        WallService.add(Post(0,0,0,0,getDate(),"HelloWorld!!",0,false, null, null, null, null,null, " ",0,false,false,false,false,false,false, null,0,atachments))
        WallService.add(Post(0,0,0,0,getDate(),"HelloWorld!",0,false, null, null, null, null,null, " ",0,false,false,false,false,false,false, null,0,atachments))
        val resault = WallService.editPost(Post(2,0,0,0,
            getDate(),"HelloWorld 2022!",0,false, null, null, null, null,null,"_",0,false,false,false,false,false,false, null,0,atachments))
        assertTrue(resault)
        WallService.posts = emptyArray()
    }

    @Test
    fun add() {
        var atachments:Array<Atachment> = emptyArray<Atachment>()
        atachments+=AtachmentVideo(Video())
        val expendetPost = Post(0,0,0,0,getDate(),"HelloWorld!!!",0,false, null, null, null, null,null, " ",0,false,false,false,false,false,false, null,0,atachments)
        val actualPost = WallService.add(expendetPost)
        assertFalse(expendetPost.id == actualPost.id)
        WallService.posts = emptyArray()
    }

    @Test
    fun update_is_not_existing() {
        var atachments:Array<Atachment> = emptyArray<Atachment>()
        atachments+=AtachmentVideo(Video())
        WallService.add(Post(0,0,0,0,getDate(),"HelloWorld!!!",0,false, null, null, null, null,null, " ",0,false,false,false,false,false,false, null,0,atachments))
        WallService.add(Post(0,0,0,0,getDate(),"HelloWorld!!",0,false, null, null, null, null,null, " ",0,false,false,false,false,false,false, null,0,atachments))
        WallService.add(Post(0,0,0,0,getDate(),"HelloWorld!",0,false, null, null, null, null,null, " ",0,false,false,false,false,false,false, null,0,atachments))
        val resault = WallService.editPost(Post(4,0,0,0,
            getDate(),"HelloWorld 2022!",0,false, null, null, null, null,null,"_",0,false,false,false,false,false,false, null,0,atachments))
        assertFalse(resault)
        WallService.posts = emptyArray()
    }
}