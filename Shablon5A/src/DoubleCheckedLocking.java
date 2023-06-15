public class DoubleCheckedLocking {
    private static DoubleCheckedLocking INSTANCE;
    private DoubleCheckedLocking() {
    }
    public static synchronized DoubleCheckedLocking getInstance() {
        if (INSTANCE == null) {
            synchronized (DoubleCheckedLocking.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DoubleCheckedLocking();
                }
            }
        }
        return INSTANCE;
    }
}

