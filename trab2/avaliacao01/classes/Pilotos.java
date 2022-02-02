package classes;

public class Pilotos extends Pessoa {
    public Pilotos(int nome2, int cPF2) {
        super(nome2, cPF2);
        
    }
    private int matricula;
    private int breve;

    private Aeronave av1;


    public Pilotos(Integer nome2, int cPF2, int matricula, int breve, Aeronave av1) {
        super(nome2, cPF2);
        this.matricula = matricula;
        this.breve = breve;
        this.av1 = av1;
    }

    public int getMatricula() {
        return matricula;
    }
    public Aeronave getAv1() {
        return av1;
    }
    public void setAv1(Aeronave av1) {
        this.av1 = av1;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public int getBreve() {
        return breve;
    }
    public void setBreve(int breve) {
        this.breve = breve;
    }
    

}
