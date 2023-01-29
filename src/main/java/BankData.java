import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BankData {
    int id;
    String b_name_trans_union;

    public BankData(int id, String b_name_trans_union) {
        this.id = id;
        this.b_name_trans_union = b_name_trans_union;
    }

    public static void main(String[] args) {
        ArrayList<BankData> bankDataList = new ArrayList<>();

        List<BankData> banks = Arrays.asList(
                new BankData(1, "DE BOGOTA"),
                new BankData(2, "POPULAR"),
                new BankData(6, "ITAU CORPBANCACOLOMBIA S.A"),
                new BankData(7, "BANCOLOMBIA"),
                new BankData(8, "ABN AMRO BANK"),
                new BankData(9, "CITIBANK"),
                new BankData(10, "BANCO HSBC"),
                new BankData(12, "GNB SUDAMERIS"),
                new BankData(13, "BBVA COLOMBIA"),
                new BankData(14, "BANCO CORPBANCA -HELM"),
                new BankData(19, "SCOTIABANK COLPATRIA S.A."),
                new BankData(22, "BANCO UNION S.A."),
                new BankData(23, "DE OCCIDENTE"),
                new BankData(29, "BANCOTEQUENDAMA"),
                new BankData(32, "BCSC"),
                new BankData(34, "BANCO SUPERIOR"),
                new BankData(36, "MEGABANCO"),
                new BankData(40, "BANAGRARIO"),
                new BankData(48, "BANCO ALIADAS"),
                new BankData(50, "GRANBANCO"),
                new BankData(51, "DAVIVIENDA S.A."),
                new BankData(52, "AV VILLAS"),
                new BankData(53, "BANCO WWB S.A."),
                new BankData(54, "GRANAHORRAR"),
                new BankData(58, "BANCO PROCREDIT COLOMBIA S.A."),
                new BankData(59, "BANCAMIA S.A. BANCO DE LAS MIC"),
                new BankData(60, "BANCO PICHINCHA S.A."),
                new BankData(61, "BANCOOMEVA S.A."),
                new BankData(62, "BANCO FALABELLA S.A."),
                new BankData(63, "BANCO FINANDINA S.A"),
                new BankData(64, "BANCO MULTIBANK S.A."),
                new BankData(65, "BANCO SANTANDER DE NEGOCIOS CO"),
                new BankData(66, "BANCO COOPERATIVO COOPCENTRAL"),
                new BankData(67, "BANCOMPARTIR"),
                new BankData(69, "BANCO SERFINANSA S.A.")
        );

        for ( int i = 0; i < banks.size(); i ++
             ) {
            System.out.println("UPDATE col_bank SET b_name_trans_union = '"
                    + banks.get(i).b_name_trans_union + "' WHERE id =" + banks.get(i).id +  ";");
        }

    }
}
