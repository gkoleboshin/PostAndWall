package ru.netology.post.atachments

import ru.netology.post.multimediaContent.Photo

class AtachmentPhoto(val type:Photo):Atachment(){
    override fun toString(): String {
        return "type = $type"
    }
}