class Segment {
    private double a;
    private double b;

    public Segment(double a, double b) {
        this.a = a;
        this.b = b;
    }

    private double segmentLong() {
        return Math.abs(this.b - this.a);
    }

    private static boolean segmentEquals(Segment s1, Segment s2) {
        return s1.segmentLong() == s2.segmentLong();
    }
}