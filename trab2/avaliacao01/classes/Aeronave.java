package classes;

public class Aeronave extends Pessoa {
    public int modelo;
    public int categoria;

    private Pilotos p2;

    public Aeronave(int nome2, int cPF2, int modelo, int categoria, Pilotos p2) {
        super(nome2, cPF2);
        this.modelo = modelo;
        this.categoria = categoria;
        this.p2 = p2;
    }
    public Aeronave(Integer nome2, int cPF2, int modelo, int categoria, Pilotos p2) {
        super(nome2, cPF2);
        this.modelo = modelo;
        this.categoria = categoria;
        this.p2 = p2;
    }
    public int getModelo() {
        return modelo;
    }
    public Pilotos getP2() {
        return p2;
    }
    public void setP2(Pilotos p2) {
        this.p2 = p2;
    }
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }
    public int getCategoria() {
        return categoria;
    }
    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }
}
