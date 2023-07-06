public class a {
    public interface nestedInterfaces{
        boolean isOdd(int num);
    }
}

class b implements a.nestedInterfaces{
    public boolean isOdd(int num){
        return (num&1)==1;
    }
}
