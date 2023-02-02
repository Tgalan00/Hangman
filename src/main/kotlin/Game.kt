class Game(
    wordefaultorfriend: Int,
    dif: Int
) {     //Clase game on crearem la llista de paraules y considerarem els diferents casos que presenta el joc

    val hangman: Hangman        //Declarem la variable hangman per poder cridar més endavant a l'altre classe


    fun printProcedure() {      //Declarem la funcio printProcedure

        println("Bien!\nEmpecemos a jugar!\nMucha suerte!")
    }

    fun palabraCompanero(): List<Char> {        //Declarem la funcio palabraCompanero encarregada de demanar la paraula que tindrà que adivinar el company
        print("Introduce la palabra que adivinará tu compañero: ")
        val guessingMateWord = readln()     //variable per guardar la paraula a adivinar
        val guessingMateWordList =
            arrayListOf<Char>()      //Fem una altre variable per anar guardant lletra a lletra la paraula introduida prèviament, ja que volem tenir les paraules escrites en una llista caracter a caracter
        for (i in guessingMateWord) {       //Fem el bucle per fer lo esmentat prèviament

            guessingMateWordList.add(i)     // Anem afegint un a un
        }
        return guessingMateWordList     //Retornarem la variable guessingMateWordList
    }

    init {
        val defaultlist =
            listOf(       //Declarem la variable default, la qual tindrà emmagatzemada les diferents opcions de paraules a adivinar si l'usuari ha triat adivinar una paraula default
                listOf('c', 'l', 'a', 's', 'e'),
                listOf('p', 'a', 't', 'a', 't', 'a'),
                listOf('c', 'i', 'e', 'l', 'o'),
                listOf('c', 'u', 'a', 'd', 'r', 'o'),
                listOf('o', 'c', 'e', 'a', 'n', 'o'),
                listOf('m', 'a', 'r', 'a', 'v', 'i', 'l', 'l', 'o', 's', 'o'),
                listOf('e', 'j', 'e', 'r', 'c', 'i', 'c', 'i', 'o'),
                listOf('p', 'i', 'a', 'n', 'o'),
                listOf('a', 'p', 'r', 'o', 'v', 'a', 'd', 'o'),
                listOf('p', 'r', 'o', 'g', 'r', 'a', 'm', 'a', 'r'),
                listOf('k', 'o', 't', 'l', 'i', 'n')
            )

        if (dif == 1 && wordefaultorfriend == 1) {      //Fem un conjunt d'ifs i elses per crear les diferents opcions possibles que té el joc, relacionat amb la dificultat i si l'usuari ha volgut adivinar una paraula per default o feta per un company

            printProcedure()
            hangman = Hangman(
                6,
                defaultlist.random()
            )      //en cas de que dif sigui 1 i wordefaultorfriend sigui 1 aleshores farem el mode de hangman "facil".

        } else if (dif == 2 && wordefaultorfriend == 1) {
            printProcedure()
            hangman = Hangman(5, defaultlist.random())      //Mode Normal

        } else if (dif == 3 && wordefaultorfriend == 1) {
            printProcedure()
            hangman = Hangman(4, defaultlist.random())      //Mode Dificil

        } else if (dif == 1 && wordefaultorfriend == 2) {
            printProcedure()
            hangman = Hangman(6, palabraCompanero())        //Mode facil però triant una paraula feta pel company

        } else if (dif == 2 && wordefaultorfriend == 2) {
            printProcedure()
            hangman = Hangman(5, palabraCompanero())        //Mode normal però triant una paraula feta pel company

        } else {        // dif == 3 && wordefaultorfriend == 2
            printProcedure()
            hangman = Hangman(4, palabraCompanero())        //Mode dificil però triant una paraula feta pel company
        }
    }
}