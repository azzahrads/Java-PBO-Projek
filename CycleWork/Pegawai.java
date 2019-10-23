class Pegawai {
    private String kode_pegawai;
    private String nama_pegawai;
    private String nomor_telepon;
    private String jabatan;

    public Pegawai(String kode_pegawai, String nama_pegawai, String nomor_telepon, String jabatan) {
        this.kode_pegawai = kode_pegawai;
        this.nama_pegawai = nama_pegawai;
        this.nomor_telepon = nomor_telepon;
        this.jabatan = jabatan;
    }

    public String getKode_pegawai() {
        return kode_pegawai;
    }

    public void setKode_pegawai(String kode_pegawai) {
        this.kode_pegawai = kode_pegawai;
    }

    public String getNama_pegawai() {
        return nama_pegawai;
    }

    public void setNama_pegawai(String nama_pegawai) {
        this.nama_pegawai = nama_pegawai;
    }

    public String getNomor_telepon() {
        return nomor_telepon;
    }

    public void setNomor_telepon(String nomor_telepon) {
        this.nomor_telepon = nomor_telepon;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public void getInfo() {
        System.out.println("Kode Pegawai \t : " + getKode_pegawai());
        System.out.println("Nama Pegawai \t : " + getNama_pegawai());
        System.out.println("Kontak Person \t : " + getNomor_telepon());
        System.out.println("-----------------------------------------");
    }
}