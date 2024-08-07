import Animais.Cachorro;
import Animais.Gato;
import Animais.Passaro;
import Lojas.Petshop;


public class Main {
    public static void main(String[] args) {

        Cachorro cachorro1 = new Cachorro("Many","Cinza",58,7.7,5,"nada");
        Gato gato1 = new Gato("Gata","Mesclada",6,4.7,"nada");
        Passaro passaro1 = new Passaro("Fru","Branca",2,2.3,"nada");

        Petshop petshop = new Petshop();

        petshop.darBanho(cachorro1);
        System.out.println(cachorro1.getEstadoEspirito());

        petshop.darBanho(gato1);
        System.out.println(gato1.getEstadoEspirito());

        petshop.tosar(cachorro1);
        System.out.println(cachorro1.getEstadoEspirito());

        petshop.deixarHotel(passaro1);
        System.out.println(passaro1.getEstadoEspirito());

        cachorro1.soar();
        gato1.soar();
        passaro1.soar();
        
    }
}
