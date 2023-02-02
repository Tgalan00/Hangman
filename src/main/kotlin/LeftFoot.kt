object LeftFoot : Picture() {        //Creem l'object LeftFoot que ve relacionada amb la classe mare Pictures

    fun printLeftFoot() {       //Printem el dibuix del penjat segons les vides que tingui l'usuari

        val paint = "                                                                                \n" +
                "                      /@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ \n" +
                "                      /@*                           @@,                      @@ \n" +
                "                      /@*                             @@@                    @@ \n" +
                "                      /@*                                @@*                 @@ \n" +
                "                      /@*                                  @@@               @@ \n" +
                "                      /@*                                    .@@/            @@ \n" +
                "                      /@*                                       @@@          @@ \n" +
                "                    @@@@@@#                                       .@@(       @@ \n" +
                "                @@@.       *@@@                                      @@@     @@ \n" +
                "              (@/   %    .%   @@*                                       @@#  @@ \n" +
                "             @@    @@@  #@@@   @@                                         @@@@@ \n" +
                "             @@                 @@                                           @@ \n" +
                "              @@               @@                                            @@ \n" +
                "               @@#@@&     &@ @@@                                             @@ \n" +
                "                 *@@@@@@@@@@@                                                @@ \n" +
                "                      /@*                                                    @@ \n" +
                "                      /@*                                                    @@ \n" +
                "                     ,@@@,                                                   @@ \n" +
                "                   @@@/@*@@@                                                 @@ \n" +
                "                *@@,  /@*  ,@@                                               @@ \n" +
                "              @@@     /@*     @@%                                            @@ \n" +
                "           *@@,       /@*       %@@                                          @@ \n" +
                "                      /@*                                                    @@ \n" +
                "                      /@*                                                    @@ \n" +
                "                      @@&                                                    @@ \n" +
                "                    .@@                                                      @@ \n" +
                "                   @@,                                                       @@ \n" +
                "                 *@@                                                         @@ \n" +
                "                @@                                                           @@ \n" +
                "              (@@                                                            @@ \n" +
                "              &                                                              @@ \n" +
                "                                                                             @@ \n" +
                "                                                                             @@ \n" +
                "                                                                             @@\n"
        paint.forEach {     //Aquesta funció ens permet mostrar per pantalla el dibuix amb una mica de delay i això fa que sigui més agradable a la vista a l'hora de veure-ho pel terminal
            print(it)
            if (it == '\n')         //Nou mètode que hem après a l'última clase que vam fer
                Thread.sleep(100)
        }

    }
}