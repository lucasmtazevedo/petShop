package Animais;

public class Cachorro extends Animal {
    //atributos
    static int numeroCachorros;

    private int tamanhoRabo;

    //construtores

    public Cachorro(String nome, String cor, int altura, double peso, int tamanhoRabo, String estadoEspirito) {
        super(nome, cor, altura, peso, estadoEspirito);
        this.tamanhoRabo = tamanhoRabo;
        numeroCachorros ++;
    }

    //metodos


    public static int getNumeroCachorros() {
        return numeroCachorros;
    }

    public static void setNumeroCachorros(int numeroCachorros) {
        Cachorro.numeroCachorros = numeroCachorros;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getTamanhoRabo() {
        return tamanhoRabo;
    }

    public void setTamanhoRabo(int tamanhoRabo) {
        this.tamanhoRabo = tamanhoRabo;
    }

    public String getEstadoEspirito() {
        return estadoEspirito;
    }


    public String pegar(){
        return "bolinha";
    }

    public String interagir(String acao) {

        switch (acao) {
            case "carinho": this.estadoEspirito = "feliz";
            break;
            case "dormir": this.estadoEspirito = "bravo";
            break;
            case "pisar": this.estadoEspirito = "triste";
            break;
            default: this.estadoEspirito = "nada";
        }
        return estadoEspirito;
    }

    @Override
    public String toString() {
        return "Cachorro{" +
                "nome='" + nome + '\'' +
                '}';
    }

    @Override
    public void soar() {
        System.out.println("Au au au");
    }
}

