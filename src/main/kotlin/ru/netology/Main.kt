package ru.netology

import ru.netology.post.*

fun main() {
    post(0,0,0,
        getDate(),"HelloWorld!!!",0,false, comments = Comments(), copyright = Copyright(), likes = Likes(), reports = Reports(), views = Views(),"_",0,false,false,false,false,false,false, donut = Donut(),0)
    post(0,0,0,
        getDate(),"HelloWorld2!!!",0,false, comments = Comments(), copyright = Copyright(), likes = Likes(), reports = Reports(), views = Views(),"_",0,false,false,false,false,false,false, donut = Donut(),0)
    postUpdate(2,1,1,1,text = "Hello World 2022!!!", replyOwnerId = 0, friendsOnly = true , comments = Comments(), copyright = Copyright(), likes = Likes(), reports = Reports(), views = Views(), postType = "_", signerID =  0, canPin = false, canEdit =  false, canDelete = false, isPinned =  false, markedAsAds =  false, isFavorite =  false, donut = Donut(), postponedID = 0)
}

fun getDate():Long{
    val date:Long= System.currentTimeMillis()/1000L
    return date
}

fun post(ownerId: Long, fromId: Long, createBy: Long, date: Long, text: String, replyOwnerId: Long, friendsOnly: Boolean, comments: Comments, copyright: Copyright, likes: Likes, reports: Reports, views: Views, postType: String, signerID: Long, canPin: Boolean, canDelete: Boolean, canEdit: Boolean, isPinned: Boolean, markedAsAds: Boolean, isFavorite: Boolean, donut: Donut, postponedID: Long){
    val post = Post(id = 0,ownerId, fromId, createBy, date, text, replyOwnerId, friendsOnly, comments, copyright, likes, reports, views, postType, signerID, canPin, canDelete, canEdit, isPinned, markedAsAds, isFavorite, donut, postponedID)
    println(WallService.add(post))
}
fun postUpdate(id:Long, ownerId: Long, fromId: Long, createBy: Long, date: Long = 0L, text: String, replyOwnerId: Long, friendsOnly: Boolean, comments: Comments, copyright: Copyright, likes: Likes, reports: Reports, views: Views, postType: String, signerID: Long, canPin: Boolean, canDelete: Boolean, canEdit: Boolean, isPinned: Boolean, markedAsAds: Boolean, isFavorite: Boolean, donut: Donut, postponedID: Long){
    val editPost = Post(id,ownerId,fromId,createBy,date,text,replyOwnerId,friendsOnly,comments,copyright,likes,reports,views, postType,signerID,canPin,canDelete,canEdit,isPinned,markedAsAds,isFavorite,donut,postponedID)
    println(WallService.editPost(editPost))
}
