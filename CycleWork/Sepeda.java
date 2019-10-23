class Sepeda {
    private String kode_Sepeda;
    private String nama;
    private String merk;
    private int harga;

    public Sepeda() {
    }

    public Sepeda(String kode_Sepeda, String nama, String merk, int harga) {
        this.kode_Sepeda = kode_Sepeda;
        this.nama = nama;
        this.merk = merk;
        this.harga = harga;
    }

    public String getKode_Sepeda() {
        return kode_Sepeda;
    }

    public void setKode_Sepeda(String kode_Sepeda) {
        this.kode_Sepeda = kode_Sepeda;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void getInfo() {
        System.out.println("Kode Sepeda \t : " + getKode_Sepeda());
        System.out.println("Nama Sepeda \t : " + getNama());
        System.out.println("Merk        \t : " + getMerk());
        System.out.println("Harga       \t : " + getHarga());
        System.out.println("-----------------------------------------");
    }
}