/*Konsep inner class berbeda, karena sekarang class yang dideklarasikan di dalam class lain
(inner class). Inner class sangat terikat dengan class dimana inner class itu berada. Misalnya
dari sisi penamaan, nama inner class harus diawali dengan nama class dimana inner class
berada kemudian diikuti dengan nama inner class itu sendiri. Misalnya contoh di bawah ini : */
public class Person3{
  private class Person3a{}
  private static class person3b{}
  class person3c{}
}
