package dados;

public class Reserva {
    private int numReserva;
    private String dataVoo;
    private String horaVoo;
    private float preco;
    private String classeVoo;
    private boolean idaEVolta;
    private int poltrona;
    private Reserva volta;
    private Cidade origem;
    private Cidade destino;

    public int getNumReserva() {
        return numReserva;
    }
    public void setNumReserva(int numReserva) {
        this.numReserva = numReserva;
    }
    public String getDataVoo() {
        return dataVoo;
    }
    public void setDataVoo(String dataVoo) {
        this.dataVoo = dataVoo;
    }
    public Cidade getOrigem() {
        return origem;
    }
    public void setOrigem(Cidade origem) {
        this.origem = origem;
    }
    public Cidade getDestino() {
        return destino;
    }
    public void setDestino(Cidade destino) {
        this.destino = destino;
    }
    public String getHoraVoo() {
        return horaVoo;
    }
    public void setHoraVoo(String horaVoo) {
        this.horaVoo = horaVoo;
    }
    public float getPreco() {
        return preco;
    }
    public void setPreco(float preco) {
        this.preco = preco;
    }
    public String getClasseVoo() {
        return classeVoo;
    }
    public void setClasseVoo(String classeVoo) {
        this.classeVoo = classeVoo;
    }
    public boolean isIdaEVolta() {
        return idaEVolta;
    }
    public void setIdaeVolta(boolean idaEVolta){
        this.idaEVolta = idaEVolta;
    }
    public int getPoltrona() {
        return poltrona;
    }
    public void setPoltrona(int poltrona) {
        this.poltrona = poltrona;
    }
    public Reserva getVolta() {
        return volta;
    }
    public void setVolta(Reserva volta) {
        this.volta = volta;
    }
    public String toString(){
        String reserva = "";
        reserva += "Numero Reserva: " + this.numReserva + "\n";
        reserva += "Origem: " + this.origem.toString();
        reserva += "Destino: " + this.destino.toString();
        reserva += "Data do voo: " + this.dataVoo + "\n";
        reserva += "Hora do voo: " + this.preco + "\n";
        reserva += "Preco: " + this.preco + "\n";
        reserva += "Classe do voo: " + this.classeVoo + "\n";
        reserva += "Poltrona: " + this.poltrona + "\n";

        if(this.volta != null){
            reserva += this.volta.toString();
        }
        return reserva;
    }

}
