package day43;

public class Coffee1 {

    private String type;
    private int caffeinlevel;
    private double price;

    public Coffee1(){
        //System.out.println();
    }
    public Coffee1(String type, int caffeinlevel){
        this.type=type;    //there are 2 type and caffeinlevel 1 top 1 here, put this method to understand the top.
        this.caffeinlevel=caffeinlevel;
    }
    //create 3 args constructor
    //do not let the price go below zero,
    //if it is less than zero make it 1$
  public Coffee1(String type,int caffeinlevel, double price ) {
      this.type=type;
      this.caffeinlevel=caffeinlevel;
      if(price<=0){
          this.price=1;
      }else{
          this.price=price;
      }


  }


}
