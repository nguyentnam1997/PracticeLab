package lab3.entities;

import java.time.LocalDate;
import java.util.ArrayList;

public class History {
    private Worker worker;
    private String status;
    private LocalDate updated;

    public History(Worker worker, String status) {
        this.worker = worker;
        this.status = status;
        this.updated = LocalDate.now();
    }

    public Worker getWorker() {
        return worker;
    }

    public void setWorker(Worker worker) {
        this.worker = worker;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDate getUpdated() {
        return updated;
    }


}
