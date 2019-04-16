package rocks.zipcode.io.objectorientation;

public class Television {

    private Integer channel;


    public void turnOn() {
        if(channel == null)
        throw new IllegalStateException();
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public TVChannel getChannel() {
        return TVChannel.getByOrdinal(this.channel);
    }
}
