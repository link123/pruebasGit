import java.util.ArrayList;

class ListaMixta {
    private ArrayList<Object> elementos;

    public ListaMixta() {
        elementos = new ArrayList<Object>();
    }

    public void agregarElemento(Object elemento) {
        elementos.add(elemento);
    }

    public void imprimirLista() {
        for (Object elemento : elementos) {
            System.out.println(elemento);
        }
    }

    public static void main(String[] args) {
        ListaMixta lista = new ListaMixta();
        lista.agregarElemento(1);
        lista.agregarElemento("Hola");
        lista.agregarElemento(new Persona("Diego","Ruiz", 40));
        lista.agregarElemento("Matematicas");
      //  lista.imprimirLista();

        String[] list_of_strings = {"messageQrTransportCriteria15", "messageQrTransportCriteria1819", "messageQrTransportCriteria2021", "messageQrTransportCriteria2223", "messageQrTransportCriteria2425", "messageQrTransportCriteria29", "messageQrTransportCriteria30", "messageQrTransportCriteria31", "messageQrTransportCriteria32", "messageQrTransportCriteria33", "messageQrTransportCriteria38", "messageQrTransportCriteria3940", "messageQrTransportCriteria41", "messageQrTransportCriteria4243", "messageQrTransportCriteria44", "messageQrTransportCriteria45", "messageQrTransportCriteria4647", "messageQrTransportCriteria48", "messageQrTransportCriteria63", "messageQrTransportCriteria64", "messageQrTransportCriteria65", "messageQrTransportCriteria6667", "messageQrTransportCriteria6869", "messageQrTransportCriteria7071", "messageQrTransportCriteria7273", "messageQrTransportCriteria7475", "messageQrTransportCriteria7677", "messageQrTransportCriteria8081", "messageQrTransportCriteria98", "messageQrTransportCriteria99", "messageQrTransportCriteria100", "messageQrTransportCriteria101102", "messageQrTransportCriteria103", "paramQrTransportFlagAddtionalTicket", "paramQrTransportFlagAllowTravelOnCredit", "paramQrTransportMaxNumberTripsPending", "paramQrTransportMinIntegrationCharge", "paramQrTransportMaxIntegratedQr"};

        for(int i=0; i<list_of_strings.length; i++){
            String originalString = list_of_strings[i];
            String firstLetter = originalString.substring(0, 1).toUpperCase();
            String restLetters = originalString.substring(1);
            list_of_strings[i] = ".with"+ firstLetter + restLetters + "(verifyObjectMapDB(mapParametersDB,\"" + originalString + "\"))"
           ;
        }

        for(int i=0; i<list_of_strings.length; i++){
            System.out.println(list_of_strings[i]);
        }


    }
}
