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

    public boolean isBefore(Data other) {
        return this.data.isBefore(other.getData());
    }

    public boolean isAfter(Data other) {
        return this.data.isAfter(other.getData());
    }

    public boolean isEqual(Data other) {
        return this.data.isEqual(other.getData());
    }
}
