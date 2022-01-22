import org.junit.Test

import org.junit.Assert.*
import ru.netology.*
import ru.netology.post.*

class WallServiceTest {

    @Test
    fun update_existing() {
        WallService.add(Post(0,0,0,0,getDate(),"HelloWorld!!!",0,false, null, null, null, null,null, " ",0,false,false,false,false,false,false, null,0))
        WallService.add(Post(0,0,0,0,getDate(),"HelloWorld!!",0,false, null, null, null, null,null, " ",0,false,false,false,false,false,false, null,0))
        WallService.add(Post(0,0,0,0,getDate(),"HelloWorld!",0,false, null, null, null, null,null, " ",0,false,false,false,false,false,false, null,0))
        val resault = WallService.editPost(Post(2,0,0,0,
            getDate(),"HelloWorld 2022!",0,false, null, null, null, null,null,"_",0,false,false,false,false,false,false, null,0))
        assertTrue(resault)
        WallService.posts = emptyArray()
    }

    @Test
    fun add() {
        val expendetPost = Post(0,0,0,0,getDate(),"HelloWorld!!!",0,false, null, null, null, null,null, " ",0,false,false,false,false,false,false, null,0)
        val actualPost = WallService.add(expendetPost)
        assertFalse(expendetPost.id == actualPost.id)
        WallService.posts = emptyArray()
    }

    @Test
    fun update_is_not_existing() {
        WallService.add(Post(0,0,0,0,getDate(),"HelloWorld!!!",0,false, null, null, null, null,null, " ",0,false,false,false,false,false,false, null,0))
        WallService.add(Post(0,0,0,0,getDate(),"HelloWorld!!",0,false, null, null, null, null,null, " ",0,false,false,false,false,false,false, null,0))
        WallService.add(Post(0,0,0,0,getDate(),"HelloWorld!",0,false, null, null, null, null,null, " ",0,false,false,false,false,false,false, null,0))
        val resault = WallService.editPost(Post(4,0,0,0,
            getDate(),"HelloWorld 2022!",0,false, null, null, null, null,null,"_",0,false,false,false,false,false,false, null,0))
        assertFalse(resault)
        WallService.posts = emptyArray()
    }
}