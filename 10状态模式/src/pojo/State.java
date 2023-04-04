package pojo;

public interface State {
    //投币
    void insertQuarter();

    //退回币
    void ejectQuarter();

    //转动曲柄
    void turnCrank();

    //发放糖果
    void dipense();


}
