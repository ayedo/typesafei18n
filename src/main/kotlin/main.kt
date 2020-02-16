fun main() {

    val translator = Translator.forLanguage(Language.EN)

    val message =
        """
        ${translator(Greeting)},
        ${translator(ClickHereToRestorePassword)}
        ${translator(WeAreSorrySomethingWentWrongWhileBookingYourCourse("Computer Science 101"))}
        """

    println(message)

}
