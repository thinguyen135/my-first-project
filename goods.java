public class goods<T,K> {
    private K sumMoney;
    private T orderCode;

    public goods(T orderCode,K sumMoney){
        this.orderCode=orderCode;
        this.sumMoney=sumMoney;
    }
    public void output(){
        System.out.println(orderCode+"   "+sumMoney);
    }
}
