package info.dvkr.screenstream.data.image


interface AudioNotify {
    companion object {
        const val AUDIO_TYPE_NONE = "AUDIO_TYPE_NONE"
        const val AUDIO_TYPE_DEFAULT = "AUDIO_TYPE_DEFAULT"
        const val AUDIO_TYPE_NEW_ADDRESS = "AUDIO_TYPE_NEW_ADDRESS"
        const val AUDIO_TYPE_RELOAD_PAGE = "AUDIO_TYPE_RELOAD_PAGE"
    }

    fun getAudio(audioType: String): ByteArray
}