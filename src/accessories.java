public interface accessories {
    void wear();
    double speedUp(double currentSpeed);

}

class Glove implements accessories{
    public void wear(){
        System.out.println("Wearing glove");
    }
    public double speedUp(double currentSpeed){
        return currentSpeed;
    }

}

class Sock implements accessories{
    public void wear(){
        System.out.println("Wearing Sock");
    }
    public double speedUp(double currentSpeed){
        return currentSpeed*2;
    }
}
