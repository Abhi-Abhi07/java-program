public class Boxprice extends BoxWeight{
    double cost;
    Boxprice(){
        super();
        this.cost=-1;
    }

    Boxprice(Boxprice other){
        super(other);
        this.cost=other.cost;
    }

    Boxprice(double l, double w, double h, double weight, double cost){
        super(l,w,h,weight);
        this.cost=cost;
    }

        Boxprice(double side , double weight, double cost){
        super(side,weight);
        this.cost=cost;
    }
}
