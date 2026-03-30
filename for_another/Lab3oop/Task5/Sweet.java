class Sweet implements Comparable<Sweet> {
    String name;
    double weight;

    Sweet(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public int compareTo(Sweet s) {
        return Double.compare(this.weight, s.weight);
    }

    public String toString() {
        return name + " " + weight;
    }
}   