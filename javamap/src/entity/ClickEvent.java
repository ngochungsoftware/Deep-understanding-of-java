package entity;

public class ClickEvent {
    public String userId;
    public long timestamp;
    public String page;

    public ClickEvent(String userId, long timestamp, String page) {
        this.userId = userId;
        this.timestamp = timestamp;
        this.page = page;
    }

    @Override
    public String toString() {
        return userId + " clicked on " + page;
    }
}
