package OOPs.L6_Composition.Laptop;

import OOPs.L6_Composition.Laptop.Components.GraphicsCard;
import OOPs.L6_Composition.Laptop.Components.Processor;

public class Laptop {

    private float screen;
    private Processor processor;
    private String ram;
    private String hardDrive;
    private GraphicsCard graphicsCard;
    private String opticalDrive;
    private String keyboard;
    
    public Laptop() {
        this.screen = 16.5f;
        this.processor = new Processor();
        this.ram = "16 GB";
        this.hardDrive = "1 TB";
        this.graphicsCard = new GraphicsCard();
        this.opticalDrive = "Mutli Layer";
        this.keyboard = "Backlit";
    }

    public Laptop(float screen, Processor processor, String ram, String hardDrive, GraphicsCard graphicsCard,
            String opticalDrive, String keyboard) {
        this.screen = screen;
        this.processor = processor;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.graphicsCard = graphicsCard;
        this.opticalDrive = opticalDrive;
        this.keyboard = keyboard;
    }

    @Override
    public String toString() {
        return "Laptop [screen=" + screen + ", processor=" + processor + ", ram=" + ram + ", hardDrive=" + hardDrive
                + ", graphicsCard=" + graphicsCard + ", opticalDrive=" + opticalDrive + ", keyboard=" + keyboard + "]";
    }
    //Getters to show specific value
    public float getScreen() {
        return screen;
    }

    public Processor getProcessor() {
        return processor;
    }

    public String getRam() {
        return ram;
    }

    public String getHardDrive() {
        return hardDrive;
    }

    public GraphicsCard getGraphicsCard() {
        return graphicsCard;
    }

    public String getOpticalDrive() {
        return opticalDrive;
    }

    public String getKeyboard() {
        return keyboard;
    }
    
}