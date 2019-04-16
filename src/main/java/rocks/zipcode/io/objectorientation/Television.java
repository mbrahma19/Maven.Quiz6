package rocks.zipcode.io.objectorientation;

public class Television {
    private Boolean power;
    private TVChannel currentChannel;

    public Television(){
        this.power = false;
        this.currentChannel = null;
    }
    public void turnOn() {
        this.power = true;
    }

    public void setChannel(Integer channel) throws IllegalStateException{
        if(power){
            this.currentChannel = TVChannel.getByOrdinal(channel);
        }else{
            throw new IllegalStateException();
        }
    }

    public TVChannel getChannel() throws IllegalStateException{
        if(power){
            return currentChannel;
        }else{
            throw new IllegalStateException();
        }
    }
}
