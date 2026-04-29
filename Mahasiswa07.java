public class Mahasiswa07 {
  public String nim;
  public String nama;
  public String kelas;
  public int nilai;

  Mahasiswa07(){}

  Mahasiswa07(String nim, String nama, String kelas){
    this.nim=nim;
    this.nama=nama;
    this.kelas=kelas;
    nilai=-1;
  }

  void tugasDinilai(int nilai){
    this.nilai=nilai;
  }

}