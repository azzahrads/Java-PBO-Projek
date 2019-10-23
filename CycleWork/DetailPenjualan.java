class DetailPenjualan extends Penjualan{
    private final int jumlah_sepeda;
    private final Sepeda spd;

    public DetailPenjualan(Penjualan p1, Sepeda spd, int jumlah_sepeda){
        super(p1);
        this.spd = spd;
        this.jumlah_sepeda = jumlah_sepeda;
    }

    public int hitung(){
        int harga = spd.getHarga();
        return harga * jumlah_sepeda;
    }
    
    @Override
    public void printInfo(){
        super.printInfo();
        System.out.println("Nama Sepeda    \t: " + spd.getNama());
        System.out.println("Harga Sepeda   \t: " + spd.getHarga());
        System.out.println("Jumlah Dibeli  \t: " + jumlah_sepeda);
        System.out.println("Total Harus Bayar: " + hitung());
    }
}
