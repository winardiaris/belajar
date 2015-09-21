public class OptPembanding{
  public static void main(String[]args){
    int a,b,c,d,e,f;
    boolean aa,bb,cc,dd,ee,ff;

    a=5;b=6;c=3;d=9;e=8;f=2;
    
    aa= a==b;
    bb= b>c;
    cc= c<d;
    dd= d>=e;
    ee= e<=f;
    ff= b!=a;


    System.out.println("Apakah"+a+"=="+b+"? jawaban:"+aa); 
    System.out.println("Apakah"+b+">"+c+"? jawaban:"+bb); 
    System.out.println("Apakah"+c+"<"+d+"? jawaban:"+cc); 
    System.out.println("Apakah"+d+">="+e+"? jawaban:"+dd); 
    System.out.println("Apakah"+e+"<="+f+"? jawaban:"+ee); 
    System.out.println("Apakah"+b+"!="+a+"? jawaban:"+ff); 
   
  }
}
