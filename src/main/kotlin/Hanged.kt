object Hanged : Picture() {     //Creem l'object Hanged que ve relacionada amb la classe mare Pictures
    fun printHanged() {     //Printem el dibuix del penjat segons les vides que tingui l'usuari

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
                "                    .@@ @@                                                   @@ \n" +
                "                   @@,   @@@                                                 @@ \n" +
                "                 *@@       @@                                                @@ \n" +
                "                @@          @@%                                              @@ \n" +
                "              (@@             @@                                             @@ \n" +
                "              &                @/                                            @@ \n" +
                "                                                                             @@ \n" +
                "                                                                             @@ \n" +
                "                                                                             @@\n"
        paint.forEach {//Aquesta funci?? ens permet mostrar per pantalla el dibuix amb una mica de delay i aix?? fa que sigui m??s agradable a la vista a l'hora de veure-ho pel terminal
            print(it)
            if (it == '\n')     //Nou m??tode que hem apr??s a l'??ltima clase que vam fer
                Thread.sleep(100)
        }
    }
}
