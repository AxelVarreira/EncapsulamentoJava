package madvisionary.company;

public class ControleRemoto implements Controlador {
    //atributos / attributes
    private int volume;
    private boolean ligado, tocando;
    //special methods / metodos especiais

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public boolean getLigado() {
        return ligado;
    }

    public boolean getTocando() {
        return tocando;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    //metodos abstratos / abstract methods
    @Override
    public void ligar() {
        System.out.println("ligando!");
        this.setLigado(true);
    }

    @Override
    public void delisgar() {
        System.out.println("Desligando...");
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("======MENU======");
        System.out.println("Está ligado? "+this.getLigado());
        System.out.println("Está tocando? "+this.getTocando());
        System.out.print("Volume: "+this.getVolume()+"  ");
        for(int i = 0; i<=this.getVolume(); i+=5){
            System.out.print("|");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("\nFechando menu...");
    }

    @Override
    public void maisVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume()+5);
            System.out.println("\nAumentando volume!");
            System.out.print("volume: "+this.getVolume()+"  ");
            for(int i=0; i<=this.getVolume(); i+=5){
                System.out.print("|");
            }
            System.out.println("\n");
        }
    }

    @Override
    public void menosVolume() {
        if(this.getLigado()){
            this.setVolume(this.getVolume()-5);
            System.out.println("\nDiminuindo volume!");
            System.out.print("volume: "+this.getVolume()+"  ");
            for(int i=0; i<=this.getVolume(); i+=5){
                System.out.print("|");
            }
            System.out.println("\n");
        }
    }

    @Override
    public void ligarMudo() {
        if(this.getLigado() && this.getVolume()>0){
            System.out.println("\nLigando mudo!");
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if(this.getLigado() && this.getVolume()==0){
            System.out.println("\nDelisgando mudo!");
            this.setVolume(50);
        }
    }

    @Override
    public void play() {
        if(this.getLigado() && !(this.getTocando())){
            System.out.println("\nTocando!");
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if(this.getLigado() && this.getTocando()){
            System.out.println("\nParando musica...");
            this.setTocando(false);
        }
    }




}
