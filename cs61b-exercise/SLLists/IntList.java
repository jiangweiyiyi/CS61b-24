/**
 * @author luo
 * @version 1.0
 */

/**
 * 创建一个链表数据结构
 * 两个属性first和rest
 * 其中first规定为int， 而rest则为该类
 * 并为该类创建相应的构造方法
 */
public class IntList {

    int first;
    IntList rest;

    public IntList(int first, IntList rest) {
        this.first = first;
        this.rest = rest;
    }

    //创建一个size方法，返回链表长度--递归
    public int size() {
        //用递归结构，考虑基本情况
        if (this.rest == null) {
            return 1;
        }
        return 1 + this.rest.size();
    }

    //--迭代
    public int iterativeSize() {
        IntList point = this;
        int totalPoint = 0;
        while (point != null) {
            totalPoint += 1;
            point = point.rest;
        }
        return totalPoint;
    }
    //returns the ith value in this list
    public int get(int i){
        if(i == 0){
            return this.first;
        }
        return this.rest.get(i - 1);
    }

    @Override
    public String toString() {
        return "IntList{" +
                "first=" + first +
                ", rest=" + rest +
                '}';
    }

    public static void main(String[] args) {
        //创建链表实例
        //表达一
//        IntList L = new IntList(1, null);
//        L = new IntList(2, L);
//        L = new IntList(3, L);
//        System.out.println(L);
//        System.out.println(L.size());
        //表达二
        System.out.println("------------------------");
        IntList list = new IntList(15, null);
        list.rest = new IntList(10, null);
        list.rest.rest = new IntList(5, null);
        System.out.println(list);
        System.out.println(list.iterativeSize());
        System.out.println(list.get(0));
        list.get(3);

    }
}
