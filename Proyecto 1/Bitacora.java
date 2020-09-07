package Proyecto1;

import java.util.Date;

public class Bitacora extends Ticket {
    public String nitSoporte;
    public Date fechahora;
    public String mensaje;

    public String getNitSoporte() {
        return nitSoporte;
    }

    public void setNitSoporte(String nitSoporte) {
        this.nitSoporte = nitSoporte;
    }

    public Date getFechahora() {
        return fechahora;
    }

    public void setFechahora(Date fechahora) {
        this.fechahora = fechahora;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

}
