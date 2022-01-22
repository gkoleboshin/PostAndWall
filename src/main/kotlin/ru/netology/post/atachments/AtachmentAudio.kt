package ru.netology.post.atachments

import ru.netology.post.atachments.Atachment
import ru.netology.post.multimediaContent.Audio

class AtachmentAudio (val type: Audio): Atachment() {
    override fun toString(): String {
        return "type=$type"
    }
}