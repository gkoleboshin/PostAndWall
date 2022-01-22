package ru.netology.post.atachments

import ru.netology.post.atachments.Atachment
import ru.netology.post.multimediaContent.Video

class AtachmentVideo(val type: Video): Atachment(){
    override fun toString(): String {
        return "type=$type"
    }
}