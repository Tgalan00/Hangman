import java.util.Scanner;

 class traduccion {

    public void presentacio() {     //Funcio presentacio, encarregada de donar la benvinguda a l'usuari
        Scanner scan = new Scanner(System.in);
        System.out.println(
                """
                        ██████╗ ██╗███████╗███╗   ██╗██╗   ██╗███████╗███╗   ██╗██╗██████╗  ██████╗\s
                        ██╔══██╗██║██╔════╝████╗  ██║██║   ██║██╔════╝████╗  ██║██║██╔══██╗██╔═══██╗
                        ██████╔╝██║█████╗  ██╔██╗ ██║██║   ██║█████╗  ██╔██╗ ██║██║██║  ██║██║   ██║
                        ██╔══██╗██║██╔══╝  ██║╚██╗██║╚██╗ ██╔╝██╔══╝  ██║╚██╗██║██║██║  ██║██║   ██║
                        ██████╔╝██║███████╗██║ ╚████║ ╚████╔╝ ███████╗██║ ╚████║██║██████╔╝╚██████╔╝
                        ╚═════╝ ╚═╝╚══════╝╚═╝  ╚═══╝  ╚═══╝  ╚══════╝╚═╝  ╚═══╝╚═╝╚═════╝  ╚═════╝\s
                                                                                                   \s


                        """
        );

        System.out.println(
                """
                         █████╗ ██╗              ██╗██╗   ██╗███████╗ ██████╗  ██████╗     ██████╗ ███████╗██╗          █████╗ ██╗  ██╗ ██████╗ ██████╗  ██████╗ █████╗ ██████╗  ██████╗\s
                        ██╔══██╗██║              ██║██║   ██║██╔════╝██╔════╝ ██╔═══██╗    ██╔══██╗██╔════╝██║         ██╔══██╗██║  ██║██╔═══██╗██╔══██╗██╔════╝██╔══██╗██╔══██╗██╔═══██╗
                        ███████║██║              ██║██║   ██║█████╗  ██║  ███╗██║   ██║    ██║  ██║█████╗  ██║         ███████║███████║██║   ██║██████╔╝██║     ███████║██║  ██║██║   ██║
                        ██╔══██║██║         ██   ██║██║   ██║██╔══╝  ██║   ██║██║   ██║    ██║  ██║██╔══╝  ██║         ██╔══██║██╔══██║██║   ██║██╔══██╗██║     ██╔══██║██║  ██║██║   ██║
                        ██║  ██║███████╗    ╚█████╔╝╚██████╔╝███████╗╚██████╔╝╚██████╔╝    ██████╔╝███████╗███████╗    ██║  ██║██║  ██║╚██████╔╝██║  ██║╚██████╗██║  ██║██████╔╝╚██████╔╝
                        ╚═╝  ╚═╝╚══════╝     ╚════╝  ╚═════╝ ╚══════╝ ╚═════╝  ╚═════╝     ╚═════╝ ╚══════╝╚══════╝    ╚═╝  ╚═╝╚═╝  ╚═╝ ╚═════╝ ╚═╝  ╚═╝ ╚═════╝╚═╝  ╚═╝╚═════╝  ╚═════╝\s"""
        );
        System.out.println("\nComo te llamas? ");
        System.out.print("Introduce tu nombre: ") ;     //Demanem a l'usuari el seu nom
        int name = scan.nextInt();
        System.out.println("Encantado,"+name+"vas a jugar al juego del ahorcado");
        System.out.println("Cuando vayas insertando letras, se te mostraran todas las letras del abecedario en forma de matriz, las marcadas en verde són aquellas que ya has introducido previamente, estas listo?");
    }

    public int guessWord() {

        //Declarem la funcio per demanar a l'usuari si vol adivinar la paraula creada en la llista que ve per default pel sistema o prefereix que un company li introdueixi una paraula
        Scanner scan = new Scanner(System.in);
        System.out.print("Quieres adivinar la palabra creada por default o prefieres adivinar una creada por uno de tus compañeros? (1-Default, 2-Compañero): ");
        int wordefaultOrFriend = scan.nextInt();

        while (wordefaultOrFriend != 1 && wordefaultOrFriend != 2) {        //Fem un bucle en cas de que l'usuari introdueixi un valor diferent de 1 o 2

            System.out.println("Lo siento pero debes introducir 1 o 2");
            System.out.print("Quieres adivinar la palabra creada por default o prefieres adivinar una creada por uno de tus compañeros? (1-Default, 2-Compañero): ");
            wordefaultOrFriend = scan.nextInt();
        }
        return wordefaultOrFriend;       //retornem la variable


    }
    public int difficulty() {       //declarem la funcio difficulty per demanar a l'usuari quina dificultat vol triar
        Scanner scan = new Scanner(System.in);
        System.out.print("Por favor, escoge la dificultad (1-Facil, 2-Normal, 3-Dificil): ");
        int dif = scan.nextInt();        //En cas de que sigui null posarem un -1 així també s'inclou amb la resta d'excepcions

        while (dif != 1 && dif != 2 && dif != 3) {      //Fem un bucle en cas de que l'usuari premi un valor que no sigui 1, 2 o 3

            System.out.println("Lo siento pero debes introducir 1, 2 o 3");

            System.out.print("Por favor, escoge la dificultad (1-Facil, 2-Normal, 3-Dificil): ");
            dif = scan.nextInt();
        }

        if (dif == 1) {     //Fem 3 condicions per retornar la dificultat triada
            return 1;

        } else if (dif == 2) {
            return 2;

        } else {    // dif == 3
            return 3;

        }
    }

    public static void main(String[] args) {

        new traduccion().presentacio();  //Cridarem la funció presentacio

        Game game = new Game(new traduccion().guessWord(), new traduccion().difficulty());       //Declarem la variable game la cual anira a la classe Game per a que ens retorni la variable hangman creada segons les dades que ha introduit l'usuari

        game.getHangman().bucle();        //cridem la funcio bucle en la classe Hangman per jugar al joc fins arribar a finalitzar-lo




    }


}
