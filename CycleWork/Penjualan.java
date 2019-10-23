class Penjualan {
    private String kode_penjualan;
    private int total_harga ;
    private Pegawai pegawai;
    private Customer customer;
    
    //Melakukan Overloading, ini bisa dilihat penggunaan di DetailPenjualan line 17
    public Penjualan(Penjualan p){
        this.kode_penjualan = p.getKode_penjualan();
        this.total_harga = 0;
        this.pegawai = p.getPegawai();
        this.customer = p.getCustomer();
    };
    
    //Melakukan Overloading, penggunaan method yang ini dapat dilihat di Program line 36
    public Penjualan(String kode_penjualan, Pegawai pegawai, Customer customer) {
        this.kode_penjualan = kode_penjualan;
        this.total_harga = 0;
        this.pegawai = pegawai;
        this.customer = customer;
    }

    public String getKode_penjualan() {
        return this.kode_penjualan;
    }

    public void setKode_penjualan(String kode_penjualan) {
        this.kode_penjualan = kode_penjualan;
    }

    public Pegawai getPegawai() {
        return this.pegawai;
    }

    public void setPegawai(Pegawai pegawai) {
        this.pegawai = pegawai;
    }

    public int getTotal_harga() {
        return this.total_harga;
    }

    public void AddTotalHarga(int harga){
        this.total_harga += harga;
    }

    public Customer getCustomer() {
        return this.customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public void printInfo(){
        System.out.println("Kode Penjualan \t: " + kode_penjualan);
        System.out.println("Nama Customer  \t: " + customer.getNama_customer());
        System.out.println("Nama Pegawai   \t: " + pegawai.getNama_pegawai());
    }
}
