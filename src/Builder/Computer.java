package Builder;

public class Computer {
    private String cpu;
    private String mainBoard;
    private String memory;
    private String display;

    private Computer(ComputerBuilder builder){
        this.cpu = builder.cpu;
        this.mainBoard = builder.mainBoard;
        this.memory = builder.memory;
        this.display = builder.display;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "cpu='" + cpu + '\'' +
                ", mainBoard='" + mainBoard + '\'' +
                ", memory='" + memory + '\'' +
                ", display='" + display + '\'' +
                '}';
    }

    public static class ComputerBuilder{
        private String cpu;
        private String mainBoard;
        private String memory;
        private String display;
        public  ComputerBuilder setCpu(String cpu) {
            this.cpu = cpu;
            return this;
        }
        public ComputerBuilder setMainBoard(String mainBoard) {
            this.mainBoard = mainBoard;
            return this;
        }
        public ComputerBuilder setMemory(String memory) {
            this.memory = memory;
            return this;
        }
        public ComputerBuilder setDisplay(String display) {
            this.display = display;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }

    }
}
