    class Tamagochi {
        int fome,limpeza,energia;
        int diamantes = 0;
        int idade = 0;
        int energiaInicial,limpezaInicial,fomeInicial;
        String comando;

        void fome(int fome) {
            this.fome = fome;
            this.fomeInicial = this.fome;
        }

        void limpeza(int limpeza) {
            this.limpeza = limpeza;
            this.limpezaInicial = this.limpeza;
        }

        void energia(int energia) {
            this.energia = energia;
            this.energiaInicial = this.energia;
        }
        
        boolean comandos(String comando){
            if(!comando.equals("brincar") && !comando.equals("dormir") && !comando.equals("mostrar") && 
               !comando.equals("comer") && !comando.equals("tomar banho") && !comando.equals("fim")){

                return false;
            }
        
            if(comando.equals("brincar")){
                 if(this.energia <= 0){
                    this.energia = 0;
                    System.out.println("Falhou: O bixinho morreu!");
                }else if(this.limpeza <= 0){
                    limpeza = 0;
                    System.out.println("Falhou: O bixinho morreu de sujeira!");
                }else if(this.fome <= 0){
                    this.fome = 0;
                    System.out.println("Falhou: O bixinho morreu de fome!");
                }else{
                    this.energia -= 2;
                    this.fome -= 1;
                    this.limpeza -= 3;
                    this.diamantes++;
                    this.idade++;

                }

            }
            
            if(comando.equals("comer")){
                if(this.energia <= 0){
                    this.energia = 0;
                    System.out.println("Falhou: O bixinho morreu!");
                }else if(this.limpeza <= 0){
                    limpeza = 0;
                    System.out.println("Falhou: O bixinho morreu de sujeira!");
                }else if(this.fome <= 0){
                    this.fome = 0;
                    System.out.println("Falhou: O bixinho morreu de fome!");
                }else{
                    this.energia -= 1;
                    this.energia -= 2;
                    this.fome += 4;
                    this.idade++;

                    if(this.fome > fomeInicial){
                        this.fome = fomeInicial;
                    }
                }

            }
            
            if(comando.equals("dormir")){
                if(this.energia <= 0){
                    this.energia = 0;
                    System.out.println("Falhou: O bixinho morreu!");
                }else if(this.limpeza <= 0){
                    this.limpeza = 0;
                    System.out.println("Falhou: O bixinho morreu de sujeira!");
                }else if(fome <= 0){
                    this.fome = 0;
                    System.out.println("Falhou: O bixinho morreu de fome!");
                }else if(this.energiaInicial-this.energia < 5){
                   System.out.println("Falhou: O bichinho nao esta cansado!");
                }else{
                    this.fome -= 1;
                    this.idade += (this.energiaInicial - energia);
                    this.energia = this.energiaInicial;
                      
                }

            }
            
            if(comando.equals("tomar banho")){
                if(this.energia <= 0){
                    this.energia = 0;
                    System.out.println("Falhou: O bixinho morreu!");
                }else if(this.limpeza <= 0){
                    this.limpeza = 0;
                    System.out.println("Falhou: O bixinho morreu de sujeira!");
                }else if(this.fome <= 0){
                    this.fome = 0;
                    System.out.println("Falhou: O bixinho morreu de fome!");
                }else{
                    this.fome -= 1;
                    this.energia -= 3;
                    this.idade += 2;
                    this.limpeza = limpezaInicial;
                }

            }
            if(comando.equals("mostrar")){
                    mostrar();
            }
            return true;
            
        }
       void mostrar(){
    
            System.out.println("E:" + this.energia + "/" + this.energiaInicial + ", F:" + this.fome + "/" + this.fomeInicial + ", L:" + this.limpeza + "/" + this.limpezaInicial + ", D:" + this.diamantes + ", I:" + this.idade);
        
    }
    
}




