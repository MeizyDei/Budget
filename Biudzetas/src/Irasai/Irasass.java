package Irasai;

import java.time.LocalDateTime;

public class Irasass {

    private long id;
    private double sum;
    private LocalDateTime localDateTime;
    private String papildomaInfo;

    public Irasass(long id, double sum, LocalDateTime localDateTime, String papildomaInfo) {
        this();
        this.id = id;
        this.sum = sum;
        this.localDateTime = localDateTime;
        this.papildomaInfo = papildomaInfo;
    }

    public Irasass() {

    }


    @Override
    public String toString() {
        return "Irasass{" +
                "id=" + id +
                ", sum=" + sum +
                ", localDateTime=" + localDateTime +
                ", papildomaInfo='" + papildomaInfo + '\'' +
                '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    public LocalDateTime getLocalDateTime() {
        return localDateTime;
    }

    public void setLocalDateTime(LocalDateTime localDateTime) {
        this.localDateTime = localDateTime;
    }

    public String getPapildomaInfo() {
        return papildomaInfo;
    }

    public void setPapildomaInfo(String papildomaInfo) {
        this.papildomaInfo = papildomaInfo;
    }
}
