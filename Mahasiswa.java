class Mahasiswa {

	private String npm;
	private String nama;
	private float ipk;

	public Mahasiswa(String npm, String nama, float ipk){
		super()
		this.npm = npm;
		this.nama = nama;
		this.ipk = ipk;
	}

	public String getNama(){
		return nama;
	}

	public void setNama(String nama){
		this.nama = nama;
	}

	public String getNpm(){
		return npm;
	}

	public void setNpm(String npm){
		this.npm = npm;
	}

	public float getIpk(){
		return ipk;
	}

	public void setIpk(float ipk){
		this.ipk = ipk;
	}


}