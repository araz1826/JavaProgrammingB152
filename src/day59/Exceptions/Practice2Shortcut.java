package day59.Exceptions;

import org.w3c.dom.ls.LSOutput;

public class Practice2Shortcut {     //Multiple exceptions: it gets up to down. whicj comes first, will print that
                            //one and skipp rets of the catches... then finally

    public static void main(String[] args) {
        String str=null;
        try{
            System.out.println(str.charAt(0));  //exceptions
        }catch (Exception e){  //1
            System.out.println("handeled in catch");
        }catch (Throwable b){  //2

        }finally {
            System.out.println("Finally");

        }
                                                    //Select it then ctrl+alt+t then eaasy way to do the try catch, automatically
        String name="";
        System.out.println(name.charAt(0));
    }

}
