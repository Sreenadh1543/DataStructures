public class Child extends Parent {

    @Override
    public Object test(Object inta){
        return null;
    }

    @Override
    public Object test(Object a ,Object  b){
        return null;
    }

    @Override
    public Object test1(int inta){
        return null;
    }

    @Override
    protected Object test2(Object inta,Object intb){
        return null;
    }
    @Override
    public Object test3(Object inta){
        return null;
    }


    /**
     * Method Access Specifier
     *     1) Over ridden Method Can have higher access than parent method
     *
     *  Parameters
     *    1) Parameters should be same Type even Child types not allowed
     *
     *  Return types
     *    1) Return type can be of child type
     *
     *  Optional Specifiers
     *    1) Final Method can not be over ridden
     *    2) Static Method can not be over ridden
     *
     *    Abstract method can not be static or final
     *
     *    
     */




}
