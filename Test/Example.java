package Test;

public class Example<T> {
    public T attr1;

    public Example(){};
    public Example(T attr){
        attr1 = attr;
    };

    public void setAttr(T a){
        attr1 = a;
    }
    public T getAttr(){
        return attr1;
    }
}
