public class Single {
    private volatile static Single uniqueSingle;

    private Single() {
    }

    public Single getInstance(){
        if(uniqueSingle==null){
            //保证只有第一次是加锁的，其余次数不变
            synchronized (Single.class){
                if(uniqueSingle==null){
                    uniqueSingle =  new Single();
                }
            }
        }
        return  uniqueSingle;
    }
}
