package ch.ayedo.i18n

object Greeting : Translatable {
    override fun getEn() = "Hello"
    override fun getDe() = "Hallo"
}

object ClickHereToRestorePassword : Translatable {
    override fun getEn() = "Click here to restore your password."
    override fun getDe() = "Klicke hier, um Dein Passwort neu zu setzen."
}

class WeAreSorrySomethingWentWrongWhileBookingYourCourse(private val courseName: String) : Translatable {
    override fun getEn() =
        "You have booked the course \'$courseName\'. Unfortunately, something went wrong while booking your course."

    override fun getDe() =
        "Du hast dich für den Kurs \'$courseName\' angemeldet. Leider ist bei der Kursbuchung etwas schief gegangen."
}
