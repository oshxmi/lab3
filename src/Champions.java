import java.util.ArrayList;

public class Champions {

    private ArrayList<Partido> listaPartidosOctavos;
    private ArrayList<Partido> listaPartidosCuartos;
    private ArrayList<Partido> listaPartidosSemis;
    private String partidoFinal;

    public ArrayList<Partido> getListaPartidosOctavos() {
        return listaPartidosOctavos;
    }

    public void setListaPartidosOctavos(ArrayList<Partido> listaPartidosOctavos) {
        this.listaPartidosOctavos = listaPartidosOctavos;
    }

    public ArrayList<Partido> getListaPartidosCuartos() {
        return listaPartidosCuartos;
    }

    public void setListaPartidosCuartos(ArrayList<Partido> listaPartidosCuartos) {
        this.listaPartidosCuartos = listaPartidosCuartos;
    }

    public ArrayList<Partido> getListaPartidosSemis() {
        return listaPartidosSemis;
    }

    public void setListaPartidosSemis(ArrayList<Partido> listaPartidosSemis) {
        this.listaPartidosSemis = listaPartidosSemis;
    }

    public String getPartidoFinal() {
        return partidoFinal;
    }

    public void setPartidoFinal(String partidoFinal) {
        this.partidoFinal = partidoFinal;
    }
}
