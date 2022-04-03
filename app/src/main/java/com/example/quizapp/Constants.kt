package com.example.quizapp

object Constants {

    const val USER_NAME: String = "user_name"
    const val TOTAL_QUESTIONS: String = "total_questions"
    const val CORRECT_ANSWERS: String = "correct_answers"
    
    fun getQuestions():ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(1, "What country does this flag belong to?",
        R.drawable.flag_of_india, "India", "Pakistan", "Japan", "China",
        1)
        questionsList.add(que1)
        
        val que2 = Question(2, "What country does this flag belong to?",
        R.drawable.flag_of_afghanistan, "India", "Afghanistan", "Japan",
                "Egypt", 2)
        questionsList.add(que2)

        val que3 = Question(3, "What country does this flag belong to?",
        R.drawable.flag_of_albania, "Denmark", "Albania", "Canada"
        , "Austria", 2)
        questionsList.add(que3)

        val que4 = Question(4, "What country does this flag belong to?",
        R.drawable.flag_of_argentina, "Argentina", "China", "Chile",
        "France", 1)
        questionsList.add(que4)

        val que5 = Question(5, "What country does this flag belong to?",
        R.drawable.flag_of_australia, "Argentina", "Chile", "Australia",
        "Germany", 3)
        questionsList.add(que5)

        val que6 = Question(6, "What country does this flag belong to?",
        R.drawable.flag_of_austria, "Croatia", "Belgium", "Germany",
        "Austria", 4)
        questionsList.add(que6)

        val que7 = Question(7, "What country does this flag belong to?",
        R.drawable.flag_of_bangladesh, "Bangladesh", "Belgium", "Pakistan",
                "India", 1)
        questionsList.add(que7)

        val que8 = Question(8, "What country does this flag belong to?",
        R.drawable.flag_of_belgium, "Finland", "Belgium", "Denmark",
        "Croatia", 2)
        questionsList.add(que8)

        val que9 = Question(9, "What country does this flag belong to?",
        R.drawable.flag_of_bosnia_herzegovina, "Belgium", "Egypt", "Ghana",
        "Bosnia Herzegovina", 4)
        questionsList.add(que9)

        val que10 = Question(10, "What country does this flag belong to?",
        R.drawable.flag_of_zimbabwe, "Uruguay", "Vietnam", "Sweden",
        "Zimbabwe", 4)
        questionsList.add(que10)

        val que11 = Question(11, "What country does this flag belong to?",
        R.drawable.flag_of_brazil, "Argentina", "Brazil", "Chile",
        "Ghana", 2)
        questionsList.add(que11)

        val que12 = Question(12, "What country does this flag belong to?",
        R.drawable.flag_of_vietnam, "Albania", "Greece", "Vietnam",
        "Turkey", 3)
        questionsList.add(que12)

        val que13 = Question(13, "What country does this flag belong to?",
        R.drawable.flag_of_canada, "Canada", "Kuwait", "Kenya",
        "Poland", 1)
        questionsList.add(que13)

        val que14 = Question(14, "What country does this flag belong to?",
        R.drawable.flag_of_usa, "Australia", "Jamaica", "USA",
        "Ukraine", 3)
        questionsList.add(que14)

        val que15 = Question(15, "What country does this flag belong to?",
        R.drawable.flag_of_chile, "Croatia", "Ireland", "Mexico",
        "Chile", 4)
        questionsList.add(que15)

        val que16 = Question(16, "What country does this flag belong to?",
        R.drawable.flag_of_uruguay, "Norway", "Uruguay", "Qatar",
        "Russia", 2)
        questionsList.add(que16)

        val que17 = Question(17, "What country does this flag belong to?",
        R.drawable.flag_of_china, "Kuwait", "Japan", "Kenya",
        "China", 4)
        questionsList.add(que17)

        val que18 = Question(18, "What country does this flag belong to?",
        R.drawable.flag_of_united_kingdom, "USA", "United Kingdom", "Senegal",
        "Serbia", 2)
        questionsList.add(que18)

        val que19 = Question(19, "What country does this flag belong to?",
        R.drawable.flag_of_croatia, "Croatia", "Norway", "Russia",
        "Serbia", 1)
        questionsList.add(que19)

        val que20 = Question(20, "What country does this flag belong to?",
        R.drawable.flag_of_ukraine, "Poland", "Portugal", "Spain",
        "Ukraine", 4)
        questionsList.add(que20)

        val que21 = Question(21, "What country does this flag belong to?",
        R.drawable.flag_of_czech_republic, "Mexico", "Nepal", "Czech Republic",
        "Russia", 3)
        questionsList.add(que21)

        val que22 = Question(22, "What country does this flag belong to?",
        R.drawable.flag_of_turkey, "Turkey", "China", "Sri Lanka",
        "Serbia", 1)
        questionsList.add(que22)

        val que23 = Question(23, "What country does this flag belong to?",
        R.drawable.flag_of_denmark, "Denmark", "Iceland", "Ghana",
        "Qatar", 1)
        questionsList.add(que23)

        val que24 = Question(24, "What country does this flag belong to?",
        R.drawable.flag_of_switzerland, "Spain", "Switzerland", "Sweden",
        "Malaysia", 2)
        questionsList.add(que24)

        val que25 = Question(25, "What country does this flag belong to?",
        R.drawable.flag_of_egypt, "Serbia", "Sweden", "Egypt", "Senegal", 3)
        questionsList.add(que25)

        val que26 = Question(26, "What country does this flag belong to?",
        R.drawable.flag_of_sweden, "Sweden", "Serbia", "Switzerland",
        "Spain", 1)
        questionsList.add(que26)

        val que27 = Question(27, "What country does this flag belong to?",
        R.drawable.flag_of_finland, "Finland", "Russia", "Qatar",
        "Italy", 1)
        questionsList.add(que27)

        val que28 = Question(28, "What country does this flag belong to?",
        R.drawable.flag_of_sri_lanka, "Nepal", "Malaysia", "Poland",
        "Sri Lanka", 4)
        questionsList.add(que28)

        val que29 = Question(29, "What country does this flag belong to?",
        R.drawable.flag_of_france, "India", "France", "Senegal", "Norway", 2)
        questionsList.add(que29)

        val que30 = Question(30, "What country does this flag belong to?",
        R.drawable.flag_of_spain, "Turkey", "Kenya", "Spain",
        "Norway", 3)
        questionsList.add(que30)

        val que31 = Question(31, "What country does this flag belong to?",
        R.drawable.flag_of_germany, "Serbia", "Sweden", "Pakistan",
        "Germany", 4)
        questionsList.add(que31)

        val que32 = Question(32, "What country does this flag belong to?",
        R.drawable.flag_of_south_africa, "Ukraine", "South Africa", "Zimbabwe",
        "Pakistan", 2)
        questionsList.add(que32)

        val que33 = Question(33, "What country does this flag belong to?",
        R.drawable.flag_of_ghana, "Sweden", "Ghana", "Ukraine",
        "Finland", 2)
        questionsList.add(que33)

        val que34 = Question(34, "What country does this flag belong to?",
        R.drawable.flag_of_slovakia, "Qatar", "Serbia", "Slovakia",
        "Ukraine", 3)
        questionsList.add(que34)

        val que35 = Question(35, "What country does this flag belong to?",
        R.drawable.flag_of_hungary, "Hungary", "Egypt", "Turkey", "USA", 1)
        questionsList.add(que35)

        val que36 = Question(36, "What country does this flag belong to?",
        R.drawable.flag_of_iceland, "Ukraine", "Iceland", "Mexico", "Nepal", 2)
        questionsList.add(que36)

        val que37 = Question(37, "What country does this flag belong to?",
        R.drawable.flag_of_serbia, "Slovakia", "Sweden", "Serbia",
        "USA", 3)
        questionsList.add(que37)

        val que38 = Question(38, "What country does this flag belong to?",
        R.drawable.flag_of_iran, "Iraq", "Iran", "Japan", "Egypt", 2)
        questionsList.add(que38)

        val que39 = Question(39, "What country does this flag belong to?",
        R.drawable.flag_of_senegal, "Jamaica", "Zimbabwe", "Cameroon", "Senegal", 4)
        questionsList.add(que39)

        val que40 = Question(40, "What country does this flag belong to?",
        R.drawable.flag_of_ireland, "Spain", "Ireland", "Kenya",
        "United Kingdom", 2)
        questionsList.add(que40)

        val que41 = Question(41, "What country does this flag belong to?",
        R.drawable.flag_of_qatar, "Vietnam", "Sweden", "Turkey", "Qatar", 4)
        questionsList.add(que41)

        val que42 = Question(42, "What country does this flag belong to?",
        R.drawable.flag_of_italy, "Ireland", "Netherlands", "Italy", "India", 3)
        questionsList.add(que42)

        val que43 = Question(43, "What country does this flag belong to?",
        R.drawable.flag_of_portugal, "Pakistan", "India", "Portugal", "Uruguay", 3)
        questionsList.add(que43)

        val que44 = Question(44, "What country does this flag belong to?",
        R.drawable.flag_of_jamaica, "Jamaica", "Qatar", "Japan", "Iceland", 1)
        questionsList.add(que44)

        val que45 = Question(45, "What country does this flag belong to?",
        R.drawable.flag_of_poland, "Germany", "Poland", "Albania", "Austria", 2)
        questionsList.add(que45)

        val que46 = Question(46, "What country does this flag belong to?",
        R.drawable.flag_of_kenya, "Iran", "Sweden", "Kenya", "Japan", 3)
        questionsList.add(que46)

        val que47 = Question(47, "What country does this flag belong to?",
        R.drawable.flag_of_norway, "Norway", "USA", "Canada", "Vietnam", 1)
        questionsList.add(que47)

        val que48 = Question(48, "What country does this flag belong to?",
        R.drawable.flag_of_korea_south, "Japan", "South Korea", "China", "Iceland", 2)
        questionsList.add(que48)

        val que49 = Question(49, "What country does this flag belong to?",
        R.drawable.flag_of_mexico, "Iraq", "Italy", "Ukraine", "Mexico", 4)
        questionsList.add(que49)

        val que50 = Question(50, "What country does this flag belong to?",
        R.drawable.flag_of_kuwait, "Afghanistan", "UAE", "Kuwait", "India", 3)
        questionsList.add(que50)
        
        return questionsList
    }
}