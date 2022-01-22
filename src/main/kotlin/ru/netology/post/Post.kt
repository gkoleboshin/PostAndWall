package ru.netology.post

import ru.netology.post.Views

data class Post(val id:Long = 0,
                val ownerId:Long,
                val fromId:Long,
                val createBy:Long,
                val date:Long,
                val text:String,
                val replyOwnerId:Long,
                val friendsOnly:Boolean,
                val comments: Comments?,
                val copyright: Copyright?,
                val likes: Likes?,
                val reports: Reports?,
                val views: Views?,
                val postType:String,
                val signerID:Long,
                val canPin:Boolean,
                val canDelete:Boolean,
                var canEdit:Boolean,
                val isPinned:Boolean,
                val markedAsAds:Boolean,
                val isFavorite:Boolean,
                val donut: Donut?,
                val postponedID:Long
                )

