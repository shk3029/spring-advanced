package hello.advanced.trace;

public class TraceStatus {

    private TraceId traceId;
    private Long startTimeMs;
    private String meesage;

    public TraceStatus(TraceId traceId, Long startTimeMs, String meesage) {
        this.traceId = traceId;
        this.startTimeMs = startTimeMs;
        this.meesage = meesage;
    }

    public TraceId getTraceId() {
        return traceId;
    }

    public Long getStartTimeMs() {
        return startTimeMs;
    }

    public String getMeesage() {
        return meesage;
    }
}
