package OOP_practice.questions;
//complex no--> a+ib

class Complex{
    int real;
    int img;
    public Complex() {
    real = 0;
    img = 0;
}

   public Complex(int real,int img){
    this.real=real;
    this.img=img;
   }

   public  Complex add(Complex c2){
    Complex res=new Complex();
    res.real=this.real+c2.real;
    res.img=this.img+c2.img;
    return res;
   }
  public Complex sub(Complex c2){
    Complex res = new Complex();

    res.real = this.real - c2.real;
    res.img  = this.img - c2.img;

    return res;
}
  public Complex mul(Complex c2){
    Complex res = new Complex();

    res.real = (this.real*c2.real)-(this.img*c2.img);

    res.img  = (this.real*c2.img)+(this.img*c2.real);

    return res;
}
   public void display(){
    if(real==0 && img!=0){
        System.out.println(img +"i");
    }else if(img==0 && real!=0){
        System.out.println(real);

    }else{
        System.out.println(real +"+"+img+"i");
    }
   }

    
}

public class practice1 {
    public static void main(String[] args){
         Complex c1=new Complex(4,3);
    Complex c2=new Complex(5,2);

    Complex c3=new Complex();
    c3=c1.add(c2);
    c3.display();
  
    c3=c1.sub(c2);
     c3.display();
    c3=c1.mul(c2);
     c3.display();


    }
   

    
}
