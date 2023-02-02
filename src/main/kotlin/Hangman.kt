class Hangman(
    var vidas: Int,
    val paraulaOriginal: List<Char>
) {        //Declarem la class Hangman la cual li entrara vidas i paraulaOriginal. Aquesta classe vindrà al originar la variable hangman en la class Game

    var paraulaAdivinar: ArrayList<Char> =
        arrayListOf()        //Declarem la paraulaAdivinar, encarregada de copiar la paraulaOriginal. ParaulaOriginal és la paraula que introdueix el company o la paraula que ve per default en la llista creada en la class Game
    val letrasUsadasList =
        arrayListOf<Char>()          //Declarem la variable lestrasUsadasList i la deixem buida per anar afegint les lletres que inserta l'usuari per després poder mostrar-les en verd
    val abecedariList = listOf(   //Fem la llista per tenir totes les lletres de l'abecedari
        'a', 'b', 'c', 'd', 'e', 'f', 'g',
        'h', 'i', 'j', 'k', 'l', 'm', 'n',
        'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
    )
    fun createWord() {
        //paraulaAdivinar = paraulaOriginal.map { '-' } as ArrayList        // Segona opció que es podria fer per crear la paraula

        for (i in 0 until paraulaOriginal.size) {       //Fem un for per anar afegint un - per cada una de les posicions que tingui paraulaOriginal, així sabem cuants slots té la paraula
            paraulaAdivinar.add('-')
        }
        println("La palabra contiene ${paraulaAdivinar.size} letras: $paraulaAdivinar")     //Mostrem per pantalla el numero de lletres que conté la paraula
    }
    fun showVidas() {       //Declarem la funció showVidas

        println("\nVidas: $vidas")
    }
    fun insert() {      //Declarem la variable insert, encarregada d'anar demanant a l'usuari que introdueixi lletra a lletra

        var videsPerdudes = true       //Declarem un boolean y el posem amb true
        var x =
            '0'     //inicialitzem la variable x en 0 per poder arreglar les excepcions en cas de que l'usuari introduís més d'un caracter

        while (x == '0') {      //Fem el bucle que sempre entrará fins que no doni Null

            print("Inserta una letra: ")        //Demanem a l'usuari que inserti una lletra
            x = readln().singleOrNull()
                ?: '0'.lowercaseChar()      //En cas de que sigui null donara 0, d'aquesta manera mostrarem per pantalla l'error fins que no doni null
            letrasUsadasList.add(x)     //Afegim a la llista vuida les lletres introduidex

            if (x == '0') {

                println("Lo siento, pero tan solo puedes introducir un caracter")
            }
            println()
        }
        var contador =
            1        //Declarem una variable contador que ens servira per mostrar la llista com si fos una matriu

        for (i in abecedariList) {      //Fem aquest bucle per anar fent el recorregut de tota la llista del abecedari

            if (letrasUsadasList.contains(i)) {     //en cas de que la llista que hem anat afegint x conte i aleshores mostrarem la lletra de color verd

                print("\u001B[42m\u001B[30m\u001B[4m[$i]\u001B[0m")

            } else {        //En cas contrari printarem la lletra tal com estaba
                print("[$i]")
            }
            if (contador == 9 || contador == 18) {      //Aquesta condicio servirà per mostrar la llista en forma de matriu, en els casos en el que arribi a la posicio 9 o 18 aleshores farà un \n

                println()

            }
            contador++      //contador = contador +1

            if (i == 'z') {     //Condicio per mostrar més esteticament per pantalla

                println("\n")

            }


        }

        for (i in 0 until paraulaOriginal.size) {       //Aquest bucle anira mirant posició per posició de la paraulaOriginal

            if (x == paraulaOriginal[i]) {      //En cas de que la lletra introduida sigui igual a la de la paraula original substituirem la lletra en la posicio de paraulaAdivinar. Per tant es cambiarà pel "-" que hi hauria

                videsPerdudes = false       //Declarem la variable en false per a que més endevant no ens resti vides
                paraulaAdivinar[i] = x
            }
        }
        if (videsPerdudes) {        //En el cas de que en cap moment hagi entrat en el if anterior aleshores voldrà dir que ninguna lletra coincideix

            println("\nLastima! La letra que has introducido no forma parte de la palabra! ")

            restarVida()        //Per tant invocarem la funció de restarVida per reduir les vides que té l'usuari
        }
        print(paraulaAdivinar)      //Mostrarem per pentalla la paraulaAdivinar
    }
    fun restarVida() {      //Declarem la funcio restarVida

        vidas -= 1      //vidas= vidas -1
    }

    fun showPicture() {     //Declarem la funcio showPicture, encarregada de mostrar per pantalla un dibuix o un altre segons les vides que tingui l'usuari.

        if (vidas == 5) {
            Support.printSupport()
        }
        if (vidas == 4) {
            Head.printHead()
        }
        if (vidas == 3) {
            LeftArm.printLeftArm()              //En tots els casos podem veure que criden les funcions respectives als objects que tenim declarats que venen relacionats amb la classe mare Picture
        }
        if (vidas == 2) {
            RightArm.printRightArm()
        }
        if (vidas == 1) {
            LeftFoot.printLeftFoot()
        }
        if (vidas == 0) {
            Hanged.printHanged()
        }
    }
    fun bucle() {           //Aquesta funció podríem diure que es la funció base per a que tot el joc funcioni fins que acerti la paraula o perdi totes les vides
        createWord()
        while (vidas > 0 && paraulaOriginal != paraulaAdivinar) {       //El while se seguirà fent fins que l'usuari tingui més de 0 vides i quan la paraulaOriginal sigui diferent de paraulaAdivinar
            insert()        //Cridarem la funcio insert
            showPicture()       //Cridarem la funcio showPicture
            showVidas()         //Cridarem la funcio showVidas
        }
        condicion()         //Cridarem la funcio condicion
    }
    fun replay() {      //Declarem la funcio replay per demanar al usuari si vol tornar a jugar
        print("Quieres volver a jugar? (1-Si, 2-No) ")
        var retry = readln().toIntOrNull() ?: -1

        while (retry != 1 && retry != 2) {      //Fem aquest bucle en cas de que l'usuari premi un numero diferent de 1 o 2
            println("Lo siento pero debes introducir 1 o 2")

            print("Quieres volver a jugar? (1-Si, 2-No) ")
            retry = readln().toIntOrNull() ?: -1
        }
        if (retry == 1) {       //En el cas de que premi 1, aleshores tornarà a començar el joc
            println("De acuerdo! Vamos alla!")
            Game(guessWord(), difficulty())      //Cridem un altre cop a la funcio per tornar a començar
        } else { // retry == 2
            Images.imageThanks()        //Mostrem les imatges que venen en les funcions de l'object Images
            println("\n\n")
            Images.imageCredits()
        }
    }
    fun condicion() {       //Declarem la funcio per indicarli al jugador si ha guanyat o ha perdut
        if (vidas > 0) {        //Cas en el que ha guanyat ja que les seves vides son > 0
            println("Felicidades!!! Has ganado!")
            Images.imageOk()
            replay()        //Cridem a la funcio replay

        } else {        //Les seves vides son < 0
            println("Lo siento, has perdido, la palabra era $paraulaOriginal")
            Images.imageSadFace()
            replay()        //Cridem a la funcio replay
        }
    }
}