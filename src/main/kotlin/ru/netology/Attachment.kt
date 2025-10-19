package ru.netology

interface Attachment {
    var type: String
}

data class Photo (
    val id: Int = 1,
    val albumId: Int = 1,
    val ownerId: Int = 1,
    val userId: Int = 1,
    val text: String = "text",
    val date: Int = 1,
    val thumbHash: String = "thumb_hash",
    val hasTags: Boolean = true,
    val sizes: Array<Any?> = arrayOf("type", "url", 1000, 1000),
    val width: Int = 1000,
    val height: Int = 1000,
)

data class Video (
    val id: Int = 1,
    val ownerId: Int = 1,
    val title: String = "title",
    val description: String = "description",
    val duration: Int = 60,
    val image: Array<Any?> = arrayOf(1000, "url", 1000, 1),
    val firstFrame: Array<Any?> = arrayOf(1000, "url", 1000),
    val date: Int = 1,
    val addingDate: Int = 1,
    val views: Int = 1,
    val localViews: Int = 1,
    val comments: Int = 1,
    val player: String = "url_player",
    val platform: String = "platform",
    val canAdd: Boolean = true,
    val isPrivate: Boolean = true,
    val accessKey: String = "access_key",
    val proccessing: Boolean = true,
)

data class Audio (
    val id: Int = 1,
    val ownerId: Int = 1,
    val artist: String = "artist",
    val title: String = "title",
    val duration: Int = 60,
    val url: String = "url",
    val lyricsId: Int = 1,
    val albumId: Int = 1,
    val genreId: Int = 1,
    val date: Int = 1,
    val noSearch: Boolean = false,
    val isHq: Boolean = false
)

data class VoiceMessage (
    val id: Int = 1,
    val ownerId: Int = 1,
    val duration: Int = 60,
    val waveform: Array<Int> = arrayOf(1000, 1000, 1000, 1000, 1000),
    val linkOgg: String = "url .ogg",
    val linkMp3: String = "url_mp3"
)

data class File (
    val id: Int = 1,
    val ownerId: Int = 1,
    val title: String = "title",
    val size: Int = 0,
    val ext: String = "ext",
    val url: String = "url",
    val date: Int = 1,
    val type: Int = 1
)

class PhotoAttachment : Attachment {
    override var type = "photo"
    val photo = Photo()
}

class VideoAttachment : Attachment {
    override var type = "video"
    val video = Video()
}

class AudioAttachment : Attachment {
    override var type = "audio"
    val audio = Audio()
}

class VoiceMessageAttachment : Attachment {
    override var type = "voiceMessage"
    val voiceMessage = VoiceMessage()
}

class FileAttachment : Attachment {
    override var type = "file"
    val file = File()
}