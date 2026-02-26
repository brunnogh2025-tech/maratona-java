package maratonajava.javacore.Oexception.runtime.test;

public class RuntimeExceptionTest01 {
    static void main(String[] args) {
        //Checked e Unchecked
        int[] nums = {1,2};
        System.out.println(nums[2]);//Vai lançar um RuntimeException (Unchecked)
    }
}

