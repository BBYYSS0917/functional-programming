/**
 * @author BaiJY
 * @date 2022/08/16
 **/
public class ThreadLocalTest {

    private ThreadLocal threadLocal = new ThreadLocal(){
        @Override
        protected String initialValue() {
            return String.valueOf(System.currentTimeMillis());
        }
    };

    public static void main(String[] args) {
        ThreadLocal<String> myThreadLocal = new ThreadLocal<>();
        myThreadLocal.set("aaaa");

        String value = myThreadLocal.get();
        System.out.println(value);


        ThreadLocal<String> threadLocal1 = ThreadLocal.withInitial(() -> String.valueOf(System.currentTimeMillis()));
    }
}
