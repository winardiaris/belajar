class Sepeda{
  int kecepatan = 0;
  int gear = 0;

  void ubahGear(int pertambahanGear){
    gear = gear+pertambahanGear;
    System.out.println("Gear:"+gear);
  }

  void tambahKecepatan(int pertambahanKecepatan){
    kecepatan = kecepatan+pertambahanKecepatan;
    System.out.println("Kecepatan:"+kecepatan);
  }
}
