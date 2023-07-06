public class niceCar {

    private engine Engine;
    private media player=new cdPlyer();

    public niceCar (){
        Engine=new powerEngine();
    }
    
    public niceCar(engine Engine){
        this.Engine=Engine;
    }

    public void start(){
        Engine.start();
    }

    public void stop(){
        Engine.stop();
    }

    public void acc(){
        Engine.acc();
    }    

    public void startMusic(){
        player.start();
    }

    public void stotMusic(){
        player.stop();
    }   

    public void upgradeEngine(){
        this.Engine=new electricEngine();
    }
}
