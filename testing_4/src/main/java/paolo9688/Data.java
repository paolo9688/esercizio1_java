package paolo9688;

import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;

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
        return "Data: " + data;
    }

    public Data plusYears(int plusYears) {
        return new Data(data.plusYears(plusYears));
    }

    public Data minusMonths(int minusMonths) {
        return new Data(data.minusMonths(minusMonths));
    }

    public Data plusDays(int plusDays) {
        return new Data(data.plusDays(plusDays));
    }

    public String formattedDate() {
        return data.format(DateTimeFormatter.ofPattern("dd MMMM yyyy"));
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
