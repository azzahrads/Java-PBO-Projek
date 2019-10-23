public class Program {
    /**
     * @param args the command line arguments
     */
    public static void main(String[]args){
        //dengan constructor tanpa parameter
        Customer cs = new Customer();
        cs.setKode_customer("CS001");
        cs.setNama_customer("Andre");
        cs.setNomor_telepon("0898 2819 1283");
        cs.getInfo();
        
        //class dan object dengan constructor dengan parameter
        Customer cs1 = new Customer("CS002", "Dude", "0878 9382 8409");
        cs1.getInfo();

        Pegawai pg1 = new Pegawai("PG001","Raihan","0823 8273 823","Sales");
        pg1.getInfo();

        Sepeda sp1 = new Sepeda("SPD1", "Thrill Ravage", "Thrill", 5000000);
        sp1.getInfo();

        //Untuk melakukan proses penjualan, data yang harus dimiliki adalah customer, pegawai dan sepeda
        Penjualan p1 = new Penjualan("JUAL1", pg1, cs1);
        DetailPenjualan dp1 = new DetailPenjualan(p1, sp1, 3);
        System.out.println("=========================================");
        System.out.println("             Data Penjualan              ");
        System.out.println("=========================================");
        dp1.printInfo();
    }
}