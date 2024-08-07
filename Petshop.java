package Lojas;
import Animais.Animal;
import Animais.Cachorro;

public class Petshop {

    public void darBanho(Animal animal){
        animal.setEstadoEspirito("limpo");
    }

    public void tosar(Cachorro cachorro){
        cachorro.setEstadoEspirito("Tosado");
    }

    public void deixarHotel (Animal animal){
        animal.setEstadoEspirito("Ficou triste");
    }
}
