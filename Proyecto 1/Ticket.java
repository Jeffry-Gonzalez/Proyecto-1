package Proyecto1;

public class Ticket extends ColaServicio {
public int id;
public String problema;
public String estado;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProblema() {
        return problema;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setProblema(String problema) {
        this.problema = problema;

    }
}
