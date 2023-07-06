public class BoxWeight extends Box{

    double weight;

    BoxWeight(){
        this.weight=-1;
    }

    BoxWeight(BoxWeight other){
        super(other);
        weight=other.weight;
    }

    BoxWeight(double l, double w, double h, double weight){
        super(l,w,h);//what is this? // call the parent class constructor
        //use initialize values present in parents class
        this.weight=weight;

        // System.out.println(this.w);
        // System.out.println(super.w);//2nd super key
        
    }

    BoxWeight(double side, double weight){
        super(side);
        this.weight=weight;
    }
    
}
