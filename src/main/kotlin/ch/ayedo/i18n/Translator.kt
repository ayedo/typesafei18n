package ch.ayedo.i18n

import ch.ayedo.i18n.Language.*

object Translator {

    fun forLanguage(language: Language) = { translatable: Translatable ->
        translate(translatable, language)
    }

    private fun translate(translatable: Translatable, language: Language): String =
        when (language) {
            EN -> translatable.getEn()
            DE -> translatable.getDe()
        }
}
