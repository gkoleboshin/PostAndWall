package ru.netology.post.atachments

import ru.netology.post.multimediaContent.Gift

class AtachmentGift (val type: Gift):Atachment(){
    override fun toString(): String {
        return "type = $type"
    }
}