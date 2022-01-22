package ru.netology.post.atachments

import ru.netology.post.multimediaContent.Graffiti

class AtachmentGraffiti(val type:Graffiti):Atachment() {
    override fun toString(): String {
        return "type = $type"
    }
}