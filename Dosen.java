class Dosen {

	private String nama;
	private String matkul;

	public Dosen(String nama, String matkul){
		this.nama = nama;
		this.matkul = matkul;
	}

	public String getNama(){
		return nama;
	}

	public void setNama(String nama){
		this.nama = nama;
	}

	public String getMatkul(){
		return matkul;
	}

	public void setMatkul(String matkul){
		this.matkul = matkul;
	}
}