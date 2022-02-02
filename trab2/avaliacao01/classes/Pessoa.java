package classes;

public class Pessoa {
    public int Cpf;
    public int nome;

    public Pessoa(int nome2, int cPF2) {
    }

    public Pessoa(Integer nome2, int cPF2) {
    }

    public int getCpf() {
        return Cpf;
    }
    public void setCpf(int cpf) {
        Cpf = cpf;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        {
            
                return false;
        }
    }


    public int getNome() {
        return nome;
    }
    public void setNome(int nome) {
        this.nome = nome;
    }

    public int getModelo() {
        return 0;
    }
}
