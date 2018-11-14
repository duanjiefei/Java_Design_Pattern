package Builder;

public class BuilderTest {
    public static void main(String[] args) {
            Computer computer = new Computer.ComputerBuilder().setCpu("i5处理器")
                    .setMemory("2G内存")
                    .setMainBoard("华硕主板")
                    .setDisplay("三星显示器")
                    .build();
            System.out.println(computer);
    }
}
