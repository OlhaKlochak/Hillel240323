package HomeTask9;

public enum Size {
    SMALL("S",80,170),MEDIUM("M",100,175),
    LARGE("L",110,180),EXTRA_LARGE("XL",120,185);

    Size(String sizeChart, int width, int length) {
        this.sizeChart = sizeChart;
        this.width = width;
        this.length = length;
    }

    private String sizeChart;
    private int width;
    private int length;

    public String getSizeChart() {
        return sizeChart;
    }

    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    @Override
    public String toString() {
        return "In this variant "+this.sizeChart+", size: width ="+this.width+", length="+this.length+".";
    }
}
