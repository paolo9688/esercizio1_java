package paolo9688;

import java.time.OffsetDateTime;

public class Data {
    private OffsetDateTime data;

    public Data(OffsetDateTime data) {
        this.data = data;
    }

    public OffsetDateTime getData() {
        return data;
    }

    public void setData(OffsetDateTime data) {
        this.data = data;
    }

    public String toString() {
        return "Data{" +
                "data=" + data +
                '}';
    }

    public int getYear() {
        return data.getYear();
    }

    public int getMonthValue() {
        return data.getMonthValue();
    }

    public int getDayOfMonth() {
        return data.getDayOfMonth();
    }

    public String getDayOfWeek() {
        return data.getDayOfWeek().toString();
    }
}
