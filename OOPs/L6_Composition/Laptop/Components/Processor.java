package OOPs.L6_Composition.Laptop.Components;

public class Processor {
    private String brand;
    private String series;
    private int generation;
    private int cores;
    private int threads;
    private String cacheMemory;
    private String frequency;
    private String minfrequency;
    private String maxfrequency;
    
    public Processor(String brand, String series, int generation, int cores, int threads, String cacheMemory,
            String frequency, String minfrequency, String maxfrequency) {
        this.brand = brand;
        this.series = series;
        this.generation = generation;
        this.cores = cores;
        this.threads = threads;
        this.cacheMemory = cacheMemory;
        this.frequency = frequency;
        this.minfrequency = minfrequency;
        this.maxfrequency = maxfrequency;
    }

    public Processor() {
        this.brand = "Intel";
        this.series = "1100u";
        this.generation = 11;
        this.cores = 4;
        this.threads = 4;
        this.cacheMemory = "5MB";
        this.frequency = "2.5 GHz";
        this.minfrequency = "2.4 GHz";
        this.maxfrequency = "3.2 GHz";
    }

    @Override
    public String toString() {
        return "Processor [brand=" + brand + ", series=" + series + ", generation=" + generation + ", cores=" + cores
                + ", threads=" + threads + ", cacheMemory=" + cacheMemory + ", frequency=" + frequency
                + ", minfrequency=" + minfrequency + ", maxfrequency=" + maxfrequency + "]";
    }

    public String getBrand() {
        return brand;
    }

    public String getSeries() {
        return series;
    }

    public int getGeneration() {
        return generation;
    }

    public int getCores() {
        return cores;
    }

    public int getThreads() {
        return threads;
    }

    public String getCacheMemory() {
        return cacheMemory;
    }

    public String getFrequency() {
        return frequency;
    }

    public String getMinfrequency() {
        return minfrequency;
    }

    public String getMaxfrequency() {
        return maxfrequency;
    }

}
