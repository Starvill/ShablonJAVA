package FabricPad;

public class LaptopFactory {
    public Laptop createLaptop(String channel) {
        if (channel == null || channel.isEmpty())
            return null;
        switch (channel) {
            case "DX10000":
                return new DX10000(45999);
            case "DX10010":
                return new DX10010(56899);
            case "DX20168":
                return new DX20168(78599);
            case "DX20345":
                return new DX20345(96899);
            default:
                throw new IllegalArgumentException("Unknown channel " + channel);
        }
    }
}
