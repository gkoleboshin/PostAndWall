package ru.netology

import ru.netology.post.Post

object WallService {
    var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        val postWithId: Post = if (posts.isEmpty()){post.copy(id= post.id+1)}else{post.copy(id= posts.last().id+1)}
        posts += postWithId
        return posts.last()
    }

    fun editPost(post: Post):Boolean{
        for((index,oldPost) in posts.withIndex()){
            if (oldPost.id == post.id) {
                posts.set(index,post.copy(ownerId = oldPost.ownerId,date = oldPost.date))
                return true
            }
        }
        return false
    }
}