package day37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class ten {
    public static void main(String[] args) {


    }
    public boolean validateTask(boolean notEmpty,int taskId,int currentId) {
if(notEmpty==true && (currentId+1)==taskId){
    return true;
}else{
    return false;
}

    }
}
/*validateTask(true,2,1)
returns true*/