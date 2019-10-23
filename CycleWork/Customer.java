class Customer {
    private String kode_customer;
    private String nama_customer;
    private String nomor_telepon;

    public Customer() {
    }
    
    public Customer(String kode, String nama, String nomor_telepon) {
        this.kode_customer = kode;
        this.nama_customer = nama;
        this.nomor_telepon = nomor_telepon;
    }

    public String getKode_customer() {
        return kode_customer;
    }

    public void setKode_customer(String kode_customer) {
        this.kode_customer = kode_customer;
    }

    public String getNama_customer() {
        return nama_customer;
    }

    public void setNama_customer(String nama_customer) {
        this.nama_customer = nama_customer;
    }

    public String getNomor_telepon() {
        return nomor_telepon;
    }

    public void setNomor_telepon(String nomor_telepon) {
        this.nomor_telepon = nomor_telepon;
    }

    public void getInfo() {
        System.out.println("Kode \t\t : " + getKode_customer());
        System.out.println("Nama Customer \t : " + getNama_customer());
        System.out.println("Kontak Person \t : " + getNomor_telepon());
        System.out.println("-----------------------------------------");
    }
}