package info.dvkr.screenstream.data.image

import android.support.annotation.IntRange
import android.support.annotation.Keep


interface AudioGenerator {

    @Keep sealed class AudioGeneratorEvent {
        @Keep class OnAudio(val image: ByteArray) : AudioGeneratorEvent()
        @Keep class OnError(val error: Throwable) : AudioGeneratorEvent()
    }

    fun setImageResizeFactor(@IntRange(from = 1, to = 150) factor: Int)

    fun setImageJpegQuality(@IntRange(from = 1, to = 100) quality: Int)

    fun start()

    fun stop()
}